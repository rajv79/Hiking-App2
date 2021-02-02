package application.model;

public class HikingHistory {

	private String Trail_name;
	private int date_started;
	private int Time_Strated;
	private int date_finshed;
	private int Time_finshed;
	private double distance;
	

	public HikingHistory() {
		this.Trail_name = "";
		this.date_started = 0;
		this.Time_Strated = 0;
		this.date_finshed = 0;
		this.Time_finshed = 0;
		this.distance = 0.0;
		

	}

	public HikingHistory(String Trail_name, int date_started, int Time_Started, int date_finshed, int Time_finshed,
			double distance) {

		this.Trail_name = Trail_name;
		this.date_started = date_started;
		this.Time_Strated = Time_Started;
		this.date_finshed = date_finshed;
		this.Time_finshed = Time_finshed;
		
		this.distance = distance;
		

	}

	public String toString() {
		return ("Name of Trail:" + Trail_name + "Date started :- " + date_started + "Time_Started:-" + Time_Strated
				+ "datefinshed:-" + date_finshed + "Ditance hike :-" + distance 
				);

	}

	public HikingHistory deepcopy() {
		HikingHistory deepcopy = new HikingHistory(Trail_name, date_started, Time_Strated, date_finshed, Time_finshed,
				distance);
		return deepcopy;

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

	public int getDate_started() {
		return date_started;
	}

	public void setDate_started(int date_started) {
		this.date_started = date_started;
	}

	public int getTime_Strated() {
		return Time_Strated;
	}

	public void setTime_Strated(int time_Strated) {
		Time_Strated = time_Strated;
	}

	public int getDate_finshed() {
		return date_finshed;
	}

	public void setDate_finshed(int date_finshed) {
		this.date_finshed = date_finshed;
	}

	public int getTime_finshed() {
		return Time_finshed;
	}

	public void setTime_finshed(int time_finshed) {
		Time_finshed = time_finshed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	

	
}
