import java.util.*;
import java.util.List;

import collection.*;
import com.sun.tools.javac.util.*;

import static collection.CollectionOps.*; // Use static methods without the "Collection." prefix

public class Main {
    public static void main(String[] args) {    
         ArrayList<String> names = new ArrayList<String>();

         // Test print for an empty list
         print(names);

         // Test print for a list containing one element
         names.add("a");
         print(names);

         // Test print for a list containing more than one element
         names.add("b");
         names.add("c");
         /*names.add("d");
         names.add("e");
         names.add("f");
         names.add("g");*/
         print(names);
         
         // Test the return value from reverse
         print(reverse(names));
         // Test that reverse mutates its argument
         print(names);

         // Assignment 4: Write code to test less here
         Comparator stringComp = (o1, o2) -> ((String) o1).compareTo((String) o2);
         Comparator integerComp = (o1, o2) -> ((Integer) o1).compareTo((Integer) o2);

         List<Integer> li1 = new LinkedList<>();
         li1.add(4);
         li1.add(2);
         li1.add(5);
         li1.add(1);
         li1.add(3);

         List<Integer> li2 = new LinkedList<>();
         li2.add(8);
         li2.add(6);
         li2.add(7);
         li2.add(9);

         List<Integer> li3 = new LinkedList<>();
         li3.add(97);
         li3.add(5);
         li3.add(123);
         li3.add(18);

         List<String> johanneberg = new LinkedList<>();
         johanneberg.add("HC2");
         johanneberg.add("ED");
         johanneberg.add("HC3");

         List<String> lindholmen = new LinkedList<>();
         lindholmen.add("Saga");
         lindholmen.add("Svea");
         lindholmen.add("Jupiter");

         List<String> lindholmen1 = new LinkedList<>();
         lindholmen.add("Saga");
         lindholmen.add("Svea");
         lindholmen.add("Jupiter");

         System.out.println(less(li1,li2,integerComp));
         System.out.println(less(li1,li3,integerComp));
         System.out.println(less(johanneberg,lindholmen, stringComp));
         System.out.println(less(lindholmen1,lindholmen, stringComp));

         // Assignment 5: Write code to test map here

         List<Double> l11 = new ArrayList<>();
         Collections.addAll(l11, 23.4, -19.0, 377.62, 0.0, 18.9, -32.12);

         List<Integer> l22 = (List<Integer>) map(new Sign(),l11);
         print(l22);
             
         // Assignment 5: Write code to test filter here
         IsEven iE = new IsEven();
         List<Integer> l1 = new ArrayList<>();
         Collections.addAll(l1,3, -42, 88, 19, -37, 0, 18);

         System.out.println("\nUnchanged List");
         print(l1);
         System.out.println("\nChanged List");
         List<Integer> l2 = (List<Integer>)filter(iE, l1);
         print(l2);

         ArrayList<Person> pl = new ArrayList<>();
         pl.add(new Person("Nisse","nisse@hipnet.moc","male",23));
         pl.add(new Person("Lisa","lisa@shipnet.sea","female",67));
         pl.add(new Person("Ada","ada@jahuu.vanu","female",49));
         pl.add(new Person("Kal","karl@gotnet.vg","male",78));
         pl.add(new Person("Beda","beda@fishnet.cod","female",102));
        
         // Assignment 6: Write code using lambdas here
         print(map((o1)->o1.getEmail(),filter((o2)->o2.getAge() > 65 && o2.getGender().equals("female"),pl)));

    }
}














