package DAO.impl;


import DAO.UserDAO;
import db.DBConnect;
import vo.User;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Userimpl implements UserDAO {
    @Override
    public boolean InsertUser(User user) {
                String sql = "INSERT INTO `evcharger`.`user` (`Name`, `Phone`, `Password`,`Sex`) " +
                        "VALUES (?, ?, ?, ?);";
                PreparedStatement PS;
                DBConnect DBC = null;
                try {
                    DBC = new DBConnect();
                    PS = DBC.getConnection().prepareStatement(sql);
                    PS.setString(1, user.getName());
                    PS.setString(2, user.getPhone());
                    PS.setString(3, user.getPassword());
                    PS.setString(4, "" + user.getSex());
                    PS.executeUpdate();
                    PS.close();
                } catch (IOException | SQLException throwables) {

                    throwables.printStackTrace();
                }
                DBC.close();
        return true;
    }

}
