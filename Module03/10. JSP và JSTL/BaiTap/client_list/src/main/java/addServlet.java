import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "addServlet",urlPatterns = {"","/index","/customer"})
public class addServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   List<customer> list=new ArrayList<>();
   list.add(new customer("meo","17/01/2021","Gia lai","img/1.jpg"));
    list.add(new customer("meo","17/01/2021","Gia lai","img/1.jpg"));
    list.add(new customer("meo","17/01/2021","Gia lai","img/1.jpg"));
    request.setAttribute("list",list);
    request.getRequestDispatcher("index.jsp").forward(request,response);
  }
}
