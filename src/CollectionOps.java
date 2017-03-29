package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class CollectionOps {

    // Put your code for print here ...
    public static <T> void print(Collection<T> l){

        boolean ifFirst = true;
        boolean ifLast = false;

        Iterator collIterator = l.iterator();

        while(collIterator.hasNext()){

            if(ifFirst){
                System.out.print("[" + collIterator.next().toString() + ", ");
                ifFirst = false;
            } else if(ifLast){
                System.out.print(collIterator.next().toString() + "]");
                ifLast = false;
            } else {
                System.out.print(collIterator.next().toString() + ", ");
            }
        }
    }




    // Put your code for reverse here ...

    // Put your code for less here ...
    public static <T> boolean less(Collection<T> c1, Collection<T> c2, Comparator<T> comp){

        Iterator collOneIterator = c1.iterator();
        Iterator collTwoIterator = c2.iterator();

        while(collOneIterator.hasNext() && collTwoIterator.hasNext()){

        }
    }
    
    // Example
    public static <T,R> Collection<R>
    map(Function<T,R> f, Collection<T> c)
    {
        // Determine the dynamic type of the collection
        Class<? extends Collection> cls = c.getClass();
        try {
            // Create an object of the same dynamic type as c
            Collection<R> result = (Collection<R>)cls.newInstance();
            // type.cast(type.newInstance());
            // Copy the elements and apply op to them
            for ( T x : c )
                result.add(f.apply(x));
            return result;   
        }   
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Put your code for filter here ...

}
