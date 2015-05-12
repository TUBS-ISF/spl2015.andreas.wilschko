import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import net.sf.json.JSONObject;

public class ServiceConfigurationBuilder {

	private static String[] argsCopy;

	private enum configOptions {
		Create_Account, unsaved, unsecure, two_Persons
	}

	static JSONObject configurationJSON = new JSONObject();

	public static void main(String[] args) {
		argsCopy = args;
		if (args.length == 0) {
			System.out.println("You didn't add any arguments. Retry!");
			System.exit(0);
		}
	}

	/**
	 * this method builds the file that contains the Informations about active
	 * features
	 */
	private void createConfig() {
		for(int i=0;i<argsCopy.length;i++){
				configurationJSON.put(argsCopy[i],"true");
		}
		createOutputFile(configurationJSON.toString());
	}

	private boolean createOutputFile(String configOutput) {
		File configOutputFile = new File ("config.json");
		boolean successfullyWritten=false;
		try {
			FileWriter fileWriter = new FileWriter(configOutputFile,false);
			fileWriter.append(configOutput);
			fileWriter.flush();
			successfullyWritten=true;
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return successfullyWritten;
	}

}
