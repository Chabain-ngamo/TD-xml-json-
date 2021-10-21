/**
 * 
 */
package Devoir1A;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

import org.w3c.dom.Element;


public class Flow {
	
	private int id;
	
	private String name;
	
	public Flow(Element atrium) throws IFT287Exception{
		
		try{
            this.setId(Integer.parseInt(atrium.getAttribute("id")));
            this.setName(atrium.getAttribute("name"));
        }
        catch (Exception e)
        {
            throw new IFT287Exception("Un champ est manquant ou une valeur n'est pas au bon format.");
        }
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	
	public JsonObjectBuilder toJson(){
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", id);
        builder.add("name", name);
        return builder;
    }

}
