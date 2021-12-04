package com.company;

public class Main {

    public static void main(String[] args) {
        int n=0;
        String s="alone";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                n++;
            }
        }
        System.out.println(n);
    }
}
