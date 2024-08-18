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
public class Cspeacnf extends HttpServlet {

   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String user=request.getParameter("user");
             String dt=request.getParameter("dt");
          String fe=request.getParameter("fe");
           String dl=request.getParameter("dl");
           DBConnection db=new DBConnection();
           
            
           db.pstmt=db.con.prepareStatement("insert into patientlist(demail,pemail,date,fee)values(?,?,?,?)");
           
           db.pstmt.setString(1,dl);
            db.pstmt.setString(2,user);
          db.pstmt.setString(3,dt);
           db.pstmt.setString(4,fe);
         
           
           int i=db.pstmt.executeUpdate();
           
           if(i>0)
            {
                 out.println("<input type=hidden name=user value='"+user+"'>");
             out.println("<input type=hidden name=dl value='"+dl+"'>");    
            out.println("dl"+dl);
            out.println("user"+user);
                 response.sendRedirect("Report?msg=Date Added Successfully");

             }
             
             else
              {
                    out.println("<h3>Error</h3>");
              }
                out.println("<input type=hidden name=user value='"+user+"'>");
             out.println("<input type=hidden name=dl value='"+dl+"'>");    
            out.println("dl"+dl);
            out.println("user"+user);
            }
         
         catch(Exception e) {  
             out.println(e);
            e.printStackTrace();
        }
    }
}