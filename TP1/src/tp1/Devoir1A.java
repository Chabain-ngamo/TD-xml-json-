// Travail fait par :
//   NomEquipier1 - Matricule
//   NomEquipier2 - Matricule

package tp1;

import java.io.File;
import java.nio.file.Files;

import org.json.JSONObject;
import org.json.XML;

/**
 * Fichier de base pour le Devoir1A du cours IFT287
 *
 * <pre>
 * 
 * Vincent Ducharme
 * Universite de Sherbrooke
 * Version 1.0 - 6 août 2016
 * IFT287 - Exploitation de BD relationnelles et OO
 * 
 * Ce programme permet de convertir un fichier XML en son équivalent en JSON.
 *
 * Paramètres du programme
 * 0- Nom du fichier XML
 * 1- Nom du fichier JSON
 * 
 * </pre>
 */
public class Devoir1A
{

    public static void main(String[] args) throws Exception
    {


    	System.out.println("Debut de la Conversion.\n");
        File xmlFile = new File ("HumanBody.xml" );
        byte[] b = Files.readAllBytes(xmlFile.toPath());
        String xml = new String(b);
        JSONObject obj = XML.toJSONObject(xml);
        String slt = obj.toString(1);
        System.out.println(slt);
        System.out.println("Conversion terminee.");

}
}
