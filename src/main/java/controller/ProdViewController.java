package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bean.ProductBean;
import model.dao.ProductDao;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ProdViewController
 */
@WebServlet("/ProdViewController")
public class ProdViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ProductDao pd = new ProductDao();
		List<ProductBean> datalist = pd.getAllData();
		request.setAttribute("data", datalist);
		RequestDispatcher rd = request.getRequestDispatcher("view_product.jsp");
		rd.forward(request, response);
	}

}
