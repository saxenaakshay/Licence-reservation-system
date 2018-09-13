/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ROHIT
 */
@WebServlet(urlPatterns = {"/checkAvail"})
public class checkAvail extends HttpServlet {

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
    public void init()
    {}
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
         response.setContentType("text/html");
         
		PrintWriter out = response.getWriter();
                
                out.println("<html><head><style>/*\n" +
" * Copyright (c) 2012-2013 Thibaut Courouble\n" +
" * http://www.cssflow.com\n" +
" *\n" +
" * Licensed under the MIT License:\n" +
" * http://www.opensource.org/licenses/mit-license.php\n" +
" *\n" +
" * View the Sass/SCSS source at:\n" +
" * http://www.cssflow.com/snippets/light-horizontal-navigation/demo/scss\n" +
" *\n" +
" * Original PSD by Pixeden: http://goo.gl/1QBnB\n" +
" *\n" +
" * Dark version: http://cssdeck.com/labs/dark-horizontal-navigation\n" +
" */\n" +
"\n" +
"@import \"http://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.css\";\n" +
"\n" +
"body {\n" +
"  font: 13px/20px \"Lucida Grande\", Tahoma, Verdana, sans-serif;\n" +
"  color: #404040;\n" +
"  background: #e6e6e6;\n" +
"}\n" +
"\n" +
".container {\n" +
"  margin: 10px auto;\n" +
"  width: 540px;\n" +
"  text-align: center;\n" +
"}\n" +
"\n" +
".nav {\n" +
"  height: 48px;\n" +
"  display: inline-block;\n" +
"}\n" +
"\n" +
".nav > li, .nav:active > .active {\n" +
"  float: left;\n" +
"  position: relative;\n" +
"  margin: 0 0 4px;\n" +
"  height: 44px;\n" +
"  color: #595959;\n" +
"  text-shadow: 0 1px white;\n" +
"  background-color: rgba(0, 0, 0, 0.05);\n" +
"  border: 1px solid;\n" +
"  border-color: #cfcfcf #d6d6d6 #c8c8c8;\n" +
"  background-image: -webkit-linear-gradient(top, rgba(255, 255, 255, 0.6), rgba(255, 255, 255, 0.25));\n" +
"  background-image: -moz-linear-gradient(top, rgba(255, 255, 255, 0.6), rgba(255, 255, 255, 0.25));\n" +
"  background-image: -o-linear-gradient(top, rgba(255, 255, 255, 0.6), rgba(255, 255, 255, 0.25));\n" +
"  background-image: linear-gradient(to bottom, rgba(255, 255, 255, 0.6), rgba(255, 255, 255, 0.25));\n" +
"  -webkit-box-shadow: inset 0 1px white, inset 0 0 0 1px rgba(255, 255, 255, 0.7), 0 2px #dadada, 0 3px #c4c4c4, 0 4px 3px rgba(0, 0, 0, 0.1);\n" +
"  box-shadow: inset 0 1px white, inset 0 0 0 1px rgba(255, 255, 255, 0.7), 0 2px #dadada, 0 3px #c4c4c4, 0 4px 3px rgba(0, 0, 0, 0.1);\n" +
"}\n" +
"\n" +
".nav > li:hover {\n" +
"  color: #539f07;\n" +
"  text-shadow: 0 1px white, 0 0 20px white;\n" +
"}\n" +
"\n" +
".nav > li.active,\n" +
".nav > .active:active,\n" +
".nav > li:active {\n" +
"  z-index: 2;\n" +
"  margin: 4px 0 0;\n" +
"  height: 43px;\n" +
"  color: #404040;\n" +
"  background: transparent;\n" +
"  border-color: #ccc;\n" +
"  border-width: 1px 0;\n" +
"  background-image: -webkit-linear-gradient(top, rgba(0, 0, 0, 0.04), rgba(0, 0, 0, 0));\n" +
"  background-image: -moz-linear-gradient(top, rgba(0, 0, 0, 0.04), rgba(0, 0, 0, 0));\n" +
"  background-image: -o-linear-gradient(top, rgba(0, 0, 0, 0.04), rgba(0, 0, 0, 0));\n" +
"  background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0.04), rgba(0, 0, 0, 0));\n" +
"  -webkit-box-shadow: inset 0 1px rgba(255, 255, 255, 0.35), inset 0 -1px 1px rgba(0, 0, 0, 0.05), 1px 0 rgba(0, 0, 0, 0.05), -1px 0 rgba(0, 0, 0, 0.05), 0 1px rgba(255, 255, 255, 0.4);\n" +
"  box-shadow: inset 0 1px rgba(255, 255, 255, 0.35), inset 0 -1px 1px rgba(0, 0, 0, 0.05), 1px 0 rgba(0, 0, 0, 0.05), -1px 0 rgba(0, 0, 0, 0.05), 0 1px rgba(255, 255, 255, 0.4);\n" +
"}\n" +
"\n" +
".nav > li:active {\n" +
"  z-index: 3;\n" +
"}\n" +
"\n" +
".nav > li:first-child {\n" +
"  border-left-width: 1px !important;\n" +
"  border-left-color: #c6c6c6;\n" +
"  border-radius: 5px 0 0 5px;\n" +
"}\n" +
"\n" +
".nav > li:last-child {\n" +
"  border-right-width: 1px !important;\n" +
"  border-right-color: #c6c6c6;\n" +
"  border-radius: 0 5px 5px 0;\n" +
"}\n" +
"\n" +
".nav > li + li, .nav:active > .active + li, .nav:active > li + .active {\n" +
"  border-left-width: 0;\n" +
"}\n" +
"\n" +
".nav > .active + li,\n" +
".nav > .active:active + li,\n" +
".nav > li:active + li,\n" +
".nav > li:active + .active {\n" +
"  border-left-width: 1px;\n" +
"}\n" +
"\n" +
".nav > li > a {\n" +
"  display: block;\n" +
"  position: relative;\n" +
"  line-height: 44px;\n" +
"  padding: 0 20px;\n" +
"  font-size: 12px;\n" +
"  font-weight: bold;\n" +
"  color: inherit;\n" +
"  text-decoration: none;\n" +
"  outline: 0;\n" +
"}\n" +
"\n" +
".nav > li > a:before {\n" +
"  content: attr(title);\n" +
"  position: absolute;\n" +
"  top: 1px;\n" +
"  left: 20px;\n" +
"  color: rgba(255, 255, 255, 0.4);\n" +
"  text-shadow: none;\n" +
"}"
                        + "</style></head><body><div class=\"container\">\n" +
"    <nav>\n" +
"      <ul class=\"nav\">\n" +
"        <li><a href=\"#\" title=\"Home\">Home</a></li>\n" +
"        <li ><a href=\"#\" title=\"Road Rules\">Road Rules</a></li>\n" +
"        <li><a href=\"#\" title=\"Traffic Signals\">Traffic Signals</a></li>\n" +
"        <li><a href=\"#\" title=\"Signs Info\">Learn Signs</a></li>\n" +
"      </ul>\n" +
"    </nav>");
                
        String mydate=request.getParameter("mydate");
        String regid=request.getParameter("regid");
       // out.println(mydate);
        
         String sql="";
                Statement s1;
                Connection conn = null;
		String url = "jdbc:mysql://localhost/";
		String dbName = "test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "";
		try 
		{
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url+dbName,userName,password);
			//out.println("Connected to the database");
                        sql= "Select * from bookings where dob='"+mydate+"'";
                        s1=conn.createStatement();
                        ResultSet rs= s1.executeQuery(sql);
                        int slots=0;
                        int booked[]=new int[3];
                        while (rs.next()) { ++slots;
                        int b=rs.getInt("slot");
                        if (b==1) booked[0]=1;
                        if (b==2) booked[1]=1;
                        if (b==3) booked[2]=1;
                        }
                        System.out.println("registration id "+regid);
                        
                        out.println("<br> <br> <br> <form action='slotSelect' method='post'> <input type='hidden' name='hdate' value='"+mydate+"'> <input type='hidden' name='regid' value='"+regid+"'> ");
                        
                        switch(slots){
                            case 0:
                                out.println("<input type='radio' name='slot' value='1'>10 AM </br>");
                                out.println("<input type='radio' name='slot' value='2'>12 PM </br>");
                                out.println("<input type='radio' name='slot' value='3'>2 PM </br>");
                                out.println("<input type='submit' value='Book Slot!'>");
                                break;
                            case 1:
                            case 2:
                                
                                if (booked[0]==1) out.println("<input type='radio' name='slot' value='1' disabled> 10 AM </br>");
                                else out.println("<input type='radio' name='slot' value='1'> 10 AM </br>");
                                
                                if (booked[1]==1)  out.println("<input type='radio' name='slot' value='2' disabled>12 PM </br>");
                                else  out.println("<input type='radio' name='slot' value='2'>12 PM </br>");
                                
                                if (booked[2]==1)
                                out.println("<input type='radio' name='slot' value='3' disabled>2 PM </br>");
                                else 
                                out.println("<input type='radio' name='slot' value='3'>2 PM </br>");
                                out.println("<input type='submit' value='Book Slot!'>");
                                break;
                                
                            
                            default:
                                 out.println("<input type='radio' name='slot' value='1' disabled>10 AM</br>");
                                out.println("<input type='radio' name='slot' value='2' disabled>12 PM </br>");
                                out.println("<input type='radio' name='slot' value='3' disabled>2 PM </br>");
                                out.println("Slots FULL. Please go back and select another date!");
                                break;
                                
                                
                        }
                        out.println("</form></body></html>");
                        conn.close();
                     //   out.println("Disconnected from database");
                        
			
		}
                catch (Exception e) 
		{    
			out.println("error "+e.getMessage());//e.getMessage());
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
