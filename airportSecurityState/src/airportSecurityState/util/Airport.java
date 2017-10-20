package airportSecurityState.util;
import  airportSecurityState.airportStates.High_Risk_State;
import  airportSecurityState.airportStates.Low_Risk_State;
import  airportSecurityState.airportStates.Moderate_Risk_State;
import  airportSecurityState.airportStates.AirportStateI;


public class Airport {

	
	private AirportStateI High_risk;
	private AirportStateI Moderate_risk;
	private AirportStateI Low_risk;
	private Results results;
	public AirportStateI state;
	
	
	public Airport(Results result) {
		// TODO Auto-generated constructor stub
		
		Helper helper = new Helper();
		High_risk = new High_Risk_State(this,helper);
		Moderate_risk = new Moderate_Risk_State(this,helper);
		Low_risk = new Low_Risk_State(this,helper);
		state = Low_risk;
		results = result;
		
		MyLogger.writeMessage("Deciding Airport State", MyLogger.DebugLevel.CONSTRUCTOR);
		
	}
	

	 public void setState(AirportStateI stateA){
		
		state = stateA;
		MyLogger.writeMessage(""+state.toString(), MyLogger.DebugLevel.IN_RUN);
	}
	 public void  tightenOrLoosenSecurity(String line){

		
		state.tightenOrLoosenSecurity(line);
		MyLogger.writeMessage(state.securityOperations(), MyLogger.DebugLevel.FROM_RESULTS);
		results.writeToFile(state.securityOperations());
	}
	

	public AirportStateI getHigh_risk() {
		return High_risk;
	}



	public AirportStateI getModerate_risk() {
		return Moderate_risk;
	}

	

	public AirportStateI getLow_risk() {
		return Low_risk;
	}

	
	
}
