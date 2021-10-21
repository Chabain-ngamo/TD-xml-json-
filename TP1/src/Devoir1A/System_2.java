package Devoir1A;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

import org.w3c.dom.Element;


public class System_2 {

	private int type;
	
	private int id;
	
	private String name;
	
	public System_2(Element sys) throws IFT287Exception{
		
		try{
			this.setType(Integer.parseInt(sys.getAttribute("type")));
            this.setId(Integer.parseInt(sys.getAttribute("id")));
            this.setName(sys.getAttribute("name"));
        }
        catch (Exception e)
        {
            throw new IFT287Exception("Un champ est manquant ou une valeur n'est pas au bon format.");
        }
		
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
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
        builder.add("volume", type);
        return builder;
    }
	
}
