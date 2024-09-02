package com.collections.optionaltasks;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        StringsFromFile stringsFromFile = new StringsFromFile();
        System.out.println(stringsFromFile.getStringArrayList());
        System.out.println(stringsFromFile.reverseStringArrayList(stringsFromFile.getStringArrayList()));
        System.out.println(stringsFromFile.sortByLength(stringsFromFile.getStringArrayList()));
        System.out.println(stringsFromFile.getHashSetOfWords());
    }
}
