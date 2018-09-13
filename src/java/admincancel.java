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
 * @author Admin
 */
@WebServlet(urlPatterns = {"/admincancel"})
public class admincancel extends HttpServlet {
    
    Connection con=null;
    int f=-1;
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
        String q2 = request.getParameter("can");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           if (q2!=null)
           {
               try
                {
                    String q1="select * from login2 where regid=\""+q2+"\";";
                    Statement st1=con.createStatement();
                    ResultSet rs1=st1.executeQuery(q1);
                    rs1.next();
                    String name=rs1.getString("name");
                    String email=rs1.getString("email");
                    String  q="delete from bookings where regid=\""+q2+"\";";
                    Statement st=con.createStatement();
                    f=st.executeUpdate(q);
                    
                    String  q3="delete from cancellations where regid=\""+q2+"\";";
                    Statement st3=con.createStatement();
                    f=st.executeUpdate(q3);
                    
                    String to[]={email};
                    EmailSender es= new EmailSender();
                    String Message="Hello "+name+",\n\t We have cancelled your test booking slot.\n\n (This is a system generated email. Do not reply to this email.)  ";
                    if(es.sendMail("licenseregservice@gmail.com", "akshaysaxena", Message, to))System.out.println("email sent successfully");
                    else
                        System.out.println("Some error");
                }
               catch (Exception e){}
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet admincancel</title>");            
            out.println("</head>");
            out.println("<body>");
            if (f!=-1)
                out.println("<h1>REGISTRATION ID " + q2 + " CANCELLED!</h1>");
            else
                out.println("<h1>NONE SELECTED!</h1>");
           
            out.println("<br><a href=\"adminops.jsp\">ADMIN OPERATIONS<a/> ");
            out.println("<br><br><a href=\"adminservlet2\">ALL BOOKINGS<a/> ");
            out.println("<br><br><a href=\"admincancelreq\">CANCEL REQUESTS<a/> ");
            out.println("<br><br><a href=\"adminservlet\">ALL USERS<a/> ");
            
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
