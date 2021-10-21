
package Devoir1A;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

import org.w3c.dom.Element;


public class Artery {
	
	private String name;
	
	private int ID;
	
	private float startRaduis;
	
	private float endRaduis;
	
	private int length;
	
	public Artery(Element a)
            throws IFT287Exception
    {
        try
        {
        	this.setName(a.getAttribute("name"));
            this.setID(Integer.parseInt(a.getAttribute("ID")));
            this.setStartRaduis(Integer.parseInt(a.getAttribute("startRaduis")));
            if (a.hasAttribute("endRaduis"))
            {
                this.setEndRaduis(Integer.parseInt(a.getAttribute("endRaduis")));
            }
            this.setID(Integer.parseInt(a.getAttribute("ID")));
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
	 * @return the startRaduis
	 */
	public float getStartRaduis() {
		return startRaduis;
	}

	/**
	 * @param startRaduis the startRaduis to set
	 */
	public void setStartRaduis(float startRaduis) {
		this.startRaduis = startRaduis;
	}

	/**
	 * @return the endRaduis
	 */
	public float getEndRaduis() {
		return endRaduis;
	}

	/**
	 * @param endRaduis the endRaduis to set
	 */
	public void setEndRaduis(float endRaduis) {
		this.endRaduis = endRaduis;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	public JsonObjectBuilder toJson(){
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", ID);
        builder.add("name", name);
        builder.add("startRaduis", startRaduis);
        builder.add("endRaduis", endRaduis);
        builder.add("length", length);
        return builder;
    }

}
