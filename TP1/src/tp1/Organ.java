/**
 * 
 */
package tp1;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

import org.w3c.dom.Element;


public class Organ {
	
	private String name;
	
	private int id;
	
	private int systemid;
	
	public Organ(Element org) throws IFT287Exception{
		
		try{
			this.setName(org.getAttribute("name"));
			this.getName();
            this.setId(Integer.parseInt(org.getAttribute("id")));
            this.getId();
            this.setSystemid(Integer.parseInt(org.getAttribute("systemID")));
            this.getSystemid();
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
	 * @return the systemid
	 */
	public int getSystemid() {
		return systemid;
	}

	/**
	 * @param systemid the systemid to set
	 */
	public void setSystemid(int systemid) {
		this.systemid = systemid;
	}
	
	public JsonObjectBuilder toJson(){
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("name", name);
        builder.add("id", id);
        builder.add("systemID", systemid);
        return builder;
    }
}
