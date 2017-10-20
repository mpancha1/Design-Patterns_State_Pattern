package airportSecurityState.airportStates;
import  airportSecurityState.util.Airport;
import  airportSecurityState.util.Helper;
import  airportSecurityState.util.MyLogger;

public class Low_Risk_State implements AirportStateI {

	Airport airport;
	Helper helper;
	
	public Low_Risk_State(Airport airportA,Helper Helper) {
		// TODO Auto-generated constructor stub
		MyLogger.writeMessage("Setting Up Low Risk State", MyLogger.DebugLevel.CONSTRUCTOR);
		airport  = airportA;
		helper = Helper;
				}
	
	

	@Override
	public String securityOperations() {
		// TODO Auto-generated method stub
		return("1 3 5 7 9");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("State = LOW_RISK");
		
	}

	@Override
	public void tightenOrLoosenSecurity(String line) {
		// TODO Auto-generated method stub
		
		helper.calculate_risk(line);
		
		if((helper.getAvg_traffic_per_day() < 8 && helper.getAvg_traffic_per_day() >= 4) ||(helper.getAvg_prohibited_items_per_day()< 2 && helper.getAvg_prohibited_items_per_day() >= 1)){
			
			airport.setState(airport.getModerate_risk());
			
		}	
		
		
		
		
		
		
	}



	

	
	

}
