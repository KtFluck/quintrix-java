package com.quintrix.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDatabase {

  public static void main(String[] args) {

    Connection connection = null;
    Statement selectStmt = null;
    // connects to local database
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection =
          DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "Jeffn00n");

      /*
       * insertStmt = connection.createStatement(); insertStmt.
       * execute("INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES (1,'Lokesh','Gupta',5)"
       * ); insertStmt.
       * execute("INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES (2,'howtodoinjava','com',5)"
       * );
       */

      selectStmt = connection.createStatement();
      ResultSet rs = selectStmt.executeQuery("SELECT * FROM EMPLOYEE"); // sql - data from EMPLOYEE
                                                                        // table
      // DbVisualizer user
      // file

      while (rs.next()) {
        System.out.println(rs.getString(1)); // First Column //can only as for quanity of values in
                                             // resultSet
        System.out.println(rs.getString(2)); // Second Column
        // System.out.println(rs.getString(3)); // Third Column
        // System.out.println(rs.getString(4)); // Fourth Column
      }
      // catches exception to select
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // closes connection
      try {
        selectStmt.close();
        // insertStmt.close();
        connection.close();
        // catches exception to close
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  } // ends main
} // ends SelectDataDemo
