package test;

import basis.util.student;
import org.junit.Test;

/**
 * @author xy
 * @date 2018/04/04 11:18
 */
public class test_fuizhi {
    public static void main(String[] args) {
        int a = 1;
        int b = a;
        a = 2;
        System.out.println(b);
    }

    @Test
    public void test(){
        student st1 = new student("张三",13);
        student st2 = st1;
        st1.setAge(80);
        System.out.println(st2.toString());
    }
}
