package basis.list;

import basis.util.student;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author xy
 * @date 2018/03/18 22:05
 */
public class arraylist_t {
    public static void main(String[] args) {

    }

    /**
     * 无参数，没有设定大小
     */
    @Test
    public void test(){
        ArrayList<student> al = new ArrayList<student>();
        student st1 = new student("小明",18);
        student st2 = new student("二娃",20);
        al.add(st1);
        al.add(st2);
        System.out.println(al.toString());
        System.out.println("al size:" + al.size());
    }

    /**
     * 有参数，设定大小
     */
    @Test
    public void test1(){
        ArrayList<student> al = new ArrayList<student>(5);
        student st1 = new student("小明",18);
        student st2 = new student("二娃",20);
        al.add(st1);
        al.add(st2);
        System.out.println(al.toString());
        System.out.println("al size:" + al.size());
    }
}
