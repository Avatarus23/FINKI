package aud2;

//char int double float ... != == ...
//Character Integer Double ... .egueals()

public class StringPrefix {
    public static boolean isPrefix(String string1, String string2){
        if(string1.length() > string1.length()){
            return false;
        }
        for(int i=0; i<string1.length(); i++){
            if(string1.charAt(i) != string2.charAt(i) ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrefix("test", "testing"));
        System.out.println(isPrefix("tes", "testing"));
        System.out.println(isPrefix("testla", "testing"));
    }
}