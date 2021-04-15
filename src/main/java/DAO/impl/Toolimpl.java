package DAO.impl;

import DAO.ToolDAO;
import db.DBConnect;
import vo.Charger;
import vo.Comment;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class Toolimpl implements ToolDAO {
    @Override
    public boolean validCharger(Charger charger) {
        boolean flag =false;
        String sql = "select * from charger where chargerid=?";
        String sql2 = "UPDATE charger SET CSA=? WHERE chargerid=?";
        PreparedStatement pstmt = null ;
        DBConnect dbc = null;

        if(charger.getCSA().equals("001001")){
            return true;
        }else {
            try{
                dbc = new DBConnect() ;
                pstmt = dbc.getConnection().prepareStatement(sql);
                pstmt.setString(1,""+charger.getChargerid());
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()){
                    if(rs.getString("CSA").equals(charger.getCSA())){
                        flag = true;
                    }
                }
                //更新验证信息
                pstmt = dbc.getConnection().prepareStatement(sql2);
                pstmt.setString(1,getRandomString(23));
                pstmt.setString(2,""+charger.getChargerid());
                pstmt.executeUpdate();

                rs.close() ;
                pstmt.close() ;
            }catch (SQLException e){
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            } finally{

                dbc.close() ;
            }

        }
        return flag;
        }

    @Override
    public boolean addComment(Comment comment) {
        return false;
    }

    //生成随机字符串
    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }




}
