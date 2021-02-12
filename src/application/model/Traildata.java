package application.model;

import application.model.Userdata.Node;

public class Traildata {

	private int next;
	private int size;
	private Trail[] data;

	public Traildata() {
		next = 0;
		size = 100;
		data = new Trail[50000];
	}

	public Traildata(int s) {
		next = 0;
		data = new Trail[s];
		size = s;
	}

	public boolean insert(Trail newNode) {

		data[next] = newNode.deepcopy();
		if (data[next] == null)
			return false;
		next = next + 1;
		return true;
	}

	public Trail fetch(String targetKey) {
		Trail node;
		Trail temp;

		int i = 0;
		while (i < next && !(data[i].compareTo(targetKey) == 0)) {
			i++;
		}
		if (i == next)
			return null;

		node = data[i].deepcopy();

		if (i != 0) {
			temp = data[i - 1];
			data[i - 1] = data[i];
			data[i] = temp;
		}
		return node;
	}

	public boolean delete(String targetKey) {
		int i = 0;
		while (i < next && !(data[i].compareTo(targetKey) == 0)) {
			i++;
		}
		if (i == next)
			return false;

		data[i] = data[next - 1];
		data[next - 1] = null;
		next = next - 1;
		return true;
	}

	public boolean update(String targetKey, Trail newNode) {
		if (delete(targetKey) == false)
			return false;
		else if (insert(newNode) == false)
			return false;
		else
			return true;
	}
	
		public Trail[]toArray(){ // this method
		
		
		Trail[] trail = new Trail[next];
		for(int i =0; i<next;i++) {
			trail[i]=  data[i];
			
		}
		
		return trail;
		
		
	}
	
	
	
	

}
