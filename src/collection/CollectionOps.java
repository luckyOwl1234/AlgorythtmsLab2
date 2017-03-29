package collection;

import java.util.*;

public class CollectionOps {

    // uppgift 2
    public static <T> void print(Collection<T> l){

        boolean ifFirst = true;
        boolean ifLast = false;
        int counter = 0;

        Iterator collIterator = l.iterator();

        while(collIterator.hasNext()){

            int size = l.size() - 1;
            counter++;

            if(ifFirst){
                if (size == 0){
                    System.out.print("[" + collIterator.next().toString() + "]\n");
                }else {
                    System.out.print("[" + collIterator.next().toString() + ", ");
                }
                ifFirst = false;
            } else if(ifLast){
                System.out.print(collIterator.next().toString() + "]\n");
                ifLast = false;
            } else if (!ifFirst && !ifLast){
                System.out.print(collIterator.next().toString() + ", ");
                if(counter == size){
                    ifLast = true;
                }
            }
        }
    }

    // Put your code for reverse here ...
    public static <T> List<T> reverse(List<T> l){
        //Collections.reverse(l); ??
        for(int i = 0, j = l.size()-1;i<=(l.size()/2)-1;i++,j--) {
            T temp = l.get(i);
            l.set(i,l.get(j));
            l.set(j,temp);
        }
        return l;
    }

    // Put your code for less here ...
    public static <T> boolean less(Collection<T> c1, Collection<T> c2, Comparator<T> comp){
        try{
            if (comp.compare(Collections.max(c1,comp),Collections.min(c2,comp))<0){
                return true;
            }
        }catch (NoSuchElementException e){
            return false;
        }
        return false;
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
    public static <T> Collection<T> filter (Predicate isEven, Collection<T> l) {

        // Determine the dynamic type of the collection
        Class<? extends Collection> cls = l.getClass();
        try {
            // Create an object of the same dynamic type as c
            Collection<T> result = (Collection<T>)cls.newInstance();
            // type.cast(type.newInstance());
            // Copy the elements and apply op to them
            for ( T x : l ) {
                if (isEven.test(x))
                    result.add(x);
            }
            return result;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
