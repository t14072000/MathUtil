/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thinh.util;

/**
 *
 * @author Lê Nhựt Thịnh
 */
//class nay chua cac ham tien ichde ho tro cac phep tinh toan 
//ci may la tien ich ham y dung chung cho moi noi 
//do đó chung may se la static
public class MathUtil {
    //hàm giai thừa n!=1.2.3.4....n bùng nổ kết quả rất nhanh
    //nên tràn int (2tỉ1)sớm, ta trả về long 15!
    public static long computeFactorial(int n){
        //cứ viết sai đúng từ từ tính
        if(n<0 || n>15){
            throw new IllegalArgumentException("Invalid argument. n must >=0 & <=15");
        }
        if(n==0||n==1){
            return 1;
        }
        return n*computeFactorial(n-1);
        /*long result=1;
        for (int i = 1; i <= n; i++) {
            result*=i;
        }
        return result;
        */
    }
}
