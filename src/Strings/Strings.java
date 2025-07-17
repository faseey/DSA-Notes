package Strings;
import java.lang.String;
import java.util.Arrays;
import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {
        String a = "Fasih";
        String b = "Fasih";
        String c = "Fasih";


        System.out.println(a);
        a = "Ali";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        /// /////Strings are immutable you cant change them /////
        ///  by assigning to another string it simply creates a new object and if no one is refrecning ot the previous one grabage collector does its job/////
        /// / String pool helps top optimize  program if 10 refrences are equal to "fasih" no 10 objects will be created
        System.out.println(b==c);  //both pointing to the same object true Because Java optimizes string literals using a thing called "String Pool".
        System.out.println(b==a); //a is refrencing to other object


        //== meaning pointing to same or not
        // .equals to check valuess
        String d = new String("hello");
        String f = new String("hello");
        //these values outiside the pool but in heap

        System.out.println(d == f);        //false since new keyword creating new object  and are outside the pool
        System.out.println(d.equals(f));


        System.out.println('a' +'b'); //195
        System.out.println("a" + "b"); //ab
        System.out.println('a' + 3); //100
        System.out.println("a" + 3); //a3
        //this will become same as "a" + 3  after some steps
        //integer will be converted to INTEGER wrapper class whici iwll can to string method


        System.out.println("a" + new ArrayList<>()); // a[]
        System.out.println("a" + new int[4]);
        // unlike arraylist arrays dont override to string so the pribnt default

        System.out.println("a" + Arrays.toString(new int[4]));


        // if there is object it will call ot string method



        //+//
        // it works for primitve
        //incase of object complex object there should have a string in it if there is a string the ans will be alway sin string

        System.out.println(56 +" " + new ArrayList<>()); // this will work
       //System.out.println(56  + new ArrayList<>()); // this wwont


        //operator overloaded
        System.out.println("a" + "b");
        //addiotnal funtions like concatinating
        // in case of stings only
        // cant merge complex objects like arraylist hashmap


        //System.out.println("a" - "b"); wont work


        String series = "";
        for(int i =0;i<26;i++){
            char ch = (char)('a'+i);
            series = series + ch;//it acts like sout("a" +"b") creatting new object

        }
        System.out.println(series);



        String name = "Fasih Khalil";
        char[] ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));
        String name1 ="ali";
        System.out.println(Arrays.toString(name1.toCharArray()));

    }

}
