package com.vishrutsharma.SpecialDataStructure;

public class Main {
    public static void main(String[] arg){

        String[] s = {"Syeda", "Vishrut", "Saurav", "Guru", "apple", "dosa", "Dop", "it", "I"};
        Trie t = new Trie(s);

        t.contains("Syeda");
        t.contains("app");
        t.contains("D");
        t.contains("It");
        t.contains("I");
        t.contains("i");
        t.contains("Sau");
        t.contains("Guru");
    }
}
