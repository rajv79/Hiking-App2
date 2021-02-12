package application.model;

public class HikingHistory {

	private String username;
	private String Trail_name;
	private String date_started;
	private String Time_Strated;
	//private int date_finshed;
	private String Time_finshed;
	private String distance;
	
	

	public HikingHistory() {
		this.Trail_name = "";
		this.date_started = "";
		this.Time_Strated = "";
		//this.date_finshed = 0;
		this.Time_finshed = "";
		
		
		

	}

	public HikingHistory(String username,String Trail_name, String date_started, String Time_Started,  String Time_finshed,
			String distance) {
		
		this.username = username;
		this.Trail_name = Trail_name;
		this.date_started = date_started;
		this.Time_Strated = Time_Started;
		//this.date_finshed = date_finshed;
		this.Time_finshed = Time_finshed;
		
		this.distance = distance;
		

	}

	public String toString() {
		return ("Username : "+ username+ "Name of Trail:" + Trail_name + " +Date started :- " + date_started + "Time_Started:-" + Time_Strated
				+ "Ditance hike :-" + distance 
				);

	}

	public HikingHistory deepcopy() {
		HikingHistory deepcopy = new HikingHistory( username ,Trail_name, date_started, Time_Strated,  Time_finshed,
				distance);
		return deepcopy;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int compareTo(String targetKey) {
		return (Trail_name.compareTo(targetKey));

	}

	public String getTrail_name() {
		return Trail_name;
	}

	public void setTrail_name(String trail_name) {
		Trail_name = trail_name;
	}

	public String getDate_started() {
		return date_started;
	}

	public void setDate_started(String date_started) {
		this.date_started = date_started;
	}

	public String getTime_Strated() {
		return Time_Strated;
	}

	public void setTime_Strated(String time_Strated) {
		Time_Strated = time_Strated;
	}

	

	public String getTime_finshed() {
		return Time_finshed;
	}

	public void setTime_finshed(String time_finshed) {
		Time_finshed = time_finshed;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	
	public boolean contains(String text) {
		return toString().contains(text);
		
		
	}

	
	

	
}
