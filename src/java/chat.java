/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ROHIT
 */
@WebServlet(urlPatterns = {"/chat"})
public class chat extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
       
           // Server obj=new Server();
            //String args[]={};
            //obj.main(args);
             /* try {  
            Process pro1 = Runtime.getRuntime().exec("javac Server.java");  
            pro1.waitFor();  
            Process pro2 = Runtime.getRuntime().exec("java Server");  
            pro2.waitFor();  
         } catch (Exception e) {    
               System.out.println("Some Error");   
               e.printStackTrace();     
                }  
              */
              
              
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        String q=request.getParameter("question");
        System.out.println(q);
        try {
         

         String s="";
         
             Socket skt = new Socket("localhost", 9090);
         
             BufferedReader in = new BufferedReader(new
            InputStreamReader(skt.getInputStream()));
        out.print("Received string: '");
             System.out.print("Received string: '");
         while (!in.ready()) {}
         s=in.readLine();
         out.println(s); // Read one line and output it
         System.out.println(s);
        out.print("'\n");
        in.close();
         
         
      }
      catch(Exception e) {
         System.out.print("Whoops! It didn't work!\n");
         
         System.out.println(e.getMessage());
      }
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
