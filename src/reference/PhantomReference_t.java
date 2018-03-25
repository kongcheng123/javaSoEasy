package reference;

import basis.util.student;
import org.junit.Test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @author xy
 * @date 2018/03/25 15:40
 */
public class PhantomReference_t {
    public static void main(String[] args) {

    }

    /**
     * 虚引用
     */
    @Test
    public void test(){
        Object obj = new Object();
        ReferenceQueue rq = new ReferenceQueue<Object>();
        PhantomReference<Object> pf = new PhantomReference<Object>(obj,rq);
        obj = null;
        pf.get();       //永远返回null
        System.gc();    //返回是否从内存中已经删除
        System.out.println(pf.isEnqueued());
    }
}
