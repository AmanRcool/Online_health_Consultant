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
public class DoctorHome extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
            
            //out.println("<script>");
       // out.println("var i = 0");
        //out.println("var arr = [a.jpg,b.jpg,c.jpg,m1.png,me.jpg,med.jpg,mw.jpg]");
        //out.println("function moveSlider() {");
       
            //out.println("var imgctrl = document.getElementById(img1)");
            //out.println("imgctrl.src = image + arr[i]");
            //out.println("i++");
           //out.println(" if(i==arr.length){ i = 0}");
            
              
            
            //out.println("setTimeout(moveSlider(),2000)}");
       
    //out.println("</script>");
            
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
            out.println("<a class=link href=Home>LOG OUT</a></td>");
           
            out.println("</tr>");
            out.println("</table>");
                     out.println("</div>");
             out.println("<div class=slider><img src=image/s.jpg style='height:180;width:900px;'></div>");
             
             
              out.println("<div class=main>");
              out.println("<div style='width:250px;margin-left:2px;height:400px;float:left;background-color: #F4E7BD;'>");
	    
              out.println("<form action=logincnf method=post>");
	      out.println("<table style='width:250px;height:400px;border:1px solid #003366;;'>");
              out.println("<tr>");
			out.println("<td style='background-color:#003366;text-align:center;height:50px;color:white;'>");

        out.println("<div style=width: 200px; float: left;background-color:#F4E7BD;color:white;>");

                  String user=request.getParameter("user"); 
                out.println("<ul>");
                out.println("<br><li><a  style='color:white;text-decoration:none;' href=SetAvailable?user="+user+"><span>Set Availability</a></li><br><br>");
                
              out.println("<li><a style='color:white;text-decoration:none;' href=ModifyFees?user="+user+"><span>Modify Fee</a></li><br><br>");
            
              out.println("<li><a style='color:white;text-decoration:none;' href=DChngpass?user="+user+"><span>Change Password</a></li><br>");
               out.println("<li><a style='color:white;text-decoration:none;'href=PatientList?user="+user+"><span>Patient List</a></li><br>");
          out.println("</ul>");
         
           out.println("<img src=image/ac.jpg style='height:210px;width:250px;'><br>");
        
                     
                     out.println("</table>");
              
              
              
	    out.println("</form>");
            String str=request.getParameter("msg");
            if(str!=null)
            {
               out.println("<h3 style='color:#003366;'>"+str+"</h3>");
            }
            
            out.println("</div>");
            out.println("<div style='width:648px;height:400px;float:left;background-color:lightsteelblue'>");
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
            out.println("<td style='width: 10px'>");
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

