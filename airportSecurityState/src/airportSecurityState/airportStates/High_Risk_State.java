package manav_panchal_assign_3;

public class High_Risk_State implements AirportStateI {
Airport airport;

public High_Risk_State(Airport airportA) {
	// TODO Auto-generated constructor stub
	airport = airportA;
}


	@Override
	public void securityOperations() {
		// TODO Auto-generated method stub
		System.out.println("2 4 6 8 10");
	}


	@Override
	public void tightenOrLoosenSecurity() {
		// TODO Auto-generated method stub
		if((airport.getAvg_traffic_per_day() < 8 && airport.getAvg_traffic_per_day() >= 4) ||(airport.getAvg_prohibited_items_per_day()< 2 && airport.getAvg_prohibited_items_per_day() >= 1)){
			
			airport.setState(airport.getModerate_risk());
			
		}/*else if((airport.getAvg_traffic_per_day() < 4 && airport.getAvg_traffic_per_day() >= 0) ||(airport.getAvg_prohibited_items_per_day()< 1 && airport.getAvg_prohibited_items_per_day() >= 0)){
			
			airport.setState(airport.getLow_risk());
			
		}*/
	}

	
}
