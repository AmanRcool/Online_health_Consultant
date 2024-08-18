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
public class regis extends HttpServlet {

    
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
out.println("if(f.pn.value=='')");
out.println("{");
	out.println("alert('enter the Patient Name');");
	out.println("flag=1");
	out.println("return false;");
out.println("}");

out.println("else if(f.fm.value=='')");
out.println("{");
	out.println("alert('enter Father/Husband Name');");
	out.println("return false;");
out.println("}");

out.println("else if(f.user.value=='')");
out.println("{");
	out.println("alert('enter email ID');");
	out.println("return false;");
out.println("}");
out.println("else if(f.pass.value=='')");
out.println("{");
	out.println("alert('enter the password');");
	out.println("return false;");
out.println("}");
out.println("else if(f.mb.value=='')");
out.println("{");
	out.println("alert('enter the Mobile');");
	out.println("return false;");
out.println("}");
//out.println("else if(f.mb.length>10')");
//out.println("{");
//	out.println("alert('enter the 10 Digit Mobile');");
//	out.println("return false;");
//out.println("}");

out.println("else if(f.addr.value=='')");
out.println("{");
	out.println("alert('Enter the Address');");
	out.println("return false;");
out.println("}");

out.println("else if(f.pin.value=='')");
out.println("{");
	out.println("alert('enter the pin');");
	out.println("return false;");
out.println("}");

//out.println("else if(f.pin.value.length>6)");
//out.println("{");
//	out.println("alert('enter 6 Digit Pin');");
//	out.println("return false;");
//out.println("}");
out.println("if(flag==1)");
	out.println("{");
	out.println("history.go(0);return true;");
	out.println("}}");
out.println("</script>");


            
            out.println("<link rel=stylesheet href=style.css>");
            out.println("<style type='text/css'>.box{height:1040px;width:900px;}") ;
            out.println("</style>");
            out.println("<style type='text/css'>.header{height:140px;width:900px;}");  
            
            out.println("</style>");
            out.println("<style type='text/css'>.menu{color:White;text-align:center;height:20px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.slider{color:White;text-align:center;height:180px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.main{background-color:lightsteelblue;height:700px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.footer{background-image:url(image/foot.jpg);text-decoration:none;text-align:center;height:70px;width:900px;} ");    
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
             
             out.println("<center><br><b style='color:#003366;font-size:18px;'>PATIENT REGISTRATION.......</b><hr/>");
             out.println("<table style='width:600px;height:600px; cellspacing=0 cellpadding=0 border=0 '>");
            out.println("<form action=adddPDetails method=post name=frm>");
            
            
            out.println("<tr style='height:30px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Patient Name</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=pn style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
             out.println("<tr style='height:30px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Father's/Husband's Name</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=fm style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
            
            out.println("<tr style='height:30px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Email-Id</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=email name=user style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
            
            out.println("<tr style='height:30px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Password</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=password name=pass style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
            
             out.println("<tr style='height:30px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Mobile</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=number name=mb maxlength=10 style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
            
          
            
            
            
            
            out.println("<tr style='height:30px;color:#003366;'>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Address </td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp; :</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<textarea name=addr rows=3 cols=10 style='width:180px;' ></textarea>");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>"); 
            
              out.println("<tr style='height:40px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;City</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<select name=city style=width:180px;'><option value=LUCKNOW>LUCKNOW</option><option value=DELHI>DELHI</option><option value=AGRA>AGRA</option>  <option value=NOIDA>NOIDA</option> <option value=PUNE>PUNE</option>   <select/>");
            out.println("</td></tr>");
            
            
             out.println("<tr style='height:30px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;Pin</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=text name=pin maxlength=6 style='width:180px;' />");
            out.println("</td>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("</tr>");
            
              out.println("<tr style='height:40px;color:#003366;'>");
            out.println("<td style='width:50px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;State</td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;:</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<select name=state style=width:180px;'><option value=UP>UP</option><option value=MP>MP</option><option value=AP>AP</option>  <option value=MAHARASTRA>NOIDA</option> <option value=HIMANCHAL PRADESH>HIMANCHAL PRADESH</option>   <select/>");
            out.println("</td></tr>");
            
            
            
          
            
            
            out.println("<tr style='height:30px;color:#003366;'>");
            out.println("<td style='width: 150px;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=submit value=ADD style='width:80px;'  onclick='return valid(this.form);'></td>");
            out.println("<td style='width: 100px;text-align:center;'>&nbsp;</td>");
            out.println("<td style='width: 250px;text-align:left;'>&nbsp;<input type=reset value=RESET style='width:80px;' />");
            out.println("</td>");
            out.println("<td style='width: 125px;'>&nbsp;</td>");
            out.println("</tr></table>");
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
        finally {            
            out.close();
        }
    }
}
