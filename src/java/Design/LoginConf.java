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
import javax.servlet.http.*;
 
public class LoginConf extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
          String user=request.getParameter("user");
          String pass=request.getParameter("pass");
          String type=request.getParameter("type");
          out.println("user"+user);
          out.println("pass"+pass);
          out.println("type"+type);
          if(user=="")
          {
              response.sendRedirect("Home");
          }
          DBConnection db=new DBConnection();
          db.stmt=db.con.createStatement();
          db.rst=db.stmt.executeQuery("select pass,type,status from login_mstr where user='"+user+"'");
          if(db.rst.next())
          {
          String db_pass=db.rst.getString(1);
          String db_type=db.rst.getString(2);
          String db_status=db.rst.getString(3);
              if (db_status.equals("1"))
              {
              if(pass.equals(db_pass)) 
              {
                 
               if(db_type.equalsIgnoreCase(type)&&db_type.equalsIgnoreCase("Admin"))
               {
                   HttpSession session=request.getSession();
                   session.setAttribute("s_user",user);
                   response.sendRedirect("AdminHome?user="+user);
               }
               else
               {
                   if(db_type.equalsIgnoreCase(type)&&db_type.equalsIgnoreCase("Doctor"))
               {
                   HttpSession session=request.getSession();
                   session.setAttribute("s_user",user);
                   response.sendRedirect("DoctorHome?user="+user);
               }
               else
                       if(db_type.equalsIgnoreCase(type)&&db_type.equalsIgnoreCase("Patient"))
               {
                   HttpSession session=request.getSession();
                   session.setAttribute("s_user",user);
                   response.sendRedirect("PatientHome?user="+user);
               }
              }
              }
              else
               {
                           response.sendRedirect("Home?msg=Password Does Not Match");
               }
               }
              else
              {
                  response.sendRedirect("Home?msg=This user is not approve");
              }
              }
              else
              {
               response.sendRedirect("Home?msg=Incorrect User Type");
              }
              }
         catch(Exception e)
        {
            e.printStackTrace();
            out.println(e);
        }
        }
       }
           