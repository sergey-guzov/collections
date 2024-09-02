package com.collections.optionaltasks;
import java.io.File;
import java.io.IOException;


import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class StringsFromFile {
    public ArrayDeque <String> getStringArrayList (){
        ArrayDeque <String> strings = new ArrayDeque<>();
        try {
            Scanner scanner = new Scanner (new File("src/main/resources/file.txt"));
            while (scanner.hasNextLine()) {
                strings.add(scanner.nextLine());
            }
            return strings;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public  List<String>  reverseStringArrayList ( ArrayDeque<String> strings) {
        List<String> reversedList = new ArrayList<>();
        while (strings.peekLast() != null) {
            reversedList.add(strings.pollLast());
        }
        return reversedList;
    }
    public  List<String>  sortByLength ( ArrayDeque<String> strings) {
        return strings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
    }

    public HashSet <String> getHashSetOfWords (){
        HashSet <String> strings = new HashSet<>();
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/main/resources/file.txt")));
            content = content.replaceAll("[\"',]", "");
            content = content.toLowerCase();
            String [] words = content.split("\\s+");
            Collections.addAll(strings,words);
            return strings;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
