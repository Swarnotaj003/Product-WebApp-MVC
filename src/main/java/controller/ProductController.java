package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//import misc.ConnectionProvider;
import model.bean.ProductBean;
import model.dao.ProductDao;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProductController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("pid");
		String name=request.getParameter("pname");
		String category=request.getParameter("pcategory");
		int qty=Integer.parseInt(request.getParameter("pqty"));
		double price=Double.parseDouble(request.getParameter("pprice"));
		String image=request.getParameter("pimage");
//		System.out.println(ConnectionProvider.createCon());
		
		ProductBean pb = new ProductBean();
		pb.setId(id);
		pb.setName(name);
		pb.setCategory(category);
		pb.setQty(qty);
		pb.setPrice(price);
		pb.setImage(image);
		
		ProductDao pd = new ProductDao();
		int status = pd.insert(pb);
		if (status != 0)
			request.setAttribute("productAdded", true);
		response.sendRedirect("add_product.jsp");	
	}

}
