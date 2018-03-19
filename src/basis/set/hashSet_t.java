package basis.set;

import basis.util.student;
import org.junit.Test;

import java.util.HashSet;

/**
 * @author xy
 * @date 2018/03/19 22:20
 */
public class hashSet_t {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        HashSet<student> hs = new HashSet<student>();
        student st1 = new student("hehe",12);
        student st2 = new student("hehe",12);

        hs.add(st1);
        System.out.println("size:" + hs.size());
    }
}
