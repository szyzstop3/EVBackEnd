import DAO.impl.Userimpl;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "guserid",value = "/guserid")
public class getUserid extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 上传
         */
        req.setCharacterEncoding("utf-8");
        User user = new User();
        user.setName((String) req.getParameter("name"));


        Userimpl ui = new Userimpl();
        String userid = ui.GetUserid(user);

        resp.getWriter().write(userid);

    }
}
