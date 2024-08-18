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
public class UpdatedocCnf extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String em=request.getParameter("em");
           String dn=request.getParameter("dn"); 
           
           String pass=request.getParameter("pass");
           String sp=request.getParameter("sp");
           String r1=request.getParameter("r1");
           String addr=request.getParameter("addr");
           out.println("email="+em);
           out.println("dn="+dn);
           out.println("password="+pass);
           out.println("ms/md="+r1);
           out.println("address="+addr);
                   
           
           DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("update adddoc set dname=?,pass=?,specialization=?,ms=?,address=? where email=?");
            db.pstmt.setString(1,dn);
            db.pstmt.setString(2,pass);
            db.pstmt.setString(3,sp);
            db.pstmt.setString(4,r1);
            db.pstmt.setString(5,addr);
            db.pstmt.setString(6,em);
          
            int i=db.pstmt.executeUpdate();
            if (i >0){
            response.sendRedirect("UpdateDocInfo?msg=Updated Successfully");
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