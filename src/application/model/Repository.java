package application.model;

public class Repository {
	 private User currentUser;
	 private Userdata users;
	 private Traildata trails;
	 private HikingHistorydata histories;
	 private Trail currentTrail;
	 
	 
	 public Repository() {
		 users = new Userdata();
		 trails = new Traildata();
		 histories = new HikingHistorydata();
		 
		 
	 }


	public Trail getCurrentTrail() {
		return currentTrail;
	}


	public void setCurrentTrail(Trail currentTrail) {
		this.currentTrail = currentTrail;
	}


	public User getCurrentUser() {
		return currentUser;
	}


	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}


	public Userdata getUsers() {
		return users;
	}


	public Traildata getTrails() {
		return trails;
	}


	public HikingHistorydata getHistories() {
		return histories;
	}
	 

}
