package JavaTest;
public class EuclidAlgo  
{   
public static void main(String[] args)   
{   
int a = 33, b = 0;   
System.out.println("GCD of " + a +" and " + b + " is " + findGCD(a, b));   
}  

static int findGCD(int a, int b)   
{   
if (b == 0)   
return a;     
return findGCD(b, a % b);   
}   
}
