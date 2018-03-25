package basis.map;

import org.junit.Test;

import java.util.LinkedHashMap;

/**
 * @author xy
 * @date 2018/03/25 10:17
 */
public class linkhashmap_t {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        LinkedHashMap<String, String> lh = new LinkedHashMap<String, String>();
        lh.put("q","w");
        lh.get("q");
    }
}
