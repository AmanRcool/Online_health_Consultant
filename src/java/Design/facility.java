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
public class facility extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
           /* out.println("<script>");
        out.println("var i = 0");
        out.println("var arr = [a.jpg,b.jpg,c.jpg,m1.png,me.jpg,med.jpg,mw.jpg]");
        out.println("function moveSlider() {");
       
            out.println("var imgctrl = document.getElementById(img1)");
            out.println("imgctrl.src = image + arr[i]");
            out.println("i++");
           out.println(" if(i==arr.length){ i = 0}");
            
              
            
            //out.println("setTimeout(moveSlider(),2000)}");
       
    out.println("</script>");*/
            
            out.println("<link rel=stylesheet href=style.css>");
            out.println("<style type='text/css'>.box{height:840px;width:900px;}") ;
            out.println("</style>");
            out.println("<style type='text/css'>.header{height:140px;width:900px;}");  
            
            out.println("</style>");
            out.println("<style type='text/css'>.menu{color:White;text-align:center;height:20px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.slider{color:White;text-align:center;height:180px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.main{background-color:lightsteelblue;height:430px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.footer{background-image:url(image/foot.jpg);text-decoration:none;text-align:center;height:70px;width:900px;} ");    
            out.println("</style>");
            out.println("<style type='text/css'>.link{display:block;color:White;background-color:#003366;text-decoration:none;text-align: center;} .link:hover{color:black;background-color:white;} .style1{color:#003366;}");        
            out.println("</style>");
             out.println("<center></head><body onLoad=moveSlider()><div id=box>");
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
             out.println("<div class=slider><img src=image/c.jpg  style='height:180;width:900px;'></div>");
              out.println("<div class=main>");
              
              out.println("<div style='width:900px; background-color:lightsteelblue;'>");
            out.println("<table style='width:900px; border=0 cellpadding=0 cellspacing=0'>");
            out.println("<tr>");
            out.println("<td style='width:550px;'>");
            out.println("<div>");
            out.println("<table style='width:550px; border=0 cellpadding=0 cellspacing=0'>");
            
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 500px;'>");
            out.println("<table style='border: 2px solid #003366; width: 500px; font-size: 16px; text-align: left;'>");
           
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 390px;'>");
            out.println("<font color=#003366 style='font-variant: small-caps; font-size: large;'>&nbsp;&nbsp;&nbsp;&nbsp;Benifits</font> of Online Doctor appointment...........</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 390px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>");
            out.println("<img id=ctl00_ContentPlaceHolder1_Image5 src=image/bulet.jpg style=border-width:0px; />");
            out.println("</td>");
            out.println("<td style='width: 390px;'>&nbsp; &nbsp;Get easy,confirmed and secure online appointments,monitor &nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 390px;'>&nbsp;appointment for multiple clinic,&nbsp;</td>");
            out.println("</tr>");
              out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 390px;'>&nbsp;&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>");
            out.println("<img id=ctl00_ContentPlaceHolder1_Image6 src=image/bulet.jpg style=border-width:0px; />");
            out.println("</td>");
            out.println("<td style='width: 390px;'>&nbsp;View your upcoming appointments,Send and receive automated&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 390px;'>&nbsp; reminder for appointment. &nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 390px;'>&nbsp;&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>");
            out.println("<img id=ctl00_ContentPlaceHolder1_Image7 src=image/bulet.jpg style=border-width:0px; />");
            out.println("</td>");
            out.println("<td style='width: 390px;'>&nbsp;Book appointment for walk-in patients,Keep a track of your clients.&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 390px;'>&nbsp;&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>");
            out.println("<img id=ctl00_ContentPlaceHolder1_Image8 src=image/bulet.jpg style=border-width:0px; />");
            out.println("</td>");
            out.println("<td style='width: 390px;'> &nbsp;Manage your personal profile,accept or reject appointment as per&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 390px;'>&nbsp;   your convenience.&nbsp;</td>");
            out.println("</tr>");
              out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 390px;'>&nbsp;&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 5px;'>&nbsp;</td>");
            out.println("<td style='width: 390px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</td>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 500px;'>&nbsp;</td>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
            out.println("</td>");
            out.println("<td style='width: 350px;'>");
            out.println("<div>");
            out.println("<table style='width: 350px; border=0 cellpadding=0 cellspacing=0'>");
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 300px;'>&nbsp;</td>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 25px;'></td>");
            out.println("<td style='width: 300px;'>");
            out.println("<img id=ctl00_ContentPlaceHolder1_Image10 src=image/p.jpg style='border-width:0px;height:350px;width:290px;'/>");
            out.println("</td>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 300px;'>&nbsp;</td>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("</tr>");               
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 300px;'>&nbsp;</td>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 300px;'>&nbsp;</td>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 300px;'>&nbsp;</td>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 300px;'>&nbsp;</td>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
              
              
              
              
              
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
        
        } finally {            
            out.close();
        }
    }
}