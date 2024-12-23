package org.example;

public class TCK15 {
    public static void main(String[] args) {
        String str = "Srinivas Reddy Komrelly";
        //print all the unique chars in this string
        for(int i = 0; i < str.length(); i++) {
            int count =0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j) && i != j ) {
                    count=1;
                    break;
                }
            }
            if(count == 0) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
