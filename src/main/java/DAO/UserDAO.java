package DAO;


import vo.User;

public interface UserDAO {
    public boolean InsertUser(User user);
    public boolean UserLogin(User user);
    public boolean ExistUser(User user);
    public String GetUserid(User user);
}
