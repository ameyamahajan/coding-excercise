/*
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
*/ 


import java.lang.Math; 
public class Solution {
    public int getSum(int a, int b) {
    int result = 0;
    int iterate = 0;
    boolean sign = (a<0 && b<0 )?true:false ; 
    //Assuming both are +ve or -ve intergers
    if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
        result = Math.abs(a);
        iterate = Math.abs(b); 
    }
    //Assuming either is +ve or -ve intergers
    else if (a > b) 
    {
        result = b;
        iterate = a;
    }
    else {       
        result = a;
        iterate = b;
    }
    // Calculator 
    while(iterate > 0 ){
        result ++; 
        iterate --; 
    }
    if(sign) {
        result=result * -1 ; 
    }
    return result;    
    }
}
