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
 * @author Dell
 */
public class ModifyFeescnf extends HttpServlet {

   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
          
            String user=request.getParameter("user");
             String df=request.getParameter("df");
             
              out.println("em="+user);
           out.println("dn="+df);
             
              DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("update adddoc set fee=? where email='"+user+"'");
            db.pstmt.setString(1,df);
           // db.pstmt.setString(2,user);
          
            int i=db.pstmt.executeUpdate();
            if (i>0)
            {
            response.sendRedirect("DoctorHome?msg=Fees Updated Successfully");
            }
            else
            {
               out.println("<h3>ERROR</h3>");
            }
            
            
        }
        catch(Exception e)
        {
            out.println(e);
            e.printStackTrace();
        }
    }

}