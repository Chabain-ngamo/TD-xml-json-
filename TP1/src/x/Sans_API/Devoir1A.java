// Travail fait par :   
//  TCHOUNGA Jordan
//	NGAMO Chabain
//	FAMENI Steve
//	NGAMALEU Iris

package x.Sans_API;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonWriter;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;

import org.json.JSONObject;
import org.json.XML;

import fr.sofianelecubeur.dataserializer.CompilationType;
import fr.sofianelecubeur.dataserializer.FileDeserializerBuilder;
import fr.sofianelecubeur.dataserializer.FileSerializerBuilder;
import fr.sofianelecubeur.dataserializer.JsonFileDeserializer;
import fr.sofianelecubeur.dataserializer.JsonFileSerializer;

/**
 * Fichier de base pour le Devoir1A du cours IFT287
 *

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
        serialize(slt);
        System.out.println(slt);
        System.out.println("Conversion terminee.");
    }
    
    private static void serialize(String slt) throws IOException {
    	JsonFileSerializer serializer = (JsonFileSerializer) new FileSerializerBuilder().type(CompilationType.JSON).get();
    	serializer.writeObject("", slt);
    	serializer.compile(new File("HumanBody.json"));
    	serializer.close();
    }
    
}
