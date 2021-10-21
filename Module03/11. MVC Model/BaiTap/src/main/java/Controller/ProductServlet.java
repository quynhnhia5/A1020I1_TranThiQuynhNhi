package Controller;

import Service.ProductService;
import Service.ProductServiceImpl;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = {"","/product"})
public class ProductServlet extends HttpServlet {
  private ProductService productService =new ProductServiceImpl();
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if(action == null){
      action = "";
    }
    switch (action){
      case "create":
        createProduct(request, response);
        break;
      case "edit":
        updateProduct(request, response);
        break;
      case "delete":
        deleteProduct(request,response);
        break;
      default:
        break;
    }

  }

  private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
    int id = Integer.parseInt(request.getParameter("id"));
    Product product = this.productService.searchProductById(id);
    RequestDispatcher dispatcher;
      this.productService.deleteProduct(id);
      try {
        response.sendRedirect("/product");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }


  private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
    int id = Integer.parseInt(request.getParameter("id"));
    String name=request.getParameter("name");
    int price= Integer.parseInt(request.getParameter("price"));
    String description=request.getParameter("description");
    String producer=request.getParameter("producer");
    Product product=this.productService.searchProductById(id);
    RequestDispatcher dispatcher;
    if(product == null){
      dispatcher = request.getRequestDispatcher("error-404.jsp");
    } else {
      product.setName(name);
      product.setPrice(price);
      product.setDescription(description);
      product.setProducer(producer);
      this.productService.UpdateProduct(id,name,price,description,producer);
      request.setAttribute("product", product);
      request.setAttribute("message", "product information was updated");
      dispatcher = request.getRequestDispatcher("product/edit.jsp");
    }
    try {
      dispatcher.forward(request, response);
    } catch (ServletException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void createProduct(HttpServletRequest request, HttpServletResponse response) {
    String name=request.getParameter("name");
    int price= Integer.parseInt(request.getParameter("price"));
    String description=request.getParameter("description");
    String producer=request.getParameter("producer");
    int id = (int)(Math.random() * 10000);
    Product product=new Product(id,name,price,description,producer);
    this.productService.save(product);
    RequestDispatcher dispatcher =request.getRequestDispatcher("product/listProduct.jsp");

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action=request.getParameter("action");
if(action==null){
  action="";
}
switch (action){

  case "create":
    showCreateForm(request, response);
    break;
  case "edit":
    showEditForm(request,response);

    break;
  case "delete":
    showDeleteForm(request,response);
    break;
  case "search":
    searchProduct(request,response);
    break;
  default:
    listProduct(request,response);
    break;
}
  }

  private void listProduct(HttpServletRequest request, HttpServletResponse response) {
    List<Product> productList=this.productService.findAll();
    request.setAttribute("productList",productList);
    RequestDispatcher dispatcher =request.getRequestDispatcher("product/listProduct.jsp");
    try {
      dispatcher.forward(request, response);
    } catch (ServletException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void searchProduct(HttpServletRequest request, HttpServletResponse response) {
    String search=request.getParameter("search");
    List<Product> list=productService.searchProductByName(search);
    request.setAttribute("product",list);
    request.getRequestDispatcher("product/searchProduct.jsp");
  }

  private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
    int id= Integer.parseInt(request.getParameter("id"));
    Product product=this.productService.searchProductById(id);
    RequestDispatcher dispatcher;
    if(product==null){
      request.setAttribute("msg","không tìm thấy sản phẩm");
    }
    else {
      request.setAttribute("product",product);
      dispatcher=request.getRequestDispatcher("product/delete.jsp");
    }

  }

  private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
    int id= Integer.parseInt(request.getParameter("id"));
    Product product=this.productService.searchProductById(id);

    request.setAttribute("product",product);
    RequestDispatcher dispatcher=request.getRequestDispatcher("product/edit.jsp");

  }

  private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
    RequestDispatcher dispatcher=request.getRequestDispatcher("product/create.jsp");
    try {
      dispatcher.forward(request, response);
    } catch (ServletException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
