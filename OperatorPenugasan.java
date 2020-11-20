
public class OperatorPenugasan {

    public static void main(String[] args) {
       String ori = "MIm";
       String reverse = "";
       for (int i = ori.length()-1;i>= 0 ; i--){
            reverse += ori.charAt(i);
            System.out.println(reverse);
       }
       
       boolean palindrome = true;
       for(int i = 0; i < ori.length(); i++){
           if(ori.charAt(i) != reverse.charAt(i)){
                palindrome = false;
           }          
       }
       if(palindrome){
        System.out.print("Palindrome");
    }else{
        System.out.print("Tidak palindrome");
    }
    MultyArray();
    }

    public static void MultyArray(){
        int[] ank= {1,2,3};
        int j = 0;
        
        while( j <= 1){
        for( int i = 0 ; i < ank.length ; i++){ 
            System.out.print(ank[i]+",");            
        }
        
        j++;
    }

    }

    public static void pengurutan(int[] arr){
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
         }  

    }



}