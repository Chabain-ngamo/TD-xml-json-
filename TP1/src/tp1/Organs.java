/**
 * 
 */
package tp1;


public class Organs {
	private String name;
	private int id;
	private int systemID;
	
	
	public Organs(){
		
	}
	public Organs(String name,int id,int systemID){
		this.name = name;
		this.id = id;
		this.systemID = systemID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSystemID() {
		return systemID;
	}
	public void setSystemID(int systemID) {
		this.systemID = systemID;
	}
}
