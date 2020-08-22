package net.codejava.javaee.cuestionario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.codejava.javaee.bookstore.Book;
import net.codejava.javaee.cuestionario.dao.CustionarioDAO;
import net.codejava.javaee.cuestionario.model.Tema;

/**
 * ControllerServlet.java This servlet acts as a page controller for the
 * application, handling all requests from the user.
 * 
 * @author www.codejava.net
 */
public class ControllerCuestionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustionarioDAO cuesDAO = null;

	public void init() {
		cuesDAO = new CustionarioDAO();
		System.out.println("Saida...1");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		action = "/cues/new";
		System.out.println(action);
		System.out.println("salida>>>>>");
		try {
			switch (action) {
			case "/cues/new":
				showNewForm(request, response);
				break;
			case "/cues/insert":
				insertBook(request, response);
				break;
			case "/cues/delete":
//				deleteBook(request, response);
				break;
			case "/edit":
//				showEditForm(request, response);
				break;
			case "/cues/update":
//				updateBook(request, response);
				break;
			default:
//				listBook(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

//	private void listBook(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		List<Cuestionario> listBook = cuesDAO.listAllBooks();
//		request.setAttribute("listBook", listBook);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("Cues.jsp");
//		dispatcher.forward(request, response);
//	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("<<<salida>>ee>>>1>444>");
		List<Tema> listTema= cuesDAO.listAllTema();
		request.setAttribute("listTema", listTema);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cues/CuestForm.jsp");
		dispatcher.forward(request, response);
	}

//	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		Book existingBook = cuesDAO.getBook(id);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("BookForm.jsp");
//		request.setAttribute("book", existingBook);
//		dispatcher.forward(request, response);
//
//	}

	private void insertBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		float price = Float.parseFloat(request.getParameter("price"));

		Book newBook = new Book(title, author, price);
//		cuesDAO.insertBook(newBook);
		response.sendRedirect("list");
	}

//	private void updateBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		String title = request.getParameter("title");
//		String author = request.getParameter("author");
//		float price = Float.parseFloat(request.getParameter("price"));
//
//		Book book = new Book(id, title, author, price);
//		cuesDAO.updateBook(book);
//		response.sendRedirect("list");
//	}
//
//	private void deleteBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//
//		Book book = new Book(id);
//		cuesDAO.deleteBook(book);
//		response.sendRedirect("list");
//
//	}

}
