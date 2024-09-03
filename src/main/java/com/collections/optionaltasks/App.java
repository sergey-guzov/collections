package com.collections.optionaltasks;

public class App {
    public static void main(String[] args) {
        StringsFromFile stringsFromFile = new StringsFromFile();
        System.out.println(stringsFromFile.getStringsByLines());
        System.out.println(stringsFromFile.reverseStringsByLines(stringsFromFile.getStringsByLines()));
        System.out.println(stringsFromFile.sortStringsByLength(stringsFromFile.getStringsByLines()));
        System.out.println(stringsFromFile.getHashSetOfWords());
    }
}
