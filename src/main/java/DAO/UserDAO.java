package DAO;


import vo.User;

public interface UserDAO {
    public boolean InsertUser(User user);
    public boolean UserLogin(User user);
}
