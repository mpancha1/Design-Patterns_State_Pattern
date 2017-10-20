package airportSecurityState.airportStates;
import  airportSecurityState.util.Airport;
import  airportSecurityState.util.Helper;
import  airportSecurityState.util.MyLogger;


public class High_Risk_State implements AirportStateI {
Airport airport;
Helper helper;
public High_Risk_State(Airport airportA, Helper Helper) {

	// TODO Auto-generated constructor stub
	MyLogger.writeMessage("Setting Up High Risk State", MyLogger.DebugLevel.CONSTRUCTOR);
	airport = airportA;
	helper = Helper;
}


	@Override
	public String securityOperations() {
		// TODO Auto-generated method stub
		return("2 4 6 8 10");
	}


	@Override
	public void tightenOrLoosenSecurity(String line) {
		// TODO Auto-generated method stub
		
		helper.calculate_risk(line);
if(helper.getAvg_traffic_per_day() >= 8  ||helper.getAvg_prohibited_items_per_day()>= 2){
			
			
			
		}
else if((helper.getAvg_traffic_per_day() < 8 && helper.getAvg_traffic_per_day() >= 4) ||(helper.getAvg_prohibited_items_per_day()< 2 && helper.getAvg_prohibited_items_per_day() >= 1)){
			
			airport.setState(airport.getModerate_risk());
			
		}
	}


	
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return("State = High_Risk");
			
		}
	
}
