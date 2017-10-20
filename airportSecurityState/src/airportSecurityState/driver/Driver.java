package airportSecurityState.driver;
import airportSecurityState.util.FileProcessor;
import airportSecurityState.util.Airport;
import airportSecurityState.util.Results;
import airportSecurityState.util.MyLogger;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args[2] != " "){
		int debugval = Integer.parseInt(args[2]);
		if(debugval < 5 && debugval >= 0){
		MyLogger.setDebugValue(debugval);
		}else{
			
			System.err.println("Invalid Debug Value");
		}
		}
		Results r = new Results(args[1]);
		Airport a = new Airport(r);
		String line = null;
		FileProcessor fp = new FileProcessor(args[0]);
		while((line = fp.readLine()) != null){
			
			a.tightenOrLoosenSecurity(line);
			
		}
		
	
	}

}
