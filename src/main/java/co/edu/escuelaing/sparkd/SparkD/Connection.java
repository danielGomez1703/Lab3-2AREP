/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.SparkD;

/**
 *
 * @author Jairo Gomez
 */

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;

//mongodb+srv://arepU:arep1234@cluster0.w7gdd.mongodb.net/arep?retryWrites=true&w=majority

public class Connection {

    public static String datos() {

       /* MongoClientURI connectionString = new MongoClientURI("mongodb+srv://arepU:arep1234@cluster0.w7gdd.mongodb.net/arep?retryWrites=true&w=majority");
        MongoClient mongoClient = new MongoClient(connectionString);
        MongoDatabase database = mongoClient.getDatabase("arep");*/

        
     MongoClientURI uri = new MongoClientURI(
    "mongodb+srv://arep:arep@cluster0.w7gdd.mongodb.net/arswdb?retryWrites=true&w=majority");
       // MongoClientURI uri = new MongoClientURI("mongodb+srv://arep:arep1234@cluster0.w7gdd.mongodb.net/arep?retryWrites=true&w=majority");
       
        MongoClient mongoClient = new MongoClient(uri);
        System.out.println("pasa del cliente ");
        MongoDatabase database = mongoClient.getDatabase("arswdb");
        MongoCollection <Document> collections = database.getCollection("sala");
        System.out.println(collections.countDocuments());
        FindIterable <Document> resultados = collections.find();
        String datos = "";
        for (Document r : resultados){
            datos+= "\n"+r.toJson();
            System.out.println(r.toJson());
        }
        
        /* Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
        String connectionString = System.getProperty("");
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }*/
        return datos;
    }
}
