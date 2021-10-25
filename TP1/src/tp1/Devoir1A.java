// Travail fait par :    
//  TCHOUNGA Jordan
//	NGAMO Chabain
//	FAMENI Steve
//	NGAMALEU Iris

package tp1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonWriter;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * Fichier de base pour le Devoir1A du cours IFT287
 *
 * Ce programme permet de convertir un fichier XML en son Equivalent en JSON.
 *
 * Parametres du programme
 * 0- Nom du fichier XML
 * 1- Nom du fichier JSON
 * 
 * </pre>
 */
public class Devoir1A
{

    public static void main(String[] args) throws IFT287Exception, SAXException{
        if (args.length < 2)
        {
            System.out.println("Usage: java tp1.Devoir1A <fichierXML> <fichierJSON>");
            return;
        }
        
        String nomFichierXML = args[0];
        String nomFichierJSON = args[1];
        
        System.out.println("Debut de la conversion du fichier " + nomFichierXML + " vers le fichier " + nomFichierJSON);
        
        //Conversion fichier XML en fichier JSON
        try
        {
            Devoir1A b = new Devoir1A();
            b.LireXML(nomFichierXML);
            b.EcrireJSON(nomFichierJSON);
        }
        catch (IFT287Exception e)
        {
            System.out.println(e.toString());
        }
        
        System.out.println("Conversion terminee.");
    }
    
    private XMLTOJSON main;

    public Devoir1A(){
    	
        main = new XMLTOJSON();
        
    }
    
    public  void LireXML(String nomFichierXML)
            throws IFT287Exception
    {
    	SAXParserFactory saxParserFactory= SAXParserFactory.newInstance();
		try {
			
			System.out.println("Lecture du fichier XML " + nomFichierXML);
			SAXParser saxParser =saxParserFactory.newSAXParser();
			MainBodyHandler handler = new MainBodyHandler();
			saxParser.parse(new File(nomFichierXML), handler);
			System.out.println("Fin de la lecture du fichier XML.");
			 
		}catch (ParserConfigurationException | SAXException | IOException e) {
			
			e.printStackTrace();
			
		}
    }

    public void EcrireJSON(String nomFichierJson)
            throws IFT287Exception
    {
    	try
        {
            System.out.println("Ecriture du fichier JSON " + nomFichierJson);
            FileWriter stWriter = new FileWriter(nomFichierJson);
            Map<String, Object> config = new HashMap<String, Object>(1);
            config.put(JsonGenerator.PRETTY_PRINTING, true);
            JsonWriterFactory f = Json.createWriterFactory(config);
            JsonWriter jsonWriter = f.createWriter(stWriter);
            jsonWriter.writeObject(main.toJson().build());
            jsonWriter.close();
            System.out.println("Fin de l'ecriture du fichier JSON.");
        }
        catch (Exception e)
        {
            throw new IFT287Exception("Une erreur est survenue lors de l'ecriture du fichier JSON.");
        }
    }
}
