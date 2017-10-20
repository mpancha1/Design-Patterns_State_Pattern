package airportSecurityState.airportStates;
import  airportSecurityState.util.Airport;
import  airportSecurityState.util.Helper;
import  airportSecurityState.util.MyLogger;

public class Moderate_Risk_State implements AirportStateI {

	Airport airport;
	Helper helper;
	
	public Moderate_Risk_State(Airport airportA,Helper Helper) {
		// TODO Auto-generated constructor stub
	MyLogger.writeMessage("Setting Up Moderate Risk State", MyLogger.DebugLevel.CONSTRUCTOR);
	airport = airportA;
	helper = Helper;
	}
	
	
	

	@Override
	public String securityOperations() {
		// TODO Auto-generated method stub
		return("2 3 5 8 9");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return ("State = MODERATE_RISK");
		
	}



	@Override
	public void tightenOrLoosenSecurity(String line) {
		// TODO Auto-generated method stub
		helper.calculate_risk(line);
		
		if(helper.getAvg_traffic_per_day() >= 8  ||helper.getAvg_prohibited_items_per_day()>= 2){
			
			airport.setState(airport.getHigh_risk());
			
		}else if((helper.getAvg_traffic_per_day() < 8 && helper.getAvg_traffic_per_day() >= 4) ||(helper.getAvg_prohibited_items_per_day()< 2 && helper.getAvg_prohibited_items_per_day() >= 1)){
			
			
			
		}
		
		else if ((helper.getAvg_traffic_per_day() < 4 && helper.getAvg_traffic_per_day() >= 0) ||(helper.getAvg_prohibited_items_per_day()< 1 && helper.getAvg_prohibited_items_per_day() >= 0)){
			
			airport.setState(airport.getLow_risk());
		
		}	
		}




	
	

}
