/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author ROHIT
 */
@WebServlet(urlPatterns = {"/VerifyLogin"})
public class VerifyLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 /*   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VerifyLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VerifyLogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
*/
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
     	        String n=request.getParameter("regid");
		String p=request.getParameter("password");
                String sql="";
                Statement s1;
                out.println("Welcome" + n);
                Connection conn = null;
		String url = "jdbc:mysql://localhost/";
		String dbName = "test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "";
		try 
		{
                    String date="";
                    int b_id=0;
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url+dbName,userName,password);
			out.println("Connected to the database");
                        sql= "Select * from login2 where regid='"+n+"' and dob='"+p+"'";
                        s1=conn.createStatement();
                        ResultSet rs= s1.executeQuery(sql);
                        
                        Statement s2= conn.createStatement();
                        if (rs.next()) {out.println("VERIFIED:"+n);
                       sql="Select * from bookings where regid='"+n+"'";
                       String flag="true";
                       ResultSet rs2= s2.executeQuery(sql);
                       
                       if (rs2.next()) { flag="false"; b_id=rs2.getInt("b_id"); date= rs2.getString("dob"); }
                        //  DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                        //  Calendar calobj = Calendar.getInstance();
                        //  out.println(df.format(calobj.getTime()));
                        //  out.println("<form> Pick a booking date:<input type='date' name='mydate' min='"+df.format(calobj.getTime())+"'> </form>");
                       
                        request.setAttribute("regid", n);
                        request.setAttribute("bid", b_id);
                        request.setAttribute("date", date.toString());
                        
                        request.setAttribute("flag", flag);
                        request.getRequestDispatcher("home.jsp").forward(request, response);
                        //response.sendRedirect("datepick.jsp");
                        }
                        else out.println("Not verified");
			conn.close();
			out.println("Disconnected from database");
		}
                catch (Exception e) 
		{    
                    out.println("error "+e.getMessage());//e.getMessage());
		}   
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
