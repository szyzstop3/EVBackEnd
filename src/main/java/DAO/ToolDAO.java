package DAO;


import vo.Charger;
import vo.Comment;

public interface ToolDAO {
    //判断二维码和充电桩信息是否有效
    public boolean validCharger(Charger charger);
    //上传用户评论信息
    public boolean addComment(Comment comment);

}
