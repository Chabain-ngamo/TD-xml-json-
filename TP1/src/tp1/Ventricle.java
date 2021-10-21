/**
 * 
 */
package tp1;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

import org.w3c.dom.Element;

/**
 * @author NOUMEN DARRYL
 *
 */
public class Ventricle {
	
	private String name;
	
	private int ID;
	
	private float volume;
	
	public Ventricle(Element ven) throws IFT287Exception{
		
		try{
            this.setID(Integer.parseInt(ven.getAttribute("id")));
            this.setName(ven.getAttribute("name"));
            this.setVolume(Integer.parseInt(ven.getAttribute("volume")));
        }
        catch (Exception e)
        {
            throw new IFT287Exception("Un champ est manquant ou une valeur n'est pas au bon format.");
        }
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the volume
	 */
	public float getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(float volume) {
		this.volume = volume;
	}
	
	public JsonObjectBuilder toJson(){
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", ID);
        builder.add("name", name);
        builder.add("volume", volume);
        return builder;
    }
	
}
