package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeeManager;
import model.RegularEmployee;

/**
 * Servlet implementation class AddRegularEmployee
 */
@WebServlet("/AddRegularEmployee")
public class AddRegularEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRegularEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int eid=Integer.parseInt(request.getParameter("id"));
		String ename=request.getParameter("name");
		double salary=Double.parseDouble(request.getParameter("salary"));
		int bonus=Integer.parseInt(request.getParameter("bonus"));
		 
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		try
		{
			RegularEmployee R=new RegularEmployee();
			R.setEid(eid);
			R.setEname(ename);
			R.setSalary(salary);
			R.setBonus(bonus);
			EmployeeManager em =new EmployeeManager();
			String ack=em.addRegularEmployee(R);
			pw.print(ack);
			
		}
		catch(Exception e)
		{
			pw.print(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
