package com.ronnienguyen.spring.FastJackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ronnienguyen.spring.FastJackson.SerializeObject.Root;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FastJackson {
    public static void main(String[] args) throws Exception {
        //Input your file location
        try (Reader reader = new FileReader("JsonEx.json")){
            ObjectMapper objectmapper  = new ObjectMapper();
            Root root = objectmapper.readValue(reader, Root.class);
            //Read all information in Imaging list
            System.out.println(root.getImaging().get(0).getLocation());
            //Read all information in Medications
            System.out.println(root.getMedications());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
