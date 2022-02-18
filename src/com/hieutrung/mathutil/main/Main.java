/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutrung.mathutil.main;

import com.hieutrung.mathutil.core.MathUtil;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        //kiêm thử bằng cách gọi hàm với data đưa vào
        //nhìn kết quả trả về(ACTUAL) so sánh với cái ta
        //hy vọng nó trả về(EXPECTED)
        //ví dụ 5! thừa expected = 120
        //chạy mới biết actual
        //so sánh expec vs actual
        //để đảm bảo hàm đúng , ta phải nghĩ ra các tình huống hàm sẽ xài
        //nghĩ ra các bộ data, đưa cho hàm, hàm chạy output, kết luận
        //1 tình huống 1 cách xài của người dùng sẽ là 1 test case
        // n = 5 là test case
        //n = -5 cũng là test case
        
        //test case 1: check getF() with valid argument
        // n = 0 => 1, actual = ?
        
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        
        //compare
        System.out.println("0! -> expected: " + expected
                                    + "; actual: " + actual);
        
        //test case 2: check getF() with valid argument
        // n = 6 => 720, actual = ?
        expected = 720;
        actual = MathUtil.getFactorial(6);
        System.out.println("6! -> expected: " + expected
                                    + "; actual: " + actual);
        
        
        //test case 2: check getF() with invalid argument
        // n = -5 => throw exception, actual = ?
        System.out.println("Check if an exception is thrown by using");
        MathUtil.getFactorial(-5);
    }
}
