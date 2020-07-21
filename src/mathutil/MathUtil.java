/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;
import static thinh.util.MathUtil.computeFactorial;
/**
 *
 * @author Lê Nhựt Thịnh
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //expected:120
        System.out.println("5! = "+computeFactorial(5));
        //expected:720
        System.out.println("6! = "+computeFactorial(6));
        //expected:1
        System.out.println("0! = "+computeFactorial(0));
        //expected:error
        System.out.println("-5! = "+computeFactorial(-5));
        //test code
        //1.chuan bi data
        //2.tinh toan truoc bang tay
        //3.goi lenh goi app goi chay ham thu voi data da chuan bi
        //khi hcay ham goi la ATUAL VALUE
        //4.so sanh actual va expected
        //trùng->chay dung
        //khong trung->chay sai
    }
    
}
