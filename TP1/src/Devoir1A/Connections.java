/**
 * 
 */
package Devoir1A;

import java.util.ArrayList;


public class Connections {

	private int id;
	private ArrayList<to>to;
	
	public Connections() {
		
	}
	public Connections(int id, ArrayList<to>to) {
		this.id = id;
		this.to = to;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<to> getTo() {
		return to;
	}
	public void setTo(ArrayList<to> to) {
		this.to = to;
	}
	
	
}
