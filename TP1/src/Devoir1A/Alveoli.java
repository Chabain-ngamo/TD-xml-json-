package Devoir1A;

public class Alveoli {

	private String name;
	private int id;
	private int volume;
	
	public Alveoli() {
		
	}
	public Alveoli(String name,int id, int volume) {
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
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
