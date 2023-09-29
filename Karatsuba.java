public class Karatsuba {
    public static long mult(long x,long y){
        if (x<10 && y<10) {
            return x*y;
            
        }
        int noOneLength = numLength(x);
        int notwoLength = numLength(y);

        int maxNumLenght=Math.max(noOneLength,notwoLength);

        Integer halfMaxNumLenght = (maxNumLenght/2)+(maxNumLenght%2);
 
        long maxNumLenghtTen = (long) Math.pow(10, halfMaxNumLenght);
        
        long a = x / maxNumLenghtTen;
        long b = x % maxNumLenghtTen;
        long c = y / maxNumLenghtTen;
        long d = y % maxNumLenghtTen;
         long z0 =mult(a, c);
         long z1 = mult(a +b, c+d);
         long z2 = mult(b,d);

         long ans =(z0 * (long)Math.pow(10, halfMaxNumLenght * 2) +((z1 -z0 -z2)* (long)Math.pow(10, halfMaxNumLenght)+ z2));
         return ans;
    }
    public static int numLength(long n){

        int noLen=0;
        while (n>0) {
            noLen++;
            n/=10;
        }
        return noLen;
    }
    public static void main(String[] args) {
        long expectedProduct =1234 *5678;
        long actualProduct =mult(1234, 5678);
        System.out.println("Expectectes: "+ expectedProduct);
        System.out.println("Actual Product: "+ actualProduct);
    }
    
}
