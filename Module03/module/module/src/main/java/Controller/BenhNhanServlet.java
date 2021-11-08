package Controller;

import Model.BEAN.BenhNhan.BenhNhan;
import Model.service.BenhAnService;
import Model.service.BenhNhanService;
import Model.service.Impl.BenhAnServiceImpl;
import Model.service.Impl.BenhNhanServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "BenhNhanServlet",urlPatterns = {"","/benhnhan","/"})
public class BenhNhanServlet extends HttpServlet {
    BenhNhanService benhNhanService=new BenhNhanServiceImpl();
    BenhAnService benhAnService=new BenhAnServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "edit":
                try {
                    updateBenhNhan(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                try {
                    deleteBenhNhan(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    showListBenhNhan(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

        }
    }

    private void deleteBenhNhan(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String MaBenhNhan = request.getParameter("MaBenhNhan");
        benhNhanService.deleteBenhNhan(MaBenhNhan);
        try {
            response.sendRedirect("/benhnhan");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                try {
                    showFormEdit(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    showListBenhNhan(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
}
    private void updateBenhNhan(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {

        String MaBenhNhan = request.getParameter("MaBenhNhan");
        String TenBenhNhan = request.getParameter("TenBenhNhan");
        String NgayNhapVien = request.getParameter("NgayNhapVien");
        String NgayRaVien = request.getParameter("NgayRaVien");
        String LyDoNhapVien = request.getParameter("LyDoNhapVien");
        String MaBenhAn = request.getParameter("MaBenhAn");

        benhNhanService.updateBenhNhan(MaBenhNhan,TenBenhNhan,NgayNhapVien,NgayRaVien,LyDoNhapVien,MaBenhAn);
        showListBenhNhan(request, response);

    }


    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String MaBenhNhan=request.getParameter("MaBenhNhan");
        BenhNhan benhnhan=benhNhanService.selectBenhNhanById(MaBenhNhan);
        request.setAttribute("benhnhan",benhnhan);
        request.getRequestDispatcher("benhnhan/edit.jsp").forward(request,response);
    }


    private void showListBenhNhan(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<BenhNhan> benhNhanList = benhNhanService.selectAllBenhNhan();
        request.setAttribute("benhnhanList", benhNhanList);
        request.getRequestDispatcher("benhnhan/list.jsp").forward(request, response);

    }
    }
