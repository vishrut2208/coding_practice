package com.vishrutsharma.leetcode.easy;

import java.util.HashMap;

public class Trie {

    private TrieNode root;

    public Trie(String[] list){
        root = new TrieNode();
        for(String w: list){
            root.addWord(w);
        }
    }

    public class TrieNode{
        HashMap<Character, TrieNode> children;
        Boolean termination = false;
        char character;

        public TrieNode(){
            children = new HashMap<>();
        }

        public TrieNode(char character){
            this();
            this.character = character;
        }


        public TrieNode getChild(char c){
            return children.get(c);
        }

        public Boolean getTermination() {
            return termination;
        }

        public void setTermination(Boolean termination) {
            this.termination = termination;
        }

        public char getCharacter() {
            return character;
        }

        public void setCharacter(char character) {
            this.character = character;
        }


        public void addWord(String s){

            if(s == null || s.length()<1){
                return;
            }

            char firstChar = s.charAt(0);

            TrieNode child = getChild(firstChar);

            if(child == null){
                child = new TrieNode(firstChar);
                children.put(firstChar, child);
            }

            if(s.length() >1){
                child.addWord(s.substring(1));
            }else{
                child.setTermination(true);
            }
        }
    }

    public boolean contains(String prefix, boolean exact){

        TrieNode lastNode = root;

        int i =0;

        for(i=0; i<prefix.length(); i++){
            lastNode = lastNode.getChild(prefix.charAt(i));
            if(lastNode == null){
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return !exact || lastNode.getTermination();
    }

    public boolean contains(String prefix){
        return contains(prefix, false);
    }

    public TrieNode getRoot(){
        return root;
    }
}
