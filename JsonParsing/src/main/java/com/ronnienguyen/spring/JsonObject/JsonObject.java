package com.ronnienguyen.spring.JsonObject;

import com.google.gson.Gson;
import com.sun.tools.hat.internal.model.Root;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonObject {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        //Import the location of your File Name Json here
        try (Reader reader = new FileReader("")){
            JSONObject jsonObject = new JSONObject(reader);



            System.out.println(jsonObject.getString("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
