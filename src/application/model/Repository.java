package application.model;

public class Repository {
	 private Userdata users;
	 private Traildata trails;
	 private HikingHistorydata[]histories;
	 
	 
	 public Repository() {
		 users = new Userdata();
		 trails = new Traildata();
		 histories = new HikingHistorydata[100];
		 
		 
	 }


	public Userdata getUsers() {
		return users;
	}


	public Traildata getTrails() {
		return trails;
	}


	public HikingHistorydata[] getHistories() {
		return histories;
	}
	 

}
