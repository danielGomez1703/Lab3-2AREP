/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.SparkD;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MicroSpringBoot {


    public static void main(String[] args) {     
        args =new String []{"co.edu.escuelaing.sparkd.SparkD.controllers.HelloController"};
        try {
            MicroSpring iocServer = new MicroSpring();
            iocServer.start(args);
            HttpServer server = new HttpServer(iocServer);
            server.start();
        } catch (Exception ex) {
            Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}

