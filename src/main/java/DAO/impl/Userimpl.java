package DAO.impl;


import DAO.UserDAO;
import db.DBConnect;
import vo.User;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    @Override
    public boolean UserLogin(User user) {
        boolean flag =false;
        String sql = "select * from user where name=?";
        PreparedStatement pstmt = null ;
        DBConnect dbc = null;
        try{

            dbc = new DBConnect() ;
            pstmt = dbc.getConnection().prepareStatement(sql) ;
            pstmt.setString(1,user.getName()) ;
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                if(rs.getString("password").equals(user.getPassword())){
                    flag = true;
                }
            }
            rs.close() ;
            pstmt.close() ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally{

            dbc.close() ;
        }
        return flag;
    }

}
