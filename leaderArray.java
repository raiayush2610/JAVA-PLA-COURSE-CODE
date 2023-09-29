/**
 * leaderArray
 */
public class leaderArray {

    public static void main(String[] args) {
        int array[] ={16,18,5,4,6,2};
        int len=array.length;
        
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if(array[i]<array[j]){
                  break;
                } 
                if ( j == len) // the loop didn't break
                    System.out.print(array[i] + " ");  

            }
    
            
        }
        

    }
}