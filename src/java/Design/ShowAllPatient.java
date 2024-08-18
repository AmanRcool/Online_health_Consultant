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
public class ShowAllPatient extends HttpServlet {

   
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
            out.println("<style type='text/css'>.box{height:1340px;width:900px;}") ;
            out.println("</style>");
            out.println("<style type='text/css'>.header{height:140px;width:900px;}");  
            
            out.println("</style>");
            out.println("<style type='text/css'>.menu{color:White;text-align:center;height:20px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.slider{color:White;text-align:center;height:180px;width:900px;}");    
            out.println("</style>");
            out.println("<style type='text/css'>.main{background-color:lightsteelblue;width:900px;}");    
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
            out.println("<a class=link href=AdminHome>ADMIN HOME</a></td>");
            out.println("<td style='width:190px;background-color:Black;'>");
            out.println("<a class=link href=Home>LOG OUT</a></td>");
          
            out.println("</tr>");
            out.println("</table>");
                     out.println("</div>");
             out.println("<div class=slider><img src=image/internet.jpg style='height:180;width:900px;'></div>");
             
             
              out.println("<div class=main>");
              out.println("<center><br><b style='color:#003366;font-size:18px;'>ALL PATIENT'S AVAILABLE  HERE...</b><hr/></center>");
              
              String user=request.getParameter("user");
DBConnection db=new DBConnection();
db.stmt=db.con.createStatement();
db.rst=db.stmt.executeQuery("select pname,pfname,pemail,ppass,pmobile,padd,pcity,ppin,pstate from pregis");
out.println("<br><table border=1 cellspacing=0><tr><th style='color:#003366;'>Patient name</th><th style='color:#003366;'>Patient' Father/Husband Name</th><th style='color:#003366;'>Patient Email_Id</th><th style='color:#003366;'>Patient Password</th><th style='color:#003366;'>Mobile</th><th style='color:#003366;'>Address</th><th style='color:#003366;'>City</th><th style='color:#003366;'>Pin</th><th style='color:#003366;'>State</th></tr>");
while(db.rst.next())
{
out.println("<tr><td>"+db.rst.getString(1)+"</td>");
out.println("<td>"+db.rst.getString(2)+"</td>");
out.println("<td>"+db.rst.getString(3)+"</td>");
out.println("<td>"+db.rst.getString(4)+"</td>");
out.println("<td>"+db.rst.getString(5)+"</td>");
out.println("<td>"+db.rst.getString(6)+"</td>");
out.println("<td>"+db.rst.getString(7)+"</td>");
out.println("<td>"+db.rst.getString(8)+"</td>");
out.println("<td>"+db.rst.getString(9)+"</td></tr>");

}
//out.println("<td><a href=delques?d="+db.rst.getString(1)+"><input type=button value=Delete style='color:blue;'></td></tr>");

String str=request.getParameter("msg");
    if(str!=null)
       {
          out.println("<h3 style='color:red;'>"+str+"</h3>");
       }
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
        } 
       catch(Exception e)
       {
           e.printStackTrace();
           out.println(e);
       }
    }
}