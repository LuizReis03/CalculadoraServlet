package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CalculaTabuada;

@WebServlet(
	    name = "TabuadaServlet",
	    urlPatterns = {"/tabuada"}
	)

public class TabuadaServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		CalculaTabuada mult = new CalculaTabuada();
        
		if (req.getParameter("Numero") == null) {
        	for (int i = 1; i <= 10; i++) {
    			out.println(mult.calcula(i));
    		}
		}
		else {
			String numero[] = req.getParameter("Numero").split(":");
			for (String num : numero) {
				out.println(mult.calcula(Integer.parseInt(num)));
			}
			
		}
        
    }
}
