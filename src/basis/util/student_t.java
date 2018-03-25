package basis.util;

/**
 * @author xy
 * @date 2018/03/25 14:17
 */
public class student_t {
    public static void main(String[] args) {
        student st1 = new student("a",13);
        student st2 = st1;
        st2.setAge(29);
        System.out.println(st1.toString());
    }
}
