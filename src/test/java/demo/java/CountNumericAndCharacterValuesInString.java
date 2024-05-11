package demo.java;

public class CountNumericAndCharacterValuesInString {
	
	public static int printNumberOfCharacters(String str){
        
        char c[] = str.toCharArray();
        int numberOfCharacters=0, numberOfNumericValue=0;
        String totalCharcaters= "", totalNumericValue="";
        for(int i=0; i<c.length; i++){
            if(c[i]>= 48 && c[i]<=57){
                numberOfNumericValue = numberOfNumericValue+1;
                totalNumericValue = totalNumericValue + c[i];
            }else if(c[i]>= 97 && c[i]<=122 || c[i]>= 66 && c[i]<=90){
                numberOfCharacters = numberOfCharacters+1;
                totalCharcaters = totalCharcaters + c[i];
            }
        }
        System.out.println("numberOfNumericValue : "+numberOfNumericValue);
        System.out.println("Numeric Values are  :  "+totalNumericValue);
        
        System.out.println("numberOfCharacters : "+numberOfCharacters);
        System.out.println("Charcater Values are  :  "+totalCharcaters);
        
        return numberOfCharacters;
    }
 public static void main(String[] args) {
     System.out.println(printNumberOfCharacters("ghj76576/']gfdhgfh"));
     
 }

}
