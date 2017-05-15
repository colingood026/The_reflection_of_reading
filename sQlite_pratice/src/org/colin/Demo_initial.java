package org.colin;

import java.sql.*;
import java.text.MessageFormat;

/**
 * Created by Colin on 2017/5/15.
 */
public class Demo_initial {

    /**
     *
     * @param dbName
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getDbConnection(String dbName) throws ClassNotFoundException, SQLException {


        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:"+dbName);

        return conn;
    }


    public static void main(String[] args) {
        Connection conn = null;
        try {

            conn = getDbConnection("test6.db");
            // create table
            createUserTable(conn);
            createCarTable(conn);
            // init user data
            User colin = new User();
            colin.setId(1);
            colin.setName("Colin");
            User James = new User();
            James.setId(2);
            James.setName("James");
            insertUser(conn,colin);
            insertUser(conn,James);
            // init user_car data
            UserCar colin_car = new UserCar();
            colin_car.setId(1);
            colin_car.setCarNm("BMW");
            colin_car.setUserId(1);
            UserCar james_car = new UserCar();
            james_car.setId(2);
            james_car.setCarNm("TOYOTA");
            james_car.setUserId(2);
            insertUserCar(conn,colin_car);
            insertUserCar(conn,james_car);


        } catch (Exception e) {
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



    //create Table
    public static void createUserTable(Connection conn)throws SQLException {

        String sql = "DROP TABLE IF EXISTS USER;";
        String tp = "create table USER ({0});";
        StringBuffer sb = new StringBuffer();
        sb.append("ID INTEGER PRIMARY KEY,");
        sb.append("NAME TEXT");
        sql = sql+ MessageFormat.format(tp,sb.toString());
        System.out.println(sql);
        Statement stat = conn.createStatement();
        stat.executeUpdate(sql);
    }


    public static void createCarTable(Connection conn) throws SQLException {

        String sql = "DROP TABLE IF EXISTS USER_CAR ;";
        String tp = "create table USER_CAR ({0});";
        StringBuffer sb = new StringBuffer();
        sb.append("ID INTEGER PRIMARY KEY,");
        sb.append("CAR_NAME TEXT,");
        sb.append("USER_ID INTEGER,");
        sb.append("FOREIGN KEY(USER_ID) REFERENCES USER(ID)");
        sql = sql+ MessageFormat.format(tp,sb.toString());
        System.out.println(sql);
        Statement stat = conn.createStatement();
        stat.executeUpdate(sql);
    }


    //新增
    public static void insertUser(Connection con,User user)throws SQLException{
        String sql = "insert into USER (ID,NAME) values(?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, user.getId());
        pst.setString(2, user.getName());
        pst.executeUpdate();

    }

    public static void insertUserCar(Connection con,UserCar uc)throws SQLException{
        String sql = "insert into USER_CAR (ID, CAR_NAME, USER_ID) values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, uc.getId());
        pst.setString(2, uc.getCarNm());
        pst.setInt(3, uc.getUserId());
        pst.executeUpdate();

    }
}
