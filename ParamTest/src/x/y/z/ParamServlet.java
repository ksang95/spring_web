package x.y.z;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
//@WebServlet("/paramServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println(getServletConfig().getInitParameter("color"));
    }

//    public void init(ServletConfig config) throws ServletException {
////    	System.out.println(getInitParameter("color"));
////    	System.out.println(getInitParameter("benq"));
//    }
//    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(getInitParameter("color"));
    	System.out.println(getServletContext().getInitParameter("benq"));
	}

	

}
