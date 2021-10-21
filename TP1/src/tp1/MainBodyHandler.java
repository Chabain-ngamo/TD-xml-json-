/**
 * 
 */
package tp1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import javax.json.JsonBuilderFactory;
import javax.json.JsonObjectBuilder;

import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class MainBodyHandler extends DefaultHandler {
	


	@Override
	public void startElement(String uri, String localName, String qName, Attributes attrs) {
				//read attributes
				if(attrs.getLength()>0) {
					System.out.println("<"+qName+">");
					for(int i=0; i<attrs.getLength(); i++) {
						System.out.println(attrs.getQName(i));
						System.out.println("="+"\""+attrs.getValue(i)+"\"");
					}
			
					System.out.println(">");
				}else {
					System.out.println("<"+qName+">");
				}
		  }


   
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("</"+qName+">");
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println(new String(ch, start, length));
	}
	
}
