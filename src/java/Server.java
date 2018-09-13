/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ROHIT
 */
import java.lang.*;
import java.io.*;
import java.net.*;

public class Server {
   public static void main(String args[])throws IOException {
       BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
      String data = "Toobie ornaught toobie";
      
      try {
          System.out.println("SERVER RUNNING");
         ServerSocket srvr = new ServerSocket(9090);
        
        
         String s="";
        
              Socket skt = srvr.accept();
               System.out.print("Server has connected!\n");
             PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
         
         System.out.println("OUT opened");
            s=new String (k.readLine());
     
         System.out.print("Sending string: '" +  s + "'\n");
         out.print(s);
         System.out.println("String Sent");
         out.close();
         System.out.println("OUT closed");
         skt.close();
         
         
         
        srvr.close();
      }
      catch(Exception e) {
         System.out.print("Whoops! It didn't work!\n");
         System.out.println(e.getMessage());
      }
   }
}