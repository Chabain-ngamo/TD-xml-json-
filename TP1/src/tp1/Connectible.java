package tp1;

import java.util.ArrayList;

public class Connectible {

	private ArrayList<Atrium>Atrium;
	private ArrayList<Ventricle>Ventricle;
	private ArrayList<Artery>Artery;
	private ArrayList<Vein>Veins;
	private ArrayList<Capilary>Capilaries;
	private ArrayList<Nose>Nose;
	private ArrayList<AirConnectible>AirConnectibles;
	private ArrayList<Alveoli>Alveolis;
	
	
	public Connectible(ArrayList<Atrium>Atrium, ArrayList<Ventricle>Ventricle) {
		this.Atrium = Atrium;
		this.Ventricle = Ventricle;
	}
	public Connectible(ArrayList<Artery>Artery) {
		this.Artery = Artery;
	}
	public Connectible(ArrayList<Artery>Artery, ArrayList<Vein>Veins, ArrayList<Capilary>Capilaries) {
		this.Artery = Artery;
		this.Veins = Veins;
		this.Capilaries = Capilaries;
	}
	public void Connectible1(ArrayList<Vein>Veins) {
		this.Veins = Veins;
	}
	public void Connectible1(ArrayList<Nose>Nose, ArrayList<AirConnectible>AirConnectibles, ArrayList<Alveoli>Alveolis) {
		this.Nose = Nose;
		this.AirConnectibles = AirConnectibles;
		this.Alveolis = Alveolis;
	}
	
	
	public ArrayList<Atrium> getAtrium() {
		return Atrium;
	}
	public void setAtrium(ArrayList<Atrium> atrium) {
		Atrium = atrium;
	}
	public ArrayList<Ventricle> getVentricle() {
		return Ventricle;
	}
	public void setVentricle(ArrayList<Ventricle> ventricle) {
		Ventricle = ventricle;
	}
	
	
	public ArrayList<Artery> getArtery() {
		return Artery;
	}
	public void setArtery(ArrayList<Artery> artery) {
		Artery = artery;
	}
	public ArrayList<Vein> getVeins() {
		return Veins;
	}
	public void setVeins(ArrayList<Vein> veins) {
		Veins = veins;
	}
	public ArrayList<Capilary> getCapilaries() {
		return Capilaries;
	}
	public void setCapilaries(ArrayList<Capilary> capilaries) {
		Capilaries = capilaries;
	}
	public ArrayList<Nose> getNose() {
		return Nose;
	}
	public void setNose(ArrayList<Nose> nose) {
		Nose = nose;
	}
	public ArrayList<AirConnectible> getAirConnectibles() {
		return AirConnectibles;
	}
	public void setAirConnectibles(ArrayList<AirConnectible> airConnectibles) {
		AirConnectibles = airConnectibles;
	}
	public ArrayList<Alveoli> getAlveolis() {
		return Alveolis;
	}
	public void setAlveolis(ArrayList<Alveoli> alveolis) {
		Alveolis = alveolis;
	}
	public Connectible() {
		
	}
}
