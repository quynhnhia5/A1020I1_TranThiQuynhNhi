package Model.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

  public static Connection CreateConnection() {
    Connection conn= null;
    String url="jdbc:mysql://localhost:3306/demo";
    String username="root";
    String password="nhinhi171";

    try
    {
      //load drive
      Class.forName("com.mysql.jdbc.Driver");
      //create Connection
      conn= DriverManager.getConnection(url, username, password);
    }
    catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }


    return conn;

  }

}
