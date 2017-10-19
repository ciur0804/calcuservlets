package servletHTML;

/**
 *
 * @author EMMANUEL
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class ServletCalculadora extends HttpServlet {

String n1;
String n2;
float resu;
String op;
float nn1;
float nn2;
    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        n1 = peticion.getParameter("num1");
        n2 = peticion.getParameter("num2");
        op = peticion.getParameter("opcion");
        nn1 = Integer.parseInt(n1);
        nn2 = Integer.parseInt(n2);
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        switch(op){
            case "suma":
                resu= nn1 + nn2;
            break;
            case "resta":
                resu= nn1 - nn2;
            break;
            case "multiplicacion":
                resu= nn1 * nn2;
            break;
            case "division":
                resu= nn1/nn2;
            break;
        }
        out.println("<html style='font-family:sans-serif; color: lightpink; background-color: cornsilk'>");
        out.println("<br><br><br><br><br><br><br><br><br><br>");
        out.println("<head><title>Calculadora</title></head>");
        out.println("<body>");
        out.println("<p><h1><center>Resultado de su <B>" + op +"= "+ resu + "</B> </center></h1></p>");
        out.println("</body></html>");
        out.close();
    }
}
