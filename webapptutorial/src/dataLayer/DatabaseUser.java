package dataLayer;

import java.sql.*;

public class DatabaseUser {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/webapptutorial";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public boolean isValidUserLogin(String userName, String password){
        boolean isValidUser = false;

        Connection conn = null;
        Statement stmt = null;
        String sql = "";

        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            stmt = conn.createStatement();
            sql = "SELECT * FROM users WHERE user_name = \""+userName+"\"AND user_password = \"" + password+"\"";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()){
                isValidUser = true;
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt!= null){
                    stmt.close();
                }
                if (conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isValidUser;
    }
}
