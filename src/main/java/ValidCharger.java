import DAO.impl.Toolimpl;
import DAO.impl.Userimpl;
import vo.Charger;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "validcharger",value = "/validcharger")
public class ValidCharger extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Charger charger = new Charger();
        charger.setChargerid(Integer.parseInt(req.getParameter("chargerid")));
        charger.setCSA(req.getParameter("csa"));

        Toolimpl toolimpl = new Toolimpl();
        resp.getWriter().write(""+toolimpl.validCharger(charger));
    }
}
