/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.bachdoan.mathutil.test.core;

import com.bachdoan.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author AN515-57
 */
@RunWith(value = Parameterized.class)
//Báo với Junit và JVM rằng class này sẽ tác data ra khỏi câu lệnh assertEquals()
//Về logic, khi run class này, Junit sẽ tự sinh ra thêm code để fill data vào
//vào trong hàm assertEquals() cho mình
//Mình phải viết code theo các Junit yêu cầu thì mới sửa đc bad smell
//Dùng code theo cách thức bị ép tuân thủ 1 logic nào đó
//TA ĐANG XÀI FARMEWORK
public class MathUtilityAdvanceTest {
    //chuẩn bị data - mảng 2 chiều
    @Parameterized.Parameters
    public static Object[][] initData(){
        //Mảng 1 chiều 
        int a[] = {5, 10, 15, 20};
        //Mảng 2 chiều
        Object data[][] = {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
        return data;
    }
    //Map 1 dòng gồm 2 cột vào 2 biến n và expected
    //JUnit sẽ tự loop qua từng dòng của mảng để gán
    //data các cột vào 2 biến tương ứng!!
    @Parameterized.Parameter(value = 0)
    public int n;
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    //Test nào, 
    @Test
    public void testFactorialGivenRightArgumentRunWell(){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
