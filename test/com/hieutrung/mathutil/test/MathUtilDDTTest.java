/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutrung.mathutil.test;

import static com.hieutrung.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author PC
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
        //test thử hàm getF() bên kia coi chạy đugns không
        // so sánh đúng sai
        //3 việc: chuẩn bị data, đưa data(Gọi hàm), kết luận
        //done bên MathUtil test rồi nhưng làm mới hơn
        //0!, 0->1  test dât
        
        //học cách viets code tách đám data ra khỏi các câu lệnh getF()
        //Không mixed
        //Tất cả các framework UnitTest của mọi NNLT.
        
        //hàm trả về mảng 2 chiều kiểu Obj
        //Vì các framework chỉ chơi vs Obj, tức là chơi vs số nguyên
        //là Wrapper Class: Interger(int), Long(long), Character(char)
    
    
        @Parameterized.Parameters // bao vs JVM day la data nguon
        public static Object[][] initData(){
            //int a[] = {2,4,6,8};
            
            return new Integer[][]{
                                        {0, 1},
                                        {1, 1},
                                        {2, 2},
                                        {3, 6},
                                        {6, 720},
                                     };
        }
        
        //trích mảng con ra từ mảng lớn để được cặp value input/expected
        @Parameterized.Parameter(value = 0)// map column 0
        public int input;
        
        @Parameterized.Parameter(value = 1)//map column 1
        public int expected;
        
        @Test
        public void testFactorialGivenValidArgumentReturnsWell01(){
           
            //long actual = getFactorial(input);
            assertEquals(expected, getFactorial(input));
        }
    
    
}
