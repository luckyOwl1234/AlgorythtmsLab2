package collection;

/**
 * Created by nightmare on 3/29/17.
 */
public class IsEven implements Predicate {
    @Override
    public boolean test(Object x) {

        return (Integer)x % 2 == 0;
    }
}
