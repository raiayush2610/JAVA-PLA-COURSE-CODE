import java.util.*;
 
class Main
{

    public static void leftRotate(int arr[], int d, int n)
    {
        leftRotateRec(arr, 0, d, n);
    }
 
    public static void leftRotateRec(int arr[], int i, int d, int n)
    {

        if(d == 0 || d == n)
            return;
         
        if(n - d == d){
            swap(arr, i, n - d + i, d);
            return;
        }
        
        if(d < n - d){
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);    
        }
        else{
            swap(arr, i, d, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d);
        }
    }
 
    public static void swap(int arr[], int fi, int si, int d){
        int i, temp;
        
        for(i = 0; i < d; i++){
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }
 
    public static void main (String[] args){
        int arr[] =  {4, 6, 1, 8, 9, 2};
        leftRotate(arr, 2, 6);
    
        for( int i = 0; i < 6; i++)
            System.out.print(arr[i] + " ");
    }
}