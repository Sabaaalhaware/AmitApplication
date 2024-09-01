package com.jbs.a;
import org.json.JSONObject;
import org.json.JSONArray;
import java.nio.file.Files;
import java.nio.file.Paths;

public class  ReadJsonFile {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("sabaa\\Desktop\\java program\\ReadFileJson.JSON")));
            JSONObject jsonObject = new JSONObject();

            // Access data
            String name = jsonObject.getName();
            int age = jsonObject.getage();
            JSONArray hobbies = jsonObject.getJSONArray();

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Hobbies: " + hobbies);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

