/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

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
public class Home extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
            out.println("<script language=javascript>");
out.println("function valid(f)");
out.println("{");
out.println("var flag=0");
out.println("if(f.user.value=='')");
out.println("{");
	out.println("alert('enter the User name');");
	out.println("f.t1.focus()");
	out.println("flag=1");
	out.println("return false;");
out.println("}");
out.println("if(f.pass.value=='')");
out.println("{");
	out.println("alert('enter the password');");
	out.println("f.pass.focus()");
	out.println("flag=1");
	out.println("return false;");
out.println("}");
out.println("if(flag==1)");
	out.println("{");
	out.println("history.go(0);return true;");
	out.println("}}");
out.println("</script>");
            
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
            out.println("<style type='text/css'>.footer{background-image:url(image/foot.jpg);text-decoration:none;text-align:center;height:70px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.link{display:block;color:White;background-color:#003366;text-decoration:none;text-align: center;} .link:hover{color:black;background-color:white;} .style1{color:#003366;}");        
            out.println("</style>");
            out.println("<center></head><body>");
            out.println("<div class=header><img src=image/bn1.jpg style='height:140px; width:900px;'></div>");
            out.println("<div class=menu><table style='width:900px; border=0 cellpadding=0 cellspacing=0;'>");
            out.println("<tr style='width:900px'>");
            out.println("<td style='width:200px;'>");
            out.println("<marquee scrollamount=3 class=style1>Welcome in Our Hospital.You Can Take Appointment ........</marquee>");
            out.println("</td>");
            out.println("<td style='width:10px'>");
            out.println("<img src=image/nav1.png>");
            out.println("</td>");
            out.println("<td style='width:130px;background-color:Black;'>");
            out.println("<a class=link href=Home>HOME</a></td>");
            out.println("<td style='width:140px;background-color:Black;'>");
            out.println("<a class=link href=about>ABOUT US </a></td>");
            out.println("<td style='width:140px;background-color:Black;'>");
            out.println("<a class=link href=facility>FACILITY</a></td>");
            out.println("<td style='width:140px;background-color:Black;'>");
            out.println("<a class=link href=feedback> FEEDBACK </a>");
            out.println("</td>");
            out.println("<td style='width:140px;background-color:Black;'>");
            out.println("<a class=link href=cont>CONTACT US </a>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
            out.println("<div class=slider><img src=image/s.jpg  style='height:180;width:900px;'></div>");
            out.println("<div class=main>");
            out.println("<div style='width:250px;margin-left:2px;height:400px;float:left;background-color:lightsteelblue;'>");
	    out.println("<form action=LoginConf method=post name=f>");
	    out.println("<table style='width:250px;border:1px solid #003366;'>");
            out.println("<tr>");
            out.println("<td style='background-color:#003366;text-align:center;height:30px;'>");
            out.println("<span style='color:white;font-weight:bold;'>Log In</span>");
            out.println("</td>");
	    out.println("</tr>");
            out.println("<tr>");
	    out.println("<td style='text-align:left;color:#003366;'> &nbsp;&nbsp;UserType :</td>");
	    out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td style='text-align:left;'> &nbsp;&nbsp;<select name=type style=width:200px;'><option value=Admin>Admin</option><option value=Doctor>Doctor</option><option value=Patient>Patient</option></select>"); 
            out.println("</td>");
	    out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td style='text-align:left;color:#003366;'> &nbsp;&nbsp;Username :</td>");
	    out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td style='text-align:left;'> &nbsp;&nbsp;<input type=text name=user style=width:200px;'>"); 
            out.println("</td>");
	    out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td style='text-align:left;color:#003366;'> &nbsp;&nbsp;Password :</td>");
	    out.println("</tr>");
	    out.println("<tr>"); 
	    out.println("<td style='text-align:left;'> &nbsp;&nbsp;<input type=password name=pass style=width:200px;'>"); 
            out.println("</td>");
	    out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td style='text-align:left;'>&nbsp;&nbsp;&nbsp;<input type=submit name=s value=SUBMIT style='width:90px;'  onclick='return valid(this.form);'>&nbsp;&nbsp;<input type=reset name=r value=RESET style='width:90px;'>");
	    out.println("</td>");
	    out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td style='text-align:left;color:#003366;'> &nbsp;&nbsp;&nbsp;&nbsp;New Patient ?<a href=regis> CLICK HERE</a></td>");
            out.println("</tr>");
           
	    out.println("</table>");
	     out.println("</form>");
            String str=request.getParameter("msg");
            if(str!=null)
            {
               out.println("<h3 style='color:#003366;'>"+str+"</h3>");
            }
            out.println("<table style='width:250px;border:1px solid #003366;'>");
            out.println("<tr>");
	    out.println("<td style='background-color: #003366;text-align:center;height:20px;'>");
	    out.println("<span style='color:white;font-weight:bold;'>News Panel</span>");
	    out.println("</td>");
            out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td style='text-align:left;color:red;'>"); 
            out.println("<marquee scrollamount=4 direction=up style='color:black;height:100px;' onmouseover=this.stop(); onmouseout=this.start();>");
            out.println("* You can freely register here<br><hr><br> * You can freely register<br><hr><br>* You can freely register<br><hr><br>* You can freely register<br><hr><br>"); 
            out.println("</marquee>");
            out.println("</td>");
	    out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
            out.println("<div style='width:648px;height:400px;float:left;background-color:lightsteelblue;'>");
            out.println("<table style='width: 648px;'>");
            out.println("<tr>");
            out.println("<td style='width: 4px'>&nbsp;</td>");
            out.println("<td style='width: 640px; text-align: center;'>");
            out.println("<img id='ctl00_ContentPlaceHolder1_Image3' src=image/doctors.png style='border-width:0px;height:200px;width:630px;' />");
            out.println("</td>");
            out.println("<td style='width: 4px'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 4px'>&nbsp;</td>");
            out.println("<td style='width: 640px'>");
            out.println("<table style='width: 640px; text-align:left;'>");
            out.println("<tr>");
            out.println("<td style='width: 10px'>&nbsp;</td>");
            out.println("<td style='width: 630px'>&nbsp;The Online Doctor Appointment System is Online Web Based Appointment System by which patient and doctor can servicing their client .:</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 10px'>");
            out.println("<img id=ctl00_ContentPlaceHolder1_Image6 src=image/bulet.jpg style='border-width:0px;' />");
            out.println("</td>");
            out.println("<td style='width: 630px'>&nbsp;This system is to make patient easier to get service of doctor.&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 10px'>&nbsp;<img id=ctl00_ContentPlaceHolder1_Image7 src=image/bullet.jpg style=border-width:0px; />");
            out.println("</td>");
            out.println("<td style='width: 630px'>&nbsp;This system has feature to allow client for taken appointment of doctor from their place. &nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 10px'>&nbsp;<img id=ctl00_ContentPlaceHolder1_Image8 src=image/bullet.jpg style='border-width:0px;' />");
            out.println("</td>");
            out.println("<td style='width: 630px'>&nbsp;This system offers an effective solution where user can view various booking slot available and select the preferred date and time. &nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 10px'>&nbsp;<img id=ctl00_ContentPlaceHolder1_Image9 src=image/bullet.jpg style='border-width:0px;' />");
            out.println("</td>");
            out.println("<td style='width: 630px'>&nbsp;This system helps to reduce the waiting time of the patient.&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width:10px'>");
            out.println("<img id=ctl00_ContentPlaceHolder1_Image10 src=image/bulet.jpg style=border-width:0px; />");
            out.println("</td>");
            out.println("<td style='width: 630px'>&nbsp;This system is very user friendly.&nbsp;</td>");
            out.println("</tr>");
          
            out.println("</table>");
            out.println("</td>");
            out.println("<td style='width: 4px'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 4px'>&nbsp;</td>");
            out.println("<td style='width: 640px'>&nbsp;'</td>");
            out.println("<td style='width: 4px'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 4px'>&nbsp;</td>");
            out.println("<td style='width: 640px'>&nbsp;</td>");
            out.println("<td style='width: 4px'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 4px'>&nbsp;</td>");
            out.println("<td style='width: 640px'>&nbsp;</td>");
            out.println("<td style='width: 4px'>&nbsp;</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
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