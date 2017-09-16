/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversean.array;


public class ReverseAnArray {

    public static String reverseString(String str){
        if(str.length()<2){
            return str;
        }
        else
        return reverseString(str.substring(1))+str.charAt(0);
        
    }
    public static void main(String[] args) {
        String name= "chamini";
        System.out.println(reverseString(name));
        
    }
    
}
