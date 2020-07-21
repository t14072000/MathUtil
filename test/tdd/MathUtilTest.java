/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import thinh.util.MathUtil;

/**
 *
 * @author Lê Nhựt Thịnh
 */
public class MathUtilTest {
    
    @Test
    public void testSuccessfulCases(){
        //ham nay test nhung tinh huong thanh cong tuc la dua dau vao tu te cho ham cf
        assertEquals(1,MathUtil.computeFactorial(0));
        assertEquals(1,MathUtil.computeFactorial(1));
        assertEquals(2,MathUtil.computeFactorial(2));
        assertEquals(6,MathUtil.computeFactorial(3));
        assertEquals(24,MathUtil.computeFactorial(4));
        assertEquals(120,MathUtil.computeFactorial(5));
        
    }
    
     //mỗi @Test biến hàm này thành 1 hàm main() riêng biệt và Shift+F6
    //trò này do thư viện JUnit nó bày ra, bày thêm màu sắc Xanh Đỏ nữa
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases(){
        //ham nay test nhung tinh huong cà chớn tuc la dua dau vao tu te cho ham cf
        //VD cf(-5),cf(20)
        //ngoai le la 1 thu khong the so sanh
        //Exception là 1 tình huống không dự liệu được 
        //do đó không có value do đó không thể so sánh đươc không thể sử dụng assertEqual()
        //vì vậy ta phải SD chiêu khác để chơi vs ngoại lệ
        //ta kì vọng cf(-5) thì hàm cF() sẽ ném ra cái ngoại lệ thông báo rằng hàm số cà chớn
        MathUtil.computeFactorial(-5);
        
        
    }
    // dù code bạn sai logic nhưng bạn vẫn ra được file . jar, .war khi clean and build
    //nguy hiểm
    //-> disable nút clean and build nếu code còn đang màu đỏ
    //hãy nhớ 2 con số:NB8.2:1005,NB10:2004
    //hoac search "target depends="init,compile," trong file build-impl.xml 
}
