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
public class Location extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
  out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
          
            out.println("<link rel=stylesheet href=style.css>");
            out.println("<style type='text/css'>.box{height:840px;width:900px;}") ;
            out.println("</style>");
            out.println("<style type='text/css'>.header{height:140px;width:900px;}");  
            
            out.println("</style>");
            out.println("<style type='text/css'>.menu{color:White;text-align:center;height:20px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.slider{color:White;text-align:center;height:180px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.main{background-color:lightsteelblue;height:400px;width:900px;}");    
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
              
              out.println("<center><br><b style='color:#003366;font-size:18px;'>PLEASE  SELECT  LOCATION  HERE...</b><hr/></center>");
              out.println("<center><table style='width:600px;height:250px; cellspacing=0 cellpadding=0 border=0 '>");
            
            out.println("<form action=Dlist method=post>");
           
            
            try
            {
                 String user=request.getParameter("user");
                 //out.println("user"+user);
            DBConnection db=new DBConnection();
            db.stmt=db.con.createStatement();
            db.rst=db.stmt.executeQuery("SELECT DISTINCT address FROM adddoc ");
            out.println("<tr style='height:50px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Location</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<select name=city style=width:200px;'>");
            out.println("<option>SELECT CITY</option>");
           
            while(db.rst.next())
                    {
                
             out.println("<option value="+db.rst.getString(1)+">"+db.rst.getString(1)+"</option>");
                    }
             out.println("</select></td></tr>");
              // out.println("<input type=hidden name=user value='"+user+"'>");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
             
            
             try
            {
                 String user=request.getParameter("user");
                // out.println("user"+user);
            DBConnection db=new DBConnection();
            db.stmt=db.con.createStatement();
            db.rst=db.stmt.executeQuery("SELECT DISTINCT specialization FROM adddoc ");
           
            out.println("<tr style='height:50px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Specialization</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<select name=sp style=width:200px;'>");
            out.println("<option>SELECT SPECIALIZATION</option>");
           
            while(db.rst.next())
                    {
                
             out.println("<option value="+db.rst.getString(1)+">"+db.rst.getString(1)+"</option>");
                    }
             out.println("</select></td></tr>");
            
            
            
             //out.println("<input type=hidden name=user  value='"+user+"'>");
             
           }
            catch(Exception e)
            {
                e.printStackTrace();
            }
             
            
            
            out.println("<tr style='height:50px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;<input type=submit value=CHOOSE style='width:100px;' /></td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
           
            out.println("</tr>");
            String user=request.getParameter("user");
            //out.println("user"+user);
            out.println("<input type=hidden name=user  value='"+user+"'>");
            String str=request.getParameter("msg");
            if(str!=null)
            {
               out.println("<h3 style='color:red;'>"+str+"</h3>");
            }
out.println("</form></table>");
            
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
        finally {            
            out.close();
        }
    }
}
