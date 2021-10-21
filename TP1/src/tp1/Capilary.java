package tp1;

public class Capilary {

	private String name;
	private int id;
	private String volume;
	
	public Capilary() {
		
	}
	public Capilary(String name, int id, String volume) {
		this.name = name;
		this.id = id;
		this.volume = volume;
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
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
}
