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
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/adminservlet2"})
public class adminservlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */ 
    Connection con=null;
    String dob, Birthday_Day, Birthday_Month, Birthday_Year, Email_Id, Mobile_Number, Gender, Address, City, Pin_Code,
       State, Country, idtype, idno, ltype;
    int c=0;
    public void init()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
        }
        catch(Exception e)
        { System.out.println("Error while loading"+e);
        }
     }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>USER INFO</title>");            
            out.println("<h1>ORDERED BY SLOT DATE</h1><br><br>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"admincancel\" method=\"post\" name=\"canform\">");
            out.println("<table border=\"1\" style=\"width:100%\">" + 
                        "<tr><th>CANCEL</th><th>Booking Id</th><th>Regitration Id</th><th>Slot Date</th><th>Slot</th><th>NAME</th><th>Email</th><th>DOB</th></tr>");
           try
            {
                String  q="select * from bookings left join login2 on bookings.regid=login2.regid order by bookings.dob;";
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(q);
                while (rs.next())
                {
                    out.println("<tr><td><input type=\"radio\" name=\"can\" value=\""+rs.getString("regid")+"\" id=\"q1\"></td><td>" +rs.getString("b_id")+ "</td><td>" +rs.getString("regid")+ "</td><td>" +rs.getString("dob")+ "</td><td>" +rs.getString("slot")+ "</td><td>" +rs.getString("name")+ "</td><td>" +rs.getString("email")+"</td><td>" +rs.getString("login2.dob")+ "</td></tr>");
                    c++;
                }
            }
            catch (Exception e)
            {
                System.out.println("DATABASE EXCEPTION: "+e);
            }
            out.println("</table><br>");
            out.println("<input type=\"submit\" value=\"CANCEL BOOKING\" >");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
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
