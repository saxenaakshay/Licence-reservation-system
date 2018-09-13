/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Date;
import java.text.*;
import java.sql.Statement;
import javax.servlet.ServletException;
import java.sql.DriverManager;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/registerservlet"})
public class registerservlet extends HttpServlet {

    Connection con=null;
    String user=null;
    String lastname=null;
    String dob, Birthday_Day, Birthday_Month, Birthday_Year, Email_Id, Mobile_Number, Gender, Address, City, Pin_Code,
       State, Country, idtype, idno, ltype;
    Date date;
    int count=0;
    int flag=0;
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
        
        try
        {
            user=request.getParameter("First_Name");
            lastname=request.getParameter("Last_Name");
            Birthday_Day=request.getParameter("Birthday_Day");
            Birthday_Month=request.getParameter("Birthday_Month");
            Birthday_Year=request.getParameter("Birthday_Year");
            Email_Id=request.getParameter("Email_Id");
            Mobile_Number=request.getParameter("Mobile_Number");
            Gender=request.getParameter("Gender");
            Address=request.getParameter("Address");
            City=request.getParameter("City");
            Pin_Code=request.getParameter("Pin_Code");
            State=request.getParameter("State");
            Country=request.getParameter("Country");
            idtype=request.getParameter("idtype");
            idno=request.getParameter("idno");
            ltype=request.getParameter("ltype");
            dob=""+Birthday_Year+"-"+Birthday_Month+"-"+Birthday_Day;
            
           
            String q="insert into users2 values(\"" + user + "\",\"" +lastname +"\",\"" + dob + "\",\""+Email_Id+"\", \""+Mobile_Number+"\", \""+ Gender+"\", \"" + Address+"\", \"" +City +"\", \"" +Pin_Code+"\", \"" +State+"\", \"" +Country+"\", \"" +idtype+"\", \"" +idno+"\", \"" +ltype+"\");"; 
            System.out.println(q);
            Statement st=con.createStatement();
            flag=st.executeUpdate(q);
            
           
             q="select count(*) as total from users2;";
            Statement st1=con.createStatement();
            ResultSet rs=st1.executeQuery(q);
            rs.next();
            count=rs.getInt("total");
            
            q="insert into login2 values(\""+count+"\",\""+Email_Id+"\",\""+dob+"\", \""+user+"\");";
            Statement st2=con.createStatement();
            st.executeUpdate(q);
            System.out.println(count);
           
            String to[]={Email_Id};
            EmailSender es= new EmailSender();
            String Message="Hello "+user+",\n\t Thanks for completing registeration for driving license. We have successfully recieved your application.\n Kindly note that your registration number is \""+ count+"\". Please login to book your test slot.\n\n (This is a system generated email. Do not reply to this email.)  ";
            if(es.sendMail("licenseregservice@gmail.com", "akshaysaxena", Message, to))System.out.println("email sent successfully");
            else
                System.out.println("Some error");
            
          }
            catch (Exception e)
            {
             System.out.println(e);
             flag=-1;
            }  
            
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet registerservlet</title>");            
                out.println("</head>");
                out.println("<body>");
                System.out.println(flag);
                if (flag!=-1)
                out.println("<h1>Registration Successful!</h1><br><h3>Kindly note that your registration no is: "+count+"</h3>(You will need this to Login to book test slots)\nPlease check your email.");
                else
                out.println("<h1>DUPLICATE REGISTRATION NOT POSSIBLE!</h1>");
                out.println("</body>");
                out.println("</html>");
                flag=0;
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