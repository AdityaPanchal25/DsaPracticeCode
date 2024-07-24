package com.LeanearSerchAlgorithmLec13;

public class SearchCharString {
    public static void main(String args[]){
        String str="Aditya";
        char target='d';
        System.out.println(search(str,target));
    }
    static  boolean search(String name,char charch){
        if(name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==charch){
                return true;
            }
        }
        return false;
    }
}
