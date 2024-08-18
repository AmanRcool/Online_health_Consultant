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
public class ModifyFees extends HttpServlet {

   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
          /*
            
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
            out.println("<td style='width:510px;'>");
            out.println("<marquee scrollamount=5 class=style1>..............Welcome in Our Hospital.You Can Take Appointment.......................</marquee>");
            out.println("</td>");
            out.println("<td style='width:10px'>");
            out.println("<img src=image/nav1.png>");
            out.println("</td>");
            out.println("<td style='width:190px;background-color:Black;'>");
            out.println("<a class=link href=DoctorHome>DOCTOR HOME</a></td>");
            
            out.println("<td style='width:190px;background-color:Black;'>");
            out.println("<a class=link href=Home>LOG OUT</a></td>");
          
            out.println("</tr>");
            out.println("</table>");
                     out.println("</div>");
             out.println("<div class=slider><img src=image/doctors.png style='height:180;width:900px;'></div>");
            
             
              out.println("<div class=main>");
              out.println("<center><br><b style='color:#003366;font-size:18px;'>DOCTORS CAN MODIFY THEIR FEE...</b><hr/></center>");
               out.println("<table style='width:600px;height:200px; cellspacing=0 cellpadding=0 border=0 '>");
            out.println("<form action=ModifyFeescnf method=post>");
            
             String em=request.getParameter("user");
             String fe=request.getParameter("fe");
             DBConnection db=new DBConnection();
             db.stmt=db.con.createStatement(); 
             db.rst=db.stmt.executeQuery("select fee from adddoc where email='"+em+"'");
             if(db.rst.next())
            {    
            out.println("<tr style='height:50px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Doctor's Fee</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=df value="+db.rst.getString(1)+" style='width:180px;' />");
            out.println("</td></tr>");
             out.println("<input type=hidden name=em  value='"+em+"'>");
           out.println("<tr style='height:50px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;<input type=submit value=MODIFY style='width:100px;' /></td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
           
            out.println("</tr></table>");
             out.println("</form>");
            }
              String str=request.getParameter("msg");
            if(str!=null)
            {
               out.println("<h3 style='color:#003366;'>"+str+"</h3>");
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
        catch(Exception e) {            
            out.println(e);
        }
    }
}*/
            
            
            
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
            out.println("<td style='width:510px;'>");
            out.println("<marquee scrollamount=5 class=style1>..............Welcome in Our Hospital.You Can Take Appointment.......................</marquee>");
            out.println("</td>");
            out.println("<td style='width:10px'>");
            out.println("<img src=image/nav1.png>");
            out.println("</td>");
            out.println("<td style='width:190px;background-color:Black;'>");
            out.println("<a class=link href=DoctorHome>DOCTOR HOME</a></td>");
            
            out.println("<td style='width:190px;background-color:Black;'>");
            out.println("<a class=link href=Home>LOG OUT</a></td>");
          
            out.println("</tr>");
            out.println("</table>");
                     out.println("</div>");
             out.println("<div class=slider><img src=image/doctors.png style='height:180;width:900px;'></div>");
             
             
              out.println("<div class=main>");
           
              out.println("<center><br><b style='color:#003366;font-size:18px;'>DOCTORS CAN MODIFY THEIR FEE...</b><hr/></center>");
               out.println("<table style='width:600px;height:300px; cellspacing=0 cellpadding=0 border=0 '>");
            out.println("<form action=ModifyFeescnf method=post>");
            
             String user=request.getParameter("user");
            // String fe=request.getParameter("fe");
             DBConnection db=new DBConnection();
             db.stmt=db.con.createStatement(); 
             db.rst=db.stmt.executeQuery("select email,fee from adddoc where email='"+user+"'");
             if(db.rst.next())
            {  
                
                 out.println("<tr style='height:50px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Doctor's Email</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=user value="+db.rst.getString(1)+" style='width:180px;' />");
            out.println("</td></tr>");
            
            out.println("<tr style='height:50px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Doctor's Fee</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=Number name=df value="+db.rst.getString(2)+" style='width:180px;' />");
            out.println("</td></tr>");
            
             
             
           out.println("<tr style='height:50px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;<input type=submit value=MODIFY style='width:100px;'></td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td></tr>");
           
            out.println("</form></table>");
            
            
            
            }
              out.println("<input type=hidden name=user  value='"+user+"'>");
              String str=request.getParameter("msg");
            if(str!=null)
            {
               out.println("<h3 style='color:#003366;'>"+str+"</h3>");
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
       catch(Exception e) {            
            out.println(e);
        }
    }
}

