import java.io.InputStream;
import java.util.Scanner;

public class palidrone {
     
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int a= sc.nextInt(); 
        int binary[] = new int[40];    
        int index = 0;    
        while(a > 0){    
          binary[index++] = a%2;    
          a = a/2;    
        }    
        for(int i = index-1;i >= 0;i--){    
          System.out.print(binary[i]);    
        }  
        int start=0;
        int lenght=index-1;
        for (int i : binary) {
          System.out.println(i);

          
        }
        
    }

   
    
}
