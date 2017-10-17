package manav_panchal_assign_3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLogger.setDebugValue(4);
		Airport a = new Airport();
		
		String line = null;
		FileProcessor fp = new FileProcessor("C:\\Users\\MANAV\\Desktop\\input.txt");
		while((line = fp.readLine()) != null){
			
			a.calculate_risk(line);
			a.tightenOrLoosenSecurity();
		}
		
	
	}

}
