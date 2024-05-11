package demo.java;

public class FabonanciesSeries {
	public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 
        int firstDigit = 0;
        int secondPlaceDigit = 1;
        int length = 15;
        
        System.out.print(firstDigit +" "+secondPlaceDigit+" ");
        
        for(int i=0; i<length; i++){
            int nextDigit = firstDigit + secondPlaceDigit;
            System.out.print(nextDigit +" ");
            
            firstDigit = secondPlaceDigit;
            secondPlaceDigit= nextDigit;
            
        }
        
        
    }

}
