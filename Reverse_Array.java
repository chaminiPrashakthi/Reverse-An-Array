/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_array;

import sun.security.util.Length;

/**
 *
 * @author asus
 */
public class Reverse_Array {

    public static void ReverseArray(int[] arr){
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++,j--){
            int temp= arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            
//            System.out.println(arr[]);
        }
    }
    public static void main(String[] args) {
       int [] arr={1,2,3,4,5,6};
        ReverseArray(arr);
        
        for(int i:arr){
            System.out.printf(i+" ");
        }
        
    }
    
}
