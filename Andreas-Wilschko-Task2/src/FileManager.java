import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FileManager {

	/**
	 * this method writes the mode of the active features to a configuration JSON-File
	 * 
	 * @param configOutput a String containing the configurations as JSON-String
	 * 
	 * @return returns tru if writing was successful
	 */
	public boolean createConfigOutputFile(String configOutput) {
		File configOutputFile = new File("config.json");
		boolean successfullyWritten = false;
		try {
			FileWriter fileWriter = new FileWriter(configOutputFile, false);
			fileWriter.append(configOutput);
			fileWriter.flush();
			successfullyWritten = true;
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return successfullyWritten;
	}
	
	/**
	 * this method checks if the file has been created yet if a configuration is desired
	 * 
	 * @return the boolean if the configurations have been made yet
	 */
	public boolean isConfigured(){
		return new File("config.json").exists();
	}
	
	/**
	 * this method reads the saved configurations from a JSON-File and returns the configurations as JSON-String
	 * 
	 * @return String containing JSON-coded informations
	 */
	public String readConfigFile() {
		File configOutputFile = new File("config.json");
		boolean successfullyWritten = false;
		StringBuffer fileContent=null;
		try {
			FileReader fileReader = new FileReader(configOutputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String tempLine;
			while((tempLine=bufferedReader.readLine())!=null){
				fileContent.append(tempLine);
			}
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileContent.toString();
	}
	
	public boolean hasAccountPaticipatedYet(String accountName, String conversationID){
		File personalConversationHistory =null;
		boolean hasPaticipated=false;
			personalConversationHistory=new File(accountName+".conversations.json");
			try {
				
				FileReader fileReader = new FileReader(personalConversationHistory);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String temp;
				StringBuffer jsonArrayAsString= new StringBuffer() ;
				while ((temp=bufferedReader.readLine())!=null){
					jsonArrayAsString.append(temp);
				}
					
				JSONArray conversations = new JSONArray(jsonArrayAsString.toString());
				
				for(int i=0;i<conversations.length();i++){
					JSONObject conversationsEntry = conversations.getJSONObject(i);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return hasPaticipated;
	}
	
	public void saveParticipationInConversation(String[] participants, String conversationID){
		File personalConversationHistory =null;
		for(int i=0;i<participants.length;i++){
			personalConversationHistory=new File(participants[i]+".conversations.json");
			try {
				FileWriter fileWriter = new FileWriter(personalConversationHistory);
				BufferedWriter
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public boolean saveConversation(String[] accountsTakingPart, String message){
		
		boolean successfullyWritten = false;
		
		
		return successfullyWritten;
	}
	
}
