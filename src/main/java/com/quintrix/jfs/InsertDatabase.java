package com.quintrix.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDatabase {
  public static void main(String[] args) {
    Connection connection = null;
    Statement stmt = null;
    // connects to local database
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection =
          DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "Jeffn00n");

      stmt = connection.createStatement();
      // inserts two employee into database
      stmt.execute("INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) "
          + "VALUES (1,'Lokesh','Gupta',5)");

      stmt.execute(
          "INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) " + "VALUES (2,'Bob','Smith',8)");

      // catches exception to insert
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
