/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet(urlPatterns = {"/cancel"})
public class cancel extends HttpServlet {

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
      //  PrintWriter out = response.getWriter();
     	String n=request.getParameter("regid");
	int bid= Integer.parseInt(request.getParameter("bid"));
                String sql="";
                Statement s1;    
             //   out.println("Welcome" + n);
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
		//	out.println("Connected to the database");
                    sql= "Insert into cancellations values("+bid+",'"+n+"');";
                        s1=conn.createStatement();
                      s1.executeUpdate(sql);
                        
                      //  DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                        //  Calendar calobj = Calendar.getInstance();
                        //  out.println(df.format(calobj.getTime()));
                        //  out.println("<form> Pick a booking date:<input type='date' name='mydate' min='"+df.format(calobj.getTime())+"'> </form>");
                       
                      request.getRequestDispatcher("index.jsp").forward(request, response);
                        //response.sendRedirect("datepick.jsp");
                      
			conn.close();
		//	out.println("Disconnected from database");
		}
                catch (Exception e) 
		{    
                    System.out.println("error "+e.getMessage());//e.getMessage());
		}   
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cancel</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cancel at " + request.getContextPath() + "</h1>");
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
