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
public class adddPDetails extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String pn=request.getParameter("pn");
           String fm=request.getParameter("fm");
           String user=request.getParameter("user");
           String pass=request.getParameter("pass");
           String mb=request.getParameter("mb");
           String addr=request.getParameter("addr");
           String city=request.getParameter("city");
           String pin=request.getParameter("pin");
           String state=request.getParameter("state"); 
           out.println("user"+pn);
           out.println("fname"+fm);
           out.println("user"+user);
           out.println("pass"+pass);
           out.println("mb"+mb);
           out.println("add"+addr);
           out.println("city"+city);
           out.println("pin"+pin);
           out.println("state"+state);
           DBConnection db=new DBConnection();
           db.pstmt=db.con.prepareStatement("insert into pregis(pname,pfname,pemail,ppass,pmobile,padd,pcity,ppin,pstate)values(?,?,?,?,?,?,?,?,?)");
           db.pstmt.setString(1,pn);
           db.pstmt.setString(2,fm);
           db.pstmt.setString(3,user);
           db.pstmt.setString(4,pass);
           db.pstmt.setString(5,mb);
           db.pstmt.setString(6,addr);
           db.pstmt.setString(7,city);
           db.pstmt.setString(8,pin);
           db.pstmt.setString(9,state);
           
           int i=db.pstmt.executeUpdate();
           if(i>0)
            {
            db.pstmt=db.con.prepareStatement("insert into login_mstr(type,user,pass)values(?,?,?)");
            db.pstmt.setString(1,"Patient");
            db.pstmt.setString(2,user);
            db.pstmt.setString(3,pass);
            i=db.pstmt.executeUpdate();
            if(i>0)
             {
                    response.sendRedirect("Home?msg=Registered Successfully");

             }
             }
             else
              {
                    out.println("<h3>Error in Registration</h3>");
              }
                            
        } catch(Exception e) {
            out.println(e);
            e.printStackTrace();
        }
    }
}

