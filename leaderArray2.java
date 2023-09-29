public class leaderArray2 {
    public static void main(String[] args) {
        int [] arr ={16,18,5,4,6,2};
        
        int len = arr.length;
        for (int i=0; i<=len+1; i++){
            for (int j = i+1; j < len; j++) {
                if (arr[i]>arr[j]) {
                    System.out.println(arr[i]);                  
                } else {
                                       
                }
              
                
            } 
        }
       
    }
}
