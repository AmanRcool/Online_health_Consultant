 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import DB.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SHASHANK
 */
public class Reportcnf extends HttpServlet {

   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String dn=request.getParameter("dn");
           String dl=request.getParameter("dl");
        
           String sp=request.getParameter("sp");
           String pn=request.getParameter("pn");
            String pe=request.getParameter("pe");
           String pa=request.getParameter("pa");
            String dt=request.getParameter("dt");
             String fe=request.getParameter("fe");
           DBConnection db=new DBConnection();
           
            
           db.pstmt=db.con.prepareStatement("insert into patientlist(dname,demail,specialization,pname,pemail,paddress,date,fee)values(?,?,?,?,?,?,?,?)");
           
           db.pstmt.setString(1,dn);
           db.pstmt.setString(2,dl);
           db.pstmt.setString(3,sp);
           db.pstmt.setString(4,pn);
            db.pstmt.setString(5,pe);
           db.pstmt.setString(6,pa);
            db.pstmt.setString(7,dt);
             db.pstmt.setString(8,fe);
         
           
           int i=db.pstmt.executeUpdate();
           
           if(i>0)
            {
                 response.sendRedirect("PatientHome?msg=Patient Are Added Successfully");

             }
             
             else
              {
                    out.println("<h3>Error</h3>");
              }
                       
            }
        
         catch(Exception e) {  
             out.println(e);
            e.printStackTrace();
        }
    }
}