import DAO.impl.Toolimpl;
import vo.Comment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addcoment",value = "/addcoment")
public class AddComment extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("charset=utf-8");

        Comment comment = new Comment();
        comment.setComment(req.getParameter("comment"));
        comment.setChargerid(Integer.parseInt(req.getParameter("chargerid")));
        comment.setUserid(Integer.parseInt(req.getParameter("userid")));
        comment.setPay(Float.parseFloat(req.getParameter("pay")));
        comment.setStars(Float.parseFloat(req.getParameter("stars")));
        comment.setReduction(Float.parseFloat(req.getParameter("reduction")));
        comment.setPayoption(req.getParameter("payoption"));


        Toolimpl toolimpl = new Toolimpl();
        toolimpl.addComment(comment);
    }
}
