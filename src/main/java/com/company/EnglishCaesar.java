package com.company;

public class EnglishCaesar {

    char[] letter = new char[]{
            'a','b','c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };


    public boolean isLowerCase(String check){
        return (check.compareTo(check.toLowerCase()) == 0)? true: false;
    }

    public String caesarCipher(String originalText, int stepOfChange) {
        String temp = originalText;
        if(isLowerCase(originalText)){
            return "Yess, someone made it";
        }else{
            temp = originalText.toLowerCase();
        }
        for(int i = 0; i < temp.length(); i++){

        }
        return "No-no-no";

    }

    public char replaceChar(char switchedChar, int power) {
        int temp;
        for(int i = 0; i < letter.length; i++){
            if (letter[i] == switchedChar){

                if((i+power-1) > 26){
                    temp = i+power-27;
                }
                else {
                    temp = i+power-1;
                }
                return letter[temp];
            }
        }
        return '0';
    }


    public int power(int power) {
        return 15;
    }
}
