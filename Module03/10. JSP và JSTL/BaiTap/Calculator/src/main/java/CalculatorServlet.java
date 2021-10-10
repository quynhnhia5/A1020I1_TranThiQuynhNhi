import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet",urlPatterns = {"","/index"})
public class CalculatorServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int a= Integer.parseInt(request.getParameter("num1"));
    int b= Integer.parseInt(request.getParameter("num2"));
    String handle=request.getParameter("btnHandle");
    int result=0;
    if(handle.equalsIgnoreCase("+")){
      result=a+b;
      request.setAttribute("operation","+");
    }
    if(handle.equalsIgnoreCase("-")){
      result=a-b;
      request.setAttribute("operation","-");
    }
    if(handle.equalsIgnoreCase("*")){
      result=a*b;
      request.setAttribute("operation","*");
    }
    if(handle.equalsIgnoreCase("/")){
      result=a/b;
      request.setAttribute("operation","/");
    }
    request.setAttribute("a",a);
    request.setAttribute("b",b);
    request.setAttribute("result",result);
    request.getRequestDispatcher("result.jsp").forward(request,response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  request.getRequestDispatcher("index.jsp").forward(request,response);


  }
}
