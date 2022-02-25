/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutrung.mathutil.core;

/**
 *
 * @author PC
 */

//Class này cung cấp tiện ích, cung cấp 1 loạt hàm toán học
// giúp cho các class khác sử dụng,... ví dụ app Calculator
//rất nhiều hàm toán học
//cái gì mà tiện ích dùng chung => nên được design là STATIC
public class MathUtil {
    
    //Hàm tính n giai thừa n!
    //Không có giai thừa âm
    //0! = 1
    //giai thừa tăng rất nhanh
    //20! vừa đủ cho long, 18 số 0
    //21! vượt long => tràn
    //chặn n < 0, n > 21
    public static long getFactorial(int n){
        
        if(n < 0 || n > 21)
            throw new IllegalArgumentException("Invalid argument," 
                    + " n must between 0 to 20");
        
        if(n == 0 || n == 1)
            return 1;
        
        long product = 10;
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
    
}
