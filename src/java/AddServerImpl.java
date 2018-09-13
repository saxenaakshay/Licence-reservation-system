/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
import java.rmi.*;
import java.rmi.server.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf{
    public AddServerImpl() throws RemoteException{
        super();
    }
    public int notif(String name, String email, String mydate,int slot, String regid) throws RemoteException
    {
        int flag=0;
        try{
            System.out.println("RECVD: "+name+ " "+ email);
            EmailSender es= new EmailSender();
            String []email1={email};
            String Message="Hello "+name+",\n\t You have successfully booked your slot for driving license test.\n Kindly note that your slot date is \""+ mydate+"\". Your slot no is \""+slot+"\". Your registration-id no is \""+regid+"\".\n\n (This is a system generated email. Do not reply to this email.)  ";
            if(es.sendMail("licenseregservice@gmail.com", "akshaysaxena", Message, email1))
                System.out.println("email sent successfully");
            else
                System.out.println("Some error");
            
            System.out.println(name+" "+email+" "+mydate+" "+slot+" "+regid);
            return flag;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return flag;
        }
    }
}
