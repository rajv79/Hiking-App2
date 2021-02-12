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
		 users.insert(new User("Admin","admin123","Raj","","63186833",""));
		 users.insert(new User("Pin12","pin987","Pinki didi","","91256496",""));
		 
		 users.insert(new User("Nikki07","nik123","Nikki didi","","631384843",""));
		 users.insert(new User("vivek","vivek123","Raj","Singh","918944348",""));
		 
		 trails.insert(new Trail("Blue Cross Hike "," South Mastic","45.0 ","hard","point to point "));
		 trails.insert(new Trail(" yellow cross"," Albertson","50.0","hard","Circular"));
		 trails.insert(new Trail(" Hampton bay Hike"," outh mastic","10.0","medium","Circular"));
		 trails.insert(new Trail(" Space side Hike "," south mastic","5.0","hard","Loop-Trail"));
		 trails.insert(new Trail(" Green Belt "," south mastic","5.0","Easy","Loop- Trail"));
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
