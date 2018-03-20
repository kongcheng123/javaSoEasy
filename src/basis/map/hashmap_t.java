package basis.map;

import basis.util.student;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author xy
 * @date 2018/03/20 21:32
 */
public class hashmap_t {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        HashMap<String, student> hm = new HashMap<String, student>();

        student st = new student("张三",17);

        hm.put("a", st);
        hm.put("s", st);
        hm.put("d", st);
        hm.put("f", st);
        hm.put("g", st);
        hm.put("h", st);
        hm.put("j", st);
        hm.put("k", st);
        hm.put("l", st);
        hm.put("q", st);
        hm.put("w", st);
        hm.put("e", st);
        hm.put("y", st);


        System.out.println("size:" + hm.size());
    }
}
