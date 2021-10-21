/**
 * 
 */
package Devoir1A;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

/**
 * @author NOUMEN DARRYL
 *
 */
public class Connection {
	
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
	
	public JsonObjectBuilder toJson(){
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", ID);
        return builder;
    }
	
}