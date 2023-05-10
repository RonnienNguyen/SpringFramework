package com.ronnienguyen.spring.Gson;
import com.google.gson.Gson;
import com.sun.tools.hat.internal.model.Root;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.stream.Collectors;

public class GsonParsing {

	public static void main(String[] args) throws Exception {
		Gson gson = new Gson();
		//Import the location of your File Name Json here
		try (Reader reader = new FileReader("JsonEx.json")){
			Root header = gson.fromJson(reader, Root.class);
			header.getDescription();
			//Get base on Index
			//header.getImaging().get(0).getLocation();
			//header.getImaging().get(0).getTime();
			//Loop for all index in Array in Imaging list
			//header.getImaging().stream().map(Imaging::getLocation).collect(Collectors.toSet());
			//Get all Information in list Medications
			//header.getMedications();
			System.out.println(header);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
