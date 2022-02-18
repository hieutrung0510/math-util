/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutrung.mathutil.test;

import static com.hieutrung.mathutil.core.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;
import com.hieutrung.mathutil.core.MathUtil;
//neu muon xai cac ham static
//cách 1 gọi tên class . tên hàm static()
//      nhớ import package... tên class chứa hàm static


//cách 2 không thèm gọi tên class chấm, gọi tên 1 mình hàm
//      nhớ import static package... tên class.tên hàm không ngoặc
//      Gọi hàm chấm * là được
/**
 *
 * @author PC
 */
public class MathUtilTest {
    
    //test case 1 : get factorial
    @Test
    public void testFactorialGivenValidArgumentReturnsWell(){
       long expected = 1;
       long actual = getFactorial(0);
       
       //JUnit la bo thu vien do nguoi khac viet
       assertEquals(expected, actual);
    }
    
    @Test
    public void testFactorialGivenValidArgumentReturnsWell01(){
       long expected = 720;
       long actual = getFactorial(6);
       
       //JUnit la bo thu vien do nguoi khac viet
       assertEquals(expected, actual);
    }
    
    
    //test ngoại lệ
    //ngoại lệ không phải là 1 value
    //ko thể sử dụng assertequals()
    //chỉ đo lường bằng cách coi m có xuất hiện không
    
    //test case 3: invalid value 
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenInvalidArgumentThrowsException() {
       getFactorial(-5);
    }
    
}
