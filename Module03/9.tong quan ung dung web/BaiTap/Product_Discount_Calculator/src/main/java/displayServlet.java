import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "displayServlet", urlPatterns = "/Display")
public class displayServlet extends javax.servlet.http.HttpServlet {
  protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws
          javax.servlet.ServletException, IOException {
    String Product_Description = request.getParameter("Product_Description");
    float List_Price = Float.parseFloat(request.getParameter("List_Price"));
    float Discount_Percent = Float.parseFloat(request.getParameter("Discount_Percent"));
    float Discount_Amount = (float) (List_Price * Discount_Percent * 0.01);
    float Discount_Price = List_Price - Discount_Amount;

    PrintWriter out=response.getWriter();
    out.println("<html>");
    out.println("<h4> Discount Amount:"+Discount_Amount+"</h4>");
    out.println("<h4> Discount Price:"+Discount_Price+"</h4>");
    out.println("</html>");



  }

  protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

  }
}
