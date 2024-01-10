package com.example.MyMavenProject;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class MyMavenProjectApplication {
	public static void namesToJsonMethod() {
		String[] fullNames = {"Alexander Johnson", "Emily Thompson", "Michael Brown", "Sophia Wilson", "David Smith",
				"Olivia Jones", "James Williams", "Isabella Taylor", "John White", "Mia Davis",
				"Robert Miller", "Amelia Harris", "William Martin", "Charlotte Rodriguez", "Joseph Anderson", "Evelyn Lewis",
				"Thomas Walker", "Abigail Lee", "Daniel Young", "Elizabeth Hernandez"};



		List<Map<String, String>> namesList = new ArrayList<>();

		for (int i = 0; i < fullNames.length; i++) {
			String[] parts = fullNames[i].split(" ");
			if (parts.length >= 2) {
				String name = parts[0];
				String lastName = parts[1];

				Map<String, String> namesMap = new LinkedHashMap<>();
				namesMap.put("name", name);
				namesMap.put("lastName", lastName);

				namesList.add(namesMap);
			}
		}

		Gson gson = new Gson();
		System.out.println(gson.toJson(namesList));
	}

	public static void main(String[] args) {
        namesToJsonMethod();
	}

}
