package com.vishrutsharma.SpecialDataStructure;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;

public class Trie {
    private TrieNode root;


    public Trie(String[] s){
        root = new TrieNode();
        for(String w: s){
            root.addWord(w);
        }
    }


    public TrieNode getRoot() {
        return root;
    }

    private class TrieNode{
        HashMap<Character, TrieNode> children;
        boolean terminates;
        char character;

        public TrieNode(){
            children = new HashMap<>();
        }

        public TrieNode(char c){
            this();
            this.character = c;
        }


        public void setTerminates(boolean n){
            this.terminates = n;
        }

        public boolean getTerminates(){
            return this.terminates;
        }

        public char getCharacter(){
            return this.character;
        }

        public void setCharacter(char c){
            this.character = c;
        }

        public TrieNode getChild(char c){
            return children.get(c);
        }


        public void addWord(String word){
            if(word == null || word.length() <1){
                return;
            }

            char firstChar = word.charAt(0);
            TrieNode child = getChild(firstChar);

            if(child == null){
                child = new TrieNode(firstChar);
                children.put(firstChar, child);
            }

            if(word.length() >1){
                child.addWord(word.substring(1));
            }else{
                child.setTerminates(true);
            }
        }
    }

    public boolean contains(String prefix, boolean exact){
            TrieNode pointer = getRoot();

            for(int i=0; i< prefix.length(); i++){
                pointer = pointer.getChild(prefix.charAt(i));
                if(pointer == null){
                    System.out.println("false");
                    return false;
                }
            }
        System.out.println("true");
         return !exact || pointer.getTerminates();
    }

    public boolean contains(String prefix){
        return contains(prefix, false);
    }
}
