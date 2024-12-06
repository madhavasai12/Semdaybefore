package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ContractEmployee;
import model.EmployeeManager;

/**
 * Servlet implementation class AddContractEmployee
 */
@WebServlet("/AddContractEmployee")
public class AddContractEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContractEmployee() {
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
		double payperhour=Double.parseDouble(request.getParameter("payperhour"));
		String duration=request.getParameter("duration");
		 
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		try
		{
			ContractEmployee C=new ContractEmployee();
			C.setEid(eid);;
			C.setEname(ename);;
			C.setPayperhour(payperhour);
			C.setDuration(duration);;
			EmployeeManager em =new EmployeeManager();
			String ack=em.addContractEmployee(C);
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
