
package Devoir1A;

import java.util.LinkedList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;



public class XMLTOJSON {

	
	private List<to> to;
    private List<Ventricle> ven;
    private List<Vein> vein;
    private List<System_2> sys;
    private List<Organ> org;
    private List<Artery> artery;
    private List<Atrium> atrium;
    private List<Connection> conn;
    private List<Flow> flow;
    private List<MainBody> main;
    private List<MainBodyHandler> handler;
    
    public XMLTOJSON()
    {
       this.main = new LinkedList<MainBody>();
       this.sys = new LinkedList<System_2>();
       this.org = new LinkedList<Organ>();
       this.atrium = new LinkedList<Atrium>();
       this.artery = new LinkedList<Artery>();
       this.conn = new LinkedList<Connection>();
       this.flow = new LinkedList<Flow>();
       this.vein = new LinkedList<Vein>();
       this.ven = new LinkedList<Ventricle>();
       this.to = new LinkedList<to>();
    }
    
    public void ajoutmainbody(MainBody main)
    {
        this.main.add(main);
    }
    
    public void ajoutsystem(System_2 sys)
    {
        this.sys.add(sys);
    }
    
    public void ajoutorgan(Organ o)
    {
        this.org.add(o);
    }
    
    public void ajoutvein(Vein vein)
    {
        this.vein.add(vein);
    }
    
    public void ajoutartery(Artery artery)
    {
        this.artery.add(artery);
    }
    
    public void ajoutventricle(Ventricle ven)
    {
        this.ven.add(ven);
    }
    
    public void ajoutto(to to)
    {
        this.to.add(to);
    }
    
    public void ajoutflow(Flow flow)
    {
        this.flow.add(flow);
    }
    
    public void ajoutConnection(Connection conn)
    {
        this.conn.add(conn);
    }
    
    public void ajoutatrium(Atrium atrium)
    {
        this.atrium.add(atrium);
    }
    
    public JsonObjectBuilder toJson()
    {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        
        JsonArrayBuilder bmain = Json.createArrayBuilder();
        for(MainBody main : main)
            bmain.add(main.toJson());
        builder.add("MainBody", bmain);
        
        JsonArrayBuilder bto = Json.createArrayBuilder();
        for(to to : to)
            bto.add(to.toJson());
        builder.add("to", bto);
        
        JsonArrayBuilder bvein = Json.createArrayBuilder();
        for(Vein vein : vein)
            bvein.add(vein.toJson());
        builder.add("Vein", bvein);
        
        JsonArrayBuilder bven = Json.createArrayBuilder();
        for(Ventricle ven : ven)
            bven.add(ven.toJson());
        builder.add("Ventricle", bven);
        
        JsonArrayBuilder bflow = Json.createArrayBuilder();
        for(Flow flow : flow)
            bflow.add(flow.toJson());
        builder.add("Flow", bflow);
        
        JsonArrayBuilder borg = Json.createArrayBuilder();
        for(Organ org : org)
            borg.add(org.toJson());
        builder.add("Organ", borg);
        
        JsonArrayBuilder bconn = Json.createArrayBuilder();
        for(Connection conn : conn)
            bconn.add(conn.toJson());
        builder.add("Connection", bconn);
        
        JsonArrayBuilder batrium = Json.createArrayBuilder();
        for(Atrium atrium : atrium)
            batrium.add(atrium.toJson());
        builder.add("Atrium", batrium);
        
        JsonArrayBuilder bartery = Json.createArrayBuilder();
        for(Artery artery : artery)
            bartery.add(artery.toJson());
        builder.add("Artery", bartery);
        
        JsonArrayBuilder bsys = Json.createArrayBuilder();
        for(System_2 sys : sys)
            bsys.add(sys.toJson());
        builder.add("System_2", bsys);
        
        return builder;
    }
    
}
