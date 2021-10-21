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
public class to {
	
	private int ID;

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
	
	public to(Element to) throws IFT287Exception{
		
		try
        {
            this.setID(Integer.parseInt(to.getAttribute("id")));
        }
        catch (Exception e)
        {
            throw new IFT287Exception("Un champ est manquant ou une valeur n'est pas au bon format.");
        }
		
	}
	
	public JsonObjectBuilder toJson(){
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", ID);
        return builder;
    }

}
