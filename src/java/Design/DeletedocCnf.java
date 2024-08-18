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
public class DeletedocCnf extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            HttpSession session=request.getSession();
           //String user=session.getAttribute("s_user").toString();
            if(session.getAttribute("s_user")==null)
            {
                response.sendRedirect("Home?msg=Please Login First");
                 }
             String em=request.getParameter("em");
            DBConnection db=new DBConnection();
           db.pstmt=db.con.prepareStatement("delete from adddoc where email=?");
            db.pstmt.setString(1,em);
             int i=db.pstmt.executeUpdate();
            if(i>0)
            {
                
                response.sendRedirect("DeleteDoc?msg= Deleted Successfully");
                
                
            }
            else
            {
                out.println("Error");
            }
        } catch(Exception e) {            
            e.printStackTrace();
        }
    }
}
