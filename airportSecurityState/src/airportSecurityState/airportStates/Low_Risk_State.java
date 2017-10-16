package manav_panchal_assign_3;

public class Low_Risk_State implements AirportStateI {

	Airport airport;
	
	public Low_Risk_State(Airport airportA) {
		// TODO Auto-generated constructor stub
		airport  = airportA;	
				}
	
	

	@Override
	public void securityOperations() {
		// TODO Auto-generated method stub
		System.out.println("1 3 5 7 9");
	}



	@Override
	public void tightenOrLoosenSecurity() {
		// TODO Auto-generated method stub
		
		if((airport.getAvg_traffic_per_day() < 8 && airport.getAvg_traffic_per_day() >= 4) ||(airport.getAvg_prohibited_items_per_day()< 2 && airport.getAvg_prohibited_items_per_day() >= 1)){
			
			airport.setState(airport.getModerate_risk());
			
		}	
		
		
		
		
		
		
	}

	
	

}
