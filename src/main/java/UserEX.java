import DAO.impl.Userimpl;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userex",value = "/userex")
public class UserEX extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        User user = new User();
        user.setName((String) req.getParameter("name"));


        Userimpl ui = new Userimpl();
        boolean ref = ui.ExistUser(user);

        resp.getWriter().write(String.valueOf(ref));
    }
}
