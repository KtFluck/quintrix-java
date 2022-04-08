package com.quintrix.jfs;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.quintrix.jfs.model.MessageRole;

public class JSONParser {

  public static void main(String[] args) throws IOException {


    String jsonStr = "{ \"message\" : \"Hello\", \"role\" : \"admin\" }";

    try {
      MessageRole messageRole = new ObjectMapper().readValue(jsonStr, MessageRole.class);

      System.out.println("Java Map: " + messageRole);
      System.out.println(messageRole.getMessage());

      if (messageRole.getMessage().equals("Hello")) {
        System.out.println("You're the admin");
      } else {
        System.out.println("You're not the admin");
      }

    } catch (JsonProcessingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }



  } // ends main

}// ends JSONParser
