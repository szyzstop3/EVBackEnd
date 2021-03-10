import DAO.impl.Userimpl;
import com.alibaba.fastjson.JSONObject;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "myservlet", value = "/myservlet")
public class myservlet extends HttpServlet {
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

        new Userimpl().InsertUser(user);

        /**
         * 回复
         */


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",user.getName());
        jsonObject.put("pwd",user.getPassword());
        jsonObject.put("ph",user.getPhone());
        jsonObject.put("sex",user.getSex());

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("回复!<br>");
        resp.getWriter().write(resp.getStatus()+"<br>");
        resp.getWriter().write(String.valueOf(jsonObject));
    }
}
