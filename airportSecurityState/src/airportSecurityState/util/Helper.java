package airportSecurityState.util;

import java.util.ArrayList;

public class Helper {
	
	private  double total_prohibited_items;
	private double Avg_traffic_per_day;
	private double Avg_prohibited_items_per_day;
	
	private double total_num_travellers;
	private ArrayList<Integer> days = new ArrayList<Integer>();
	public Helper() {
		// TODO Auto-generated constructor stub
		MyLogger.writeMessage("Calculating Avg Prohibited Items and Avg Traffic per Day", MyLogger.DebugLevel.CONSTRUCTOR);
		total_prohibited_items = 0;
		total_num_travellers = 0;
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
		
		
		
		MyLogger.writeMessage("Avg_prohibited_items_per_day = "+ Avg_prohibited_items_per_day + " Avg Traffic Per Day = "+ Avg_traffic_per_day, MyLogger.DebugLevel.IN_RESULTS);		
		
	}
public double getAvg_traffic_per_day() {

	return Avg_traffic_per_day;
}

public double getAvg_prohibited_items_per_day() {
	
	return Avg_prohibited_items_per_day;
}
}
