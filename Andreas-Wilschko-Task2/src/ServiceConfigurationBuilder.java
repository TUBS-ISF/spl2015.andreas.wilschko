import net.sf.json.JSONObject;



public class ServiceConfigurationBuilder {
	
	private enum configOptions{
		BuildOption,Create_Account,unsaved,unsecure,two_Persons
	}

	static JSONObject configurationJSON = new JSONObject();
	public static void main(String[] args){
		if(args.length==1){
			configurationJSON.put("BuildOption",args[0]);
		}
	}
	
	private void configServerAndClient(){
		
	}
	
	private void configClient(){
		
	}
	
	private createOutputFile(){
		
	}
	
	
}

