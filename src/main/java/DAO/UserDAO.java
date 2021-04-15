package DAO;


import vo.User;

public interface UserDAO {
//    用户注册
    public boolean InsertUser(User user);
//    用户登录
    public boolean UserLogin(User user);
//    用户重名检测
    public boolean ExistUser(User user);
//    获取用户id
    public String GetUserid(User user);
}
