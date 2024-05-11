package demo.java;

public class ReverseAString {

	public static String reverseString(String str){
        String strArr[] = str.split(" ");
        String result="";
        for(String word : strArr){
            //System.out.println(word);
            for(int i=word.length()-1; i>=0; i--){
                result = result+word.charAt(i);
            }
            result = result+" ";
        }
        return result.trim();
    }
	
    public static String reverseString2(String str){
        String strArr[] = str.split(" ");
        String result="";
        for(int j=strArr.length-1; j>=0; j--){
            String word = strArr[j];
            for(int i=word.length()-1; i>=0; i--){
                result = result+word.charAt(i);
            }
            result = result+" ";
        }
        return result.trim();
    }
    
    public static void main(String[] args) {
        String str = "Hello Java Programming Language";
        System.out.println(reverseString(str));
        System.out.println(reverseString2(str));
    }
}
