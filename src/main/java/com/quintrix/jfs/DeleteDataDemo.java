package com.quintrix.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDataDemo {
  public static void main(String[] args) {
    Connection connection = null;
    Statement stmt = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection =
          DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "Jeffn00n");

      stmt = connection.createStatement();
      stmt.execute("DELETE FROM EMPLOYEE WHERE ID >= 1");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        stmt.close();
        connection.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
