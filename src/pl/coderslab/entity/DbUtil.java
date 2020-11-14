package pl.coderslab.entity;

import java.sql.*;

public class DbUtil {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=true&characterEncoding=utf8";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

    }
}




//próba 2
/*     public static int insert(Connection conn, String query, String... params) {
        int id = 0;

        try ( PreparedStatement statement = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            for (int i = 0; i < params.length; i++) {
                statement.setString(i + 1, params[i]);
            }
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                id = result.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
}*/




//próba 1
/*    public static Connection getConnection() throws SQLException {

        Connection conn;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}*/

