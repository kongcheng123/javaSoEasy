package basis.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author xy
 * @date 2018/03/21 23:26
 */
public class array_sort {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        int[] a = {2,4,1,3,4,5};
        Arrays.sort(a);
        for (int i :a) {
            System.out.println(i);
        }
    }

    @Test
    public void test1(){
        ArrayList<String> al = new ArrayList<String>();
        al.add("1");
        al.add("5");
        al.add("3");
        Collections.sort(al);
        System.out.println(al.toString());
    }
}
