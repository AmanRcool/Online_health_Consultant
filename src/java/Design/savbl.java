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
public class savbl extends HttpServlet {

  
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String user=request.getParameter("em");
           String dt1=request.getParameter("dt1");
           String r1=request.getParameter("r1");
           String dt2=request.getParameter("dt2");
           String r2=request.getParameter("r2");
           String dt3=request.getParameter("dt3");
           String r3=request.getParameter("r3");
            
           DBConnection db=new DBConnection();
           db.pstmt=db.con.prepareStatement("insert into available(user,datee,stone,dateee,sttwo,dateeee,stthree)values(?,?,?,?,?,?,?)");
           
           db.pstmt.setString(1,user);
           db.pstmt.setString(2,dt1);
           db.pstmt.setString(3,r1);
           db.pstmt.setString(4,dt2);
           db.pstmt.setString(5,r2);
           db.pstmt.setString(6,dt3);
            db.pstmt.setString(7,r3);
           int i=db.pstmt.executeUpdate();
            if(i>0)
            {
           
         response.sendRedirect("DoctorHome?msg=  Set Successfully");

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