/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.Naming;
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
@WebServlet(urlPatterns = {"/slotSelect"})
public class slotSelect extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet slotSelect</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet slotSelect at " + request.getContextPath() + "</h1>");
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
        
        String mydate=request.getParameter("hdate");
        int slot= Integer.parseInt(request.getParameter("slot"));
        String regid=request.getParameter("regid");
        response.setContentType("text/html");
		PrintWriter out = response.getWriter();
                
                out.println("Date picked:"+ mydate + "Slot: "+ slot + "RegId:"+ regid);
                
                String email="s";
                String name="n";        

                String sql="";
                String sq3="";
                Statement s1;
                String sq2;
                Statement s2,s3;
               
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
                        s1=conn.createStatement();
                        s3=conn.createStatement();
			s2=conn.createStatement();
                        out.println("Connected to the database");
                        sql= "Select b_id from bookings ORDER BY b_id DESC LIMIT 1;";
                        ResultSet rs= s1.executeQuery(sql);
                        int id=0;
                        if (rs.next()) id=rs.getInt("b_id");
                        //out.println("id="+id);
                        ++id;
                        sql="Insert into bookings(regid,dob,slot) values('"+regid+"','"+mydate+"',"+slot+")";
                        s1.executeUpdate(sql);
                        
                        sq2="Select * from login2 where regid="+regid+";";
                        ResultSet rs2=s2.executeQuery(sq2);
                        rs2.next();
                        email=rs2.getString("email");
                        System.out.println(email);
                      /*  
                        sq3="Select * from users2 where email=\""+email+"\";";
                        ResultSet rs3=s3.executeQuery(sq3);
                        rs3.next();*/
                        name=rs2.getString("name");
                        System.out.println(name);
                        
                        String serverurl="rmi://localhost/AddServer";
                        AddServerIntf addserverintf=(AddServerIntf) Naming.lookup(serverurl);
                        int f=addserverintf.notif(name, email, mydate, slot, regid);
                        
                        
			conn.close();
			out.println("Disconnected from database");
		}
                catch (Exception e) 
		{    
                        regid.trim();
			out.println(regid);
                        out.println("error "+e.getMessage());//e.getMessage());
		}
                
                
                
                
                 request.setAttribute("regid", regid);
                 request.setAttribute("date", mydate);
                 request.setAttribute("slot", slot);
                 request.setAttribute("email", name);
                 request.getRequestDispatcher("booked.jsp").forward(request, response);
                        
               //response.sendRedirect("index.jsp");
        
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
