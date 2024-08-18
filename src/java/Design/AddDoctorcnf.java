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
public class AddDoctorcnf extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String dn=request.getParameter("dn");
           String em=request.getParameter("em");
           String pass=request.getParameter("pass");
           String sp=request.getParameter("sp");
           String r1=request.getParameter("r1");
           String addr=request.getParameter("addr");
            String fe=request.getParameter("fe");
           DBConnection db=new DBConnection();
           db.pstmt=db.con.prepareStatement("insert into adddoc(dname,pass,email,specialization,ms,address,fee,time,date)values(?,?,?,?,?,?,?,curtime(),curdate())");
           
           db.pstmt.setString(1,dn);
           db.pstmt.setString(2,pass);
           db.pstmt.setString(3,em);
           db.pstmt.setString(4,sp);
           db.pstmt.setString(5,r1);
           db.pstmt.setString(6,addr);
            db.pstmt.setString(7,fe);
           int i=db.pstmt.executeUpdate();
            if(i>0)
            {
            db.pstmt=db.con.prepareStatement("insert into login_mstr(type,user,pass)values(?,?,?)");
            db.pstmt.setString(1,"Doctor");
            db.pstmt.setString(2,em);
            db.pstmt.setString(3,pass);
            i=db.pstmt.executeUpdate();
           if(i>0)
            {
                 response.sendRedirect("AddDoctor?msg= Doctors Are Added Successfully");

             }
             
             else
              {
                    out.println("<h3>Error</h3>");
              }
                       
            }
        }
         catch(Exception e) {  
             out.println(e);
            e.printStackTrace();
        }
    }
}