import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Table")
public class Table extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int n=Integer.parseInt(request.getParameter("t1"));
		PrintWriter out=response.getWriter();
		
		out.write("<html>");
		out.write("<head>");
		out.write("<title> Home Page </title> ");
		out.write("</head>");
		
		out.write("<body>");
		out.write("<table style='border:solid;' cellspacing=5 cellpadding=5>");
		
		for(int i=1;i<=10;i++)
		{
			out.write("<tr>");
			out.write("<td>"+n+" * "+i+" = "+(n*i)+"</td>");
			out.write("</tr>");
		}
		out.write("</table>");
		out.write("</body>");
		out.write("</html>");
	}
}