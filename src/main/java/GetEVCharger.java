import DAO.impl.Toolimpl;
import vo.Charger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "getcharger",value = "/getcharger")
public class GetEVCharger extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Charger charger = new Charger();
        charger.setChargerid(Integer.parseInt(req.getParameter("chargerid")));

        Toolimpl toolimpl = new Toolimpl();
        resp.getWriter().write(toolimpl.getCharger(charger));


    }
}
