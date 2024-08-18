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
public class feedback extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
            /*out.println("<script>");
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
            out.println("<style type='text/css'>.main{background-color:lightsteelblue;height:400px;width:900px;}");    
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
            out.println("<div class=slider><img src=image/f.jpg  style='height:180;width:900px;'></div>");
              out.println("<div class=main>");
             
              
            /*  
                out.println("<table style='width:900px border=0 cellpadding=0 cellspacing=0'>");
            out.println("<tr style='width:900px;'>");
            out.println("<td style='width:900px;'>");   
            out.println("<div style='width: 900px; background-color: #F4E7BD;'>");
            out.println("<table style='width: 900px; border=0 cellpadding=0 cellspacing=0'>");
            out.println("<tr>");
            out.println("<td style='width: 550px;'></td>");
            out.println("<div>");
            
            
            out.println("<table style='width: 550px; border=0 cellpadding=0 cellspacing=0'>");
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 500px;'>&nbsp;</td>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 500px;'>");
            out.println("<table style='border: 2px solid #003366; width: 500px; text-align: left; font-size: 17px; border=0 cellpadding=0 cellspacing=0'>");
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("<td style='width: 400px;'>&nbsp;</td>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            
            out.println("<td style='width: 400px;'>&nbsp;&nbsp; Patient Name:<input type=text></td>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("<td style='width: 400px;'>&nbsp;&nbsp;Patient Address:<input type=text></td>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("</tr>");
           
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("<td style='width: 400px;'>&nbsp;&nbsp;Patient Mobile:<input type=text>&nbsp;</td>");
             out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("</tr>");
           
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            
            out.println("<td style='width: 400px;'>&nbsp;&nbsp;Patient Email:<input type=text>&nbsp;</td>");
             out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("<td style='width: 400px;'>&nbsp;</td>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            
             out.println("<td style='width: 400px;'>&nbsp;&nbsp;Your Query:<input type=text>&nbsp;</td>");
             out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("<td style='width: 400px;'>&nbsp;</td>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            
            out.println("<td style='width: 400px;'>&nbsp;&nbsp;<input type=submit value=SEND>&nbsp;&nbsp;<input type=reset value=RESET>&nbsp;</td>");
             out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("<td style='width: 400px;'>&nbsp;</td>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td style='width: 50px;'>&nbsp;</td>");
          
            out.println("<div>");
            out.println("<table style='width:350px; border=0 cellpadding=0 cellspacing=0'>");
            out.println("<tr>");
            out.println("<td style='width: 25px;'>&nbsp;</td>");
            out.println("<td style='width: 300px;'>");
            out.println("<img id=ctl00_ContentPlaceHolder1_Image12 src=image/ui.png style='border-width:0px;' />");
            out.println("</td>");
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
              */
           out.println("<table style='width: 900px;height:100px; border=0 cellpadding=0 cellspacing=0'>");
            out.println(" <tr><td style='width: 550px;'><div style='width: 550px;'><table style='width:550px;height:100px;'>");
            out.println("<tr><td style='width: 25px;'>&nbsp;</td><td style='width: 500px;'>&nbsp;</td><td style='width: 25px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 25px;'>&nbsp;</td><td style='width: 500px;'><table style='border: 2px solid #003366; width:500px;height:100px; text-align: left;'>");
            out.println("<tr><td style='width: 145px;'>&nbsp;</td><td style='width: 5px;'>&nbsp;</td><td style='width: 350px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 145px;'>&nbsp;<span id=ctl00_ContentPlaceHolder1_nameLbl>Patient Name</span></td><td style='width: 5px;'>:</td><td style='width: 350px;'>&nbsp;");
            out.println("<input name=pname type=text id=ctl00_ContentPlaceHolder1_TextBox1 style='border-top-width: 1px; border-right-width: 1px; border-bottom-width: 1px; border-left-width: 1px; padding-top: 0px; padding-right: 0px; padding-bottom: 0px; padding-left: 0px; margin-top: 0px; margin-bottom: 0px; border-top-color: rgb(221, 221, 221); border-right-color: rgb(221, 221, 221); border-bottom-color: rgb(221, 221, 221); border-left-color: rgb(221, 221, 221); border-top-style: solid; border-right-style: solid; border-bottom-style: solid; border-left-style: solid; height: 25px; width: 132px; font-family: Arial, Helvetica, sans-serif; font-size: 8pt; color: rgb(128, 128, 128); background-color: rgb(240, 240, 240);' />");
            out.println("</td></tr><tr><td style='width: 145px;'>&nbsp;</td><td style='width: 5px;'>&nbsp;</td><td style='width: 350px;'>&nbsp;</td </tr>");
            out.println("<tr><td style='width: 145px;'>&nbsp;<span id=ctl00_ContentPlaceHolder1_addLbl>Address</span></td><td style='width: 5px;'>:</td><td style='width: 350px;'>");
            out.println("&nbsp;<input type=text name=add style='border-top-width: 1px; border-right-width: 1px; border-bottom-width: 1px; border-left-width: 1px; padding-top: 0px; padding-right: 0px; padding-bottom: 0px; padding-left: 0px; margin-top: 0px; margin-bottom: 0px; border-top-color: rgb(221, 221, 221); border-right-color: rgb(221, 221, 221); border-bottom-color: rgb(221, 221, 221); border-left-color: rgb(221, 221, 221); border-top-style: solid; border-right-style: solid; border-bottom-style: solid; border-left-style: solid; height: 25px; width: 132px; font-family: Arial, Helvetica, sans-serif; font-size: 8pt; color: rgb(128, 128, 128); background-color: rgb(240, 240, 240);' /></td></tr>");
            out.println("<tr><td style='width: 145px;'>&nbsp;</td><td style='width: 5px;'>&nbsp;</td><td style='width: 350px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 145px;'>&nbsp;<span id=ctl00_ContentPlaceHolder1_mobLbl>Mobile</span></td><td style='width: 5px;' </td>:<td style='width: 350px;'>&nbsp;");
            out.println("<input name=mobile type=text id=ctl00_ContentPlaceHolder1_TextBox3 style='border-top-width: 1px; border-right-width: 1px; border-bottom-width: 1px; border-left-width: 1px; padding-top: 0px; padding-right: 0px; padding-bottom: 0px; padding-left: 0px; margin-top: 0px; margin-bottom: 0px; border-top-color: rgb(221, 221, 221); border-right-color: rgb(221, 221, 221); border-bottom-color: rgb(221, 221, 221); border-left-color: rgb(221, 221, 221); border-top-style: solid; border-right-style: solid; border-bottom-style: solid; border-left-style: solid; height: 25px; width: 132px; font-family: Arial, Helvetica, sans-serif; font-size: 8pt; color: rgb(128, 128, 128); background-color: rgb(240, 240, 240);' />");
            out.println("</td></tr><tr><td style='width: 145px;'> &nbsp;</td><td style='width: 5px;'>&nbsp;</td><td style='width: 350px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 145px;'>&nbsp;<span id=ctl00_ContentPlaceHolder1_idLbl>Email-Id</span></td><td style='width: 5px;'>:</td>");
            out.println("<td style='width: 350px;'>&nbsp;<input name=email type=text id=ctl00_ContentPlaceHolder1_TextBox4 style='border-top-width: 1px; border-right-width: 1px; border-bottom-width: 1px; border-left-width: 1px; padding-top: 0px; padding-right: 0px; padding-bottom: 0px; padding-left: 0px; margin-top: 0px; margin-bottom: 0px; border-top-color: rgb(221, 221, 221); border-right-color: rgb(221, 221, 221); border-bottom-color: rgb(221, 221, 221); border-left-color: rgb(221, 221, 221); border-top-style: solid; border-right-style: solid; border-bottom-style: solid; border-left-style: solid; height: 25px; width: 132px; font-family: Arial, Helvetica, sans-serif; font-size: 8pt; color: rgb(128, 128, 128); background-color: rgb(240, 240, 240);' />");
            out.println("</td> </tr><tr><td style='width: 145px;'>&nbsp;</td><td style='width: 5px;'>&nbsp;</td><td style='width: 350px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 145px;'>&nbsp;<span id=ctl00_ContentPlaceHolder1_queryLbl>Your Query</span></td><td style='width: 5px;'>:</td><td style='width: 350px;'>&nbsp;<textarea name=query rows=2 cols=20 id=ctl00_ContentPlaceHolder1_TextBox5 style='width:250px;border-top-width: 1px; border-right-width: 1px; border-bottom-width: 1px; border-left-width: 1px; padding-top: 0px; padding-right: 0px; padding-bottom: 0px; padding-left: 0px; margin-top: 0px; margin-bottom: 0px; border-top-color: rgb(221, 221, 221); border-right-color: rgb(221, 221, 221); border-bottom-color: rgb(221, 221, 221); border-left-color: rgb(221, 221, 221); border-top-style: solid; border-right-style: solid; border-bottom-style: solid; border-left-style: solid; height: 45px; width: 250px; font-family: Arial, Helvetica, sans-serif; font-size: 8pt; color: rgb(128, 128, 128); background-color: rgb(240, 240, 240);'></textarea>");
            out.println("</td></tr><tr><td style='width: 145px;'>&nbsp;</td><td style='width: 5px;'>&nbsp;</td><td style='width: 350px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 145px;'>&nbsp;</td><td style='width: 5px;'>&nbsp;</td><td style='width: 350px;'>&nbsp; <input type=submit name=s value=SEND id=ctl00_ContentPlaceHolder1_submit style='color:White;background-color:#003366;' />&nbsp;</td></tr>");
            out.println(" <tr><td style='width: 145px;'>&nbsp;</td><td style='width: 5px;'>&nbsp;</td><td style='width: 350px;'> &nbsp;<span id=ctl00_ContentPlaceHolder1_msg style='color:Red;'></span>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 145px;'>&nbsp;</td><td style='width: 5px;'>&nbsp;</td><td style='width: 350px;'>&nbsp;</td></tr></table>");
            out.println("</td><td style='width: 25px;'>&nbsp;</td></tr> <tr><td style='width: 25px;'>&nbsp;</td><td style='width: 500px;'>&nbsp;</td><td style='width: 25px;'> &nbsp;</td></tr></table></div>");
            out.println("</td><td style='width: 5px;'>&nbsp;</td><td style='width: 345px;'><table style='width: 345px; text-align: center;'><tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'>&nbsp;</td><td style='width: 23px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'> &nbsp;</td><td style='width: 23px;'>&nbsp;</td> </tr><tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'>&nbsp;</td><td style='width: 23px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 22px;'> &nbsp;</td><td style='width: 300px;'>&nbsp;</td> <td style='width: 23px;'>&nbsp;</td></tr><tr> <td style='width: 22px;'> &nbsp;</td><td style='width: 300px;'>&nbsp;</td><td style='width: 23px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'>&nbsp;</td><td style='width: 23px;'>&nbsp;</td></tr> <tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'><font color=#003366 size=10>&nbsp;PLEASE SEND YOUR</font></td><td style='width: 23px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'><font color=black size=5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; QUERIES AND VIEW </font></td><td style='width: 23px;'>&nbsp;</td></tr><tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'>&nbsp;</td><td style='width: 23px;'>&nbsp;</td></tr>");
            out.println("<tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'>&nbsp;</td><td style='width: 23px;'>&nbsp;</td></tr><tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'>&nbsp;</td><td style='width: 23px;'> &nbsp;</td></tr>");
            out.println("<tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'>  &nbsp;</td>  <td style='width: 23px;'>&nbsp;</td></tr> <tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'>&nbsp;</td><td style='width: 23px;'> &nbsp;</td></tr>");
            out.println("<tr><td style='width: 22px;'>&nbsp;</td><td style='width: 300px;'> &nbsp;</td><td style='width: 23px;'>&nbsp;</td> </tr><tr><td style='width: 22px;'> &nbsp;</td>  <td style='width: 300px;'> &nbsp;</td><td style='width: 23px;'>&nbsp;</td></tr>");
            out.println("</table></td></tr></table></div></td></tr></table></div>");
              
              
              
             
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