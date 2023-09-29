class prime {
    public static int primeno(int n){
        int i;
        int ctr = 0;
        if (n==0 || n==1) {
            return 0;          
        }  else  {
            
            
            for (  i= 2;i < n+1; i++) {
                if (n%i ==0) {
                    ctr=ctr+1;
                    if (ctr==2) {
                                        // // // // System.out.println(ctr);
                        System.out.println(i);
                    }
                      
                }
            }
           
            return ctr; 
        }
       
       
    
        
        
    }public static void main(String[] args) {
     int n =10;
     
     
    System.out.println("The prime no is:-"+ primeno(n));
     

    }
}
