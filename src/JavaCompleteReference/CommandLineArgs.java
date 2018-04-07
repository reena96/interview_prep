package JavaCompleteReference;

import java.util.ArrayList;
import java.util.List;

public class CommandLineArgs {
    public static void main(String[] args){
        for(int i=0; i<args.length; i++)
            System.out.println("args[" + i + "]: " +
                    args[i]);

        List<Integer> list = new ArrayList<>(0);  //Optional to specify initial capacity
        int y = 0;
        list.add(y); //Autoboxing
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6);
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        //int x = list.get(0); //Unboxing
       // System.out.println(x);

        /***
         *
         *

         Try executing this program, as shown here:
         java CommandLine this is a test 100 -1
         When you do, you will see the following output:
         args[0]: this
         args[1]: is
         args[2]: a
         args[3]: test
         args[4]: 100
         args[5]: -1

         */
    }
}
