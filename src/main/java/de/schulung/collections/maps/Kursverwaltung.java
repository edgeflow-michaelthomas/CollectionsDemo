package de.schulung.collections.maps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Kursverwaltung {
    private final Map<String, Set<Person>> kursBelegung = new HashMap<>();

    public void addPersonToClass(String className, Person person) {
        if (!kursBelegung.containsKey(className)) {
            kursBelegung.put(className, new HashSet<>());
        }
        kursBelegung.get(className).add(person);
    }

    public void printClasses() {
        for (Map.Entry<String, Set<Person>> entry : kursBelegung.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Person person : entry.getValue()) {
                System.out.println(person);
            }
            System.out.println();
        }
    }

    public void printGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        String json = gson.toJson(kursBelegung);
        System.out.println(json);
    }
}
