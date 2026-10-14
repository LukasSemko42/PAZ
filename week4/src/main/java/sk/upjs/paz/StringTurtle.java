package sk.upjs.paz;

import sk.upjs.jpaz2.*;

public class StringTurtle extends Turtle {

    public int countChar(String s, char c){
        int pocet = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==c){
                pocet++;
            }
        }
        return pocet;
    }

    public boolean isPalindrome(String s){
        StringBuilder opak = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            opak.append(s.charAt(i));
        }

        if (s.equals(opak.toString())){
            return true;
        } else return  false;
    }

    public boolean containsDoubleSpace(String s){
        if (s.contains("  ")){
            return true;
        }
        return false;
    }

    public String unicharString(char c, int n){
        String text = "";
        for (int i = 0; i < n; i++) {
            text+=c;
        }
        return text;
    }

    public boolean isUnicharString(String s){
        if (s==null || s.isEmpty()){
            return false;
        }
        char znak=s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)!=znak){
                return false;
            }
        }
        return true;
    }

}
