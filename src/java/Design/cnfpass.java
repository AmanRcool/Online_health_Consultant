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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
public class cnfpass extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
          HttpSession session=request.getSession();
           
            String user=session.getAttribute("s_user").toString();
            String pass=request.getParameter("pass");
            String npass=request.getParameter("npass");
            String cpass=request.getParameter("cpass");
            DBConnection db=new DBConnection();
            db.stmt=db.con.createStatement();
            db.rst=db.stmt.executeQuery("select pass from login_mstr where user='"+user+"'");
            db.rst.next();
            String db_pass=db.rst.getString(1);
            if(pass.equals(db_pass))
            {
              if(npass.equals(cpass))  
              {
                  db.pstmt=db.con.prepareStatement("update login_mstr set pass=? where user=?");
                  db.pstmt.setString(1,npass);
                  db.pstmt.setString(2,user);
                  int i=db.pstmt.executeUpdate();
                  if(i>0)
                  {
                      response.sendRedirect("Chngpass?msg=Password Updated Successfully");
                  }
              }
              else
              {
                  response.sendRedirect("Chngpass?msg=New Password Does Not Match");
              }
            }
            else
            {
                response.sendRedirect("ChngPass?msg=Incorrect Old Password");
            }
            
           
            
        } catch(Exception e){            
           e.printStackTrace();
           out.println(e);
        }
    }

}