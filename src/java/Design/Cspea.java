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
public class Cspea extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
             String user=request.getParameter("user");
            /* HttpSession session=request.getSession();
          
            if(session.getAttribute("s_user")==null)
            {
                response.sendRedirect("Home?msg=Please Login First");
            } 
            */
  out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
          
            out.println("<link rel=stylesheet href=style.css>");
            out.println("<style type='text/css'>.box{height:1040px;width:900px;}") ;
            out.println("</style>");
            out.println("<style type='text/css'>.header{height:140px;width:900px;}");  
            
            out.println("</style>");
            out.println("<style type='text/css'>.menu{color:White;text-align:center;height:20px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.slider{color:White;text-align:center;height:180px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.main{background-color:lightsteelblue;height:500px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.footer{background-image:url(image/foot.jpg);text-decoration:none;text-align:center;height:70px;width:900px;} ");    
            out.println("</style>");
            out.println("<style type='text/css'>.link{display:block;color:White;background-color:#003366;text-decoration:none;text-align: center;} .link:hover{color:black;background-color:white;} .style1{color:#003366;}");        
            out.println("</style>");
             out.println("<center></head><body><div id=box>");
              out.println("<div class=header><img src=image/bn1.jpg style='height:140px; width:900px;'></div>");
               out.println("<div class=menu><table style='width:900px; border=0 cellpadding=0 cellspacing=0;'>");
            out.println("<tr style='width:900px'>");
            out.println("<td style='width:700px;'>");
            out.println("<marquee scrollamount=5 class=style1>..............Welcome in Our Hospital.You Can Take Appointment.......................</marquee>");
            out.println("</td>");
            out.println("<td style='width:10px'>");
            out.println("<img src=image/nav1.png>");
            out.println("</td>");
            
            out.println("<td style='width:190px;background-color:Black;'>");
            out.println("<a class=link href=PatientHome>PATIENT HOME</a></td>");
            out.println("<td style='width:190px;background-color:Black;'>");
            out.println("<a class=link href=Home>LOG OUT</a></td>");
           
            out.println("</tr>");
            out.println("</table>");
                     out.println("</div>");
             out.println("<div class=slider><img src=image/med.jpg style='height:180;width:900px;'></div>");
             
             
              out.println("<div class=main>");
            
              out.println("<center><br><b style='color:#003366;font-size:18px;'>Choose Your Doctor...</b><hr/>");
              out.println("<table style='width:600px;height:400px; cellspacing=0 cellpadding=0 border=0 '>");
              out.println("<form action=Report method=post>");
               // String user=session.getAttribute("s_user").toString();
              
              
              
               out.println("<tr style='height:40px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Patient name</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=user value='"+user+" 'style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
              try
              {
                  
             
            // String user=request.getParameter("user");
             // out.println("user"+user);
             String dl=request.getParameter("dl");
            //  out.println("dl"+dl);
              DBConnection db=new DBConnection();
              db.stmt=db.con.createStatement(); 
              db.rst=db.stmt.executeQuery("select dname,specialization,fee,email from adddoc where email='"+dl+"'");
              if(db.rst.next())
              {
            
            
             out.println("<tr style='height:40px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Specialization</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=sp value="+db.rst.getString(2)+" style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr style='height:40px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Doctor Name</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=dn value="+db.rst.getString(1)+" style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
            
            
            
            out.println("<tr style='height:40px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Doctor Email</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=dl value="+db.rst.getString(4)+" style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
            
            out.println("<tr style='height:40px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Fees</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=fe value="+db.rst.getString(3)+" style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
            }
             
                  
                //DBConnection db=new DBConnection();
             // db.stmt=db.con.createStatement();    
            
           db.rst=db.stmt.executeQuery("select  datee,dateee,dateeee from available where user='"+dl+"'");
           //out.println("ok1");
               if(db.rst.next())
            {
                
           //out.println("ok2");
                        
            String str1="";
            String str2="";
            String str3="";
            str1=db.rst.getString(1);
             str2=db.rst.getString(2);
              str3=db.rst.getString(3);
           // +","+db.rst.getString(2)+","+db.rst.getString(3);
            out.println("<tr style='height:40px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Date</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<select name=dt style=width:200px;'>");
            out.println("<option>SELECT DATE</option>");
            out.println("<option value="+str1+">"+str1+"</option><br>");
            out.println("<option value="+str2+">"+str2+"</option><br>");
            out.println("<option value="+str3+">"+str3+"</option><br>");
            //out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=dn value="+str+" style='width:180px;' />");
            //out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
            
                   // out.println("<input type=hidden name=dl value='"+dl+"'");
              //out.println("<input type=hidden name=user value='"+user+"'");
             
               }
            }
               catch(Exception e)
       {
           e.printStackTrace();
       } 
              // String user=request.getParameter("user");
             // out.println("user"+user);
              String dl=request.getParameter("dl");
               //out.println("ok3");
           // out.println("dl"+dl);
            //out.println("user"+user);
           out.println("<tr style='height:50px;color:#003366;'>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=submit value=FINALIZE style='width:80px;'</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=reset value=RESET style='width:80px;' />");
            out.println("</td>");
            out.println("<td style='width: 125px;'>&nbsp;</td>");
            out.println("</tr></form></table>");
            
              //out.println("<input type=hidden name=user value="+user+"");
             out.println("<input type=hidden name=user value='"+user+"'>");
             out.println("<input type=hidden name=dl value='"+dl+"'>");
              
            
           
            String str=request.getParameter("msg");
            if(str!=null)
            {
               out.println("<h3 style='color:red;'>"+str+"</h3>");
            }

                     out.println("</div>");
            
           
           out.println("<div class=footer>");
            out.println("<table style='width:900px;' cellpadding=0 cellspacing=0 border=0>");
            out.println("<tr>");
            out.println("<td style='width: 250px'>");
            out.println("</td>");
            out.println("<td style='width: 340px'>");
            out.println("</td>");
            out.println("<td style='width: 60px'>&nbsp;</td>");
            out.println("<td style='width: 65px'>&nbsp;</td>");
            out.println("<td style='width: 95px'>");
            out.println("<label style='color:red;'>New Patient?</label>");
            out.println("</td>");
            out.println("<td style='width: 90px'>");
            out.println("<a href=regis style='color:#003366;'>Register Here</a>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 250px'>&nbsp;</td>");
            out.println("<td style='width: 340px'>");
            out.println("<center>");
            out.println("<label style='color:#003366;'><b>Copyright reserved to Online Doctor Appointment</b> </label>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td style='width: 60px'&nbsp;</td>");
            out.println("<td style='width: 65px'>&nbsp;</td>");
            out.println("<td style='width: 95px'>&nbsp;</td>");
            out.println("<td style='width: 90px'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 250px'>&nbsp;</td>");
            out.println("<td style='width: 340px;color:#003366;'>");
            out.println("<center> Powered By: Online Doctor's  Team </center>");
            out.println("</td>");
            out.println("<td style='width: 60px'>&nbsp;</td>");
            out.println("<td style='width: 65px'>&nbsp;</td>");
            out.println("<td style='width: 95px'>&nbsp;</td>");
            out.println("<td style='width: 90px'>&nbsp;</td>");
            out.println("</tr>");
            out.println("</table>");
                     out.println("</div>");
             out.println("<div></div>");
            out.println("</div></center></body></html>");
        } 
       catch(Exception e)
       {
           e.printStackTrace();
       } 
    }
}
