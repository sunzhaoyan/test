package com.szy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/portal";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            if (conn == null && conn.isClosed()) {
                Class.forName(DRIVER);
            }
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    private static void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();
        System.out.println(conn);
        DBUtil.close();
    }

}
