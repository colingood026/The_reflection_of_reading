package org.colin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Colin on 2017/5/15.
 */
public class Demo_select {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = Demo_initial.getDbConnection("test6.db");

            selectCarByUserName(conn,"Colin");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void selectCarByUserName(Connection conn,String userNm) throws SQLException {
        StringBuffer sb = new StringBuffer();
        sb.append("select * from USER_CAR uc").append("\n");
        sb.append("join USER u on uc.USER_ID = u.ID").append("\n");
        sb.append("where u.NAME = ?");
        PreparedStatement pst = conn.prepareStatement(sb.toString());
        pst.setString(1,userNm);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            int id = rs.getInt("ID");
            String carName = rs.getString("CAR_NAME");
            int userId = rs.getInt("USER_ID");
            System.out.println(id + " , " + carName + "," + userId);
        }

    }


}
