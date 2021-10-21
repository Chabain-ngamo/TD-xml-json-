package Devoir1A;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

import org.w3c.dom.Element;

public class MainBody {
	
	private int bodyID;
	
	private String bodyName;
	
	public MainBody(Element main) throws IFT287Exception{
		
		try{
            this.setBodyID(Integer.parseInt(main.getAttribute("id")));
            this.setBodyName(main.getAttribute("name"));
        }
        catch (Exception e)
        {
            throw new IFT287Exception("Un champ est manquant ou une valeur n'est pas au bon format.");
        }
		
	}

	/**
	 * @return the bodyID
	 */
	public int getBodyID() {
		return bodyID;
	}

	/**
	 * @param bodyID the bodyID to set
	 */
	public void setBodyID(int bodyID) {
		this.bodyID = bodyID;
	}

	/**
	 * @return the bodyName
	 */
	public String getBodyName() {
		return bodyName;
	}

	/**
	 * @param bodyName the bodyName to set
	 */
	public void setBodyName(String bodyName) {
		this.bodyName = bodyName;
	}
	
	public JsonObjectBuilder toJson(){
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", bodyID);
        builder.add("name", bodyName);
        return builder;
    }
	
}
