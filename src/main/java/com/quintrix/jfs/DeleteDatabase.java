package com.quintrix.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDatabase {
  public static void main(String[] args) {
    Connection connection = null;
    Statement stmt = null;
    // connects to local database
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection =
          DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "Jeffn00n");

      stmt = connection.createStatement();
      // deletes all employees
      stmt.execute("DELETE FROM EMPLOYEE WHERE ID >= 1");
      // catch exception for delete statement
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // closes connection
      try {
        stmt.close();
        connection.close();
        // catches exception to close
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
