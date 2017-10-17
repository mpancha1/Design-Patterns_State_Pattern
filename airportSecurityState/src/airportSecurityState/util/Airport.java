package manav_panchal_assign_3;

import java.util.ArrayList;

public class Airport {

	private int total_number_of_days;
	private  int total_prohibited_items;
	private int Avg_traffic_per_day;
	private int Avg_prohibited_items_per_day;
	
	private int total_num_travellers;
	private ArrayList<Integer> days = new ArrayList<Integer>();
	
	AirportStateI High_risk;
	AirportStateI Moderate_risk;
	AirportStateI Low_risk;
	
	public AirportStateI state;
	
	
	public Airport() {
		// TODO Auto-generated constructor stub
		total_number_of_days = 0;
		total_prohibited_items = 0;
		total_num_travellers = 0;
		
		High_risk = new High_Risk_State(this);
		Moderate_risk = new Moderate_Risk_State(this);
		Low_risk = new Low_Risk_State(this);
		state = Low_risk;
		
		MyLogger.writeMessage("Constructor Airport Called", MyLogger.DebugLevel.CONSTRUCTOR);
		
	}
	
	public void calculate_risk(String passenger_details){
		
		String details[] = passenger_details.split(";");
		String[] day = details[0].split(":");
		int day_int = Integer.parseInt(day[1]);
		String[] item = details[3].split(":");
		if(days.indexOf(Integer.parseInt(day[1])) == -1){
			
			days.add(day_int);
		}
		if(item[1].equalsIgnoreCase("GUN")||item[1].equalsIgnoreCase("Blade")||item[1].equalsIgnoreCase("NailCutter")||item[1].equalsIgnoreCase("Knife")){
			
			total_prohibited_items++;
			
		}		
		
		total_num_travellers++;
		Avg_prohibited_items_per_day = total_prohibited_items/(days.size());
		Avg_traffic_per_day = total_num_travellers/days.size();
		
		
		
		
		
	}
	
	public int getAvg_traffic_per_day() {
		return Avg_traffic_per_day;
	}

	public int getAvg_prohibited_items_per_day() {
		return Avg_prohibited_items_per_day;
	}

	void setState(AirportStateI stateA){
		
		state = stateA;
	}
	void tightenOrLoosenSecurity(){
		
		state.tightenOrLoosenSecurity();
		state.securityOperations();
	}
	public void print(){
		System.out.println(total_prohibited_items);
		System.out.println(days.size());
		System.out.println(Avg_prohibited_items_per_day);
		System.out.println(Avg_traffic_per_day);
		//System.out.println(total_num_travellers);
		System.out.println("------------------------------------");
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
