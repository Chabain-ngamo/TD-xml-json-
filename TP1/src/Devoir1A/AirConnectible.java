package Devoir1A;

public class AirConnectible {

	private String name;
	private int id;
	private int startRadius;
	private int endRadius;
	private int length;
	
	public AirConnectible() {
		
	}
	public AirConnectible(String name, int id, int startRadius, int endRadius, int length) {
		this.name = name;
		this.id = id;
		this.startRadius = startRadius;
		this.endRadius = endRadius;
		this.length = length;
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
	public int getStartRadius() {
		return startRadius;
	}
	public void setStartRadius(int startRadius) {
		this.startRadius = startRadius;
	}
	public int getEndRadius() {
		return endRadius;
	}
	public void setEndRadius(int endRadius) {
		this.endRadius = endRadius;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}
