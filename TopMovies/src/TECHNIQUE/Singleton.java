/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TECHNIQUE;

/**
 *
 * @author probook
 */
  
import java.sql.Connection;
import java.sql.DriverManager;


public class Singleton {

    private static Singleton singl;
    private Connection dbConnection;
    private Singleton(){
String url="jdbc:mysql://localhost:3306/";
String user="root";
String pass="";
String base="topMovies";
try
{
   Class.forName("com.mysql.jdbc.Driver");
   dbConnection=DriverManager.getConnection(url+base,user,pass);
   System.out.println("Connecter");
}catch(Exception e){System.out.println("Erreur de connexion");
    }
    }
 public static synchronized Singleton getInstance(){
     //tu as ecris singleton au lieu de singl

     if(singl==null){
          singl=new Singleton();
         System.out.println("Creation en cour");
     }
     else{
         System.out.println("Existe deja");
     }
     System.out.println(""+singl.hashCode());
     return singl;
 }

 public Connection getConnection()
 {
     return(dbConnection);
 }
}




