import DAO.impl.Userimpl;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "usercf",value = "/usercf")
public class UserCfServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 上传
         */
        req.setCharacterEncoding("utf-8");
        User user = new User();
        user.setName((String) req.getParameter("name"));
        user.setPassword((String) req.getParameter("pwd"));
        user.setPhone((String) req.getParameter("ph"));
        user.setSex(Integer.parseInt((String) req.getParameter("sex")));

        Userimpl ui = new Userimpl();
        boolean ref = ui.UserLogin(user);

        resp.getWriter().write(String.valueOf(ref));
    }
}
