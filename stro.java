
import java.util.Scanner;

public class stro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int t= n;
        int d,r=0;
        while (t>0) {
            d=t%10;
            if (d==1|| d==0 || d==8 || d==6) {
                if (d==6){
                    d=9;
                }
               
                else if(d==9){
                    d=6;
                }else  {
                    break;
                } 
            }r=r+d;
            t=t/10;       
                
            }
            if (r==n) {
                System.out.println(n+" is a strobogramitic number ");
            }else{
                System.out.println(n+ " is not a strobogrammaitic nuber ");
            }
        }
    }

