package Day16;

import java.util.*;

public class CollectionFramework {
    /*
    CollectionFramework
    ---------Represent a collection of objects, collection framework can only store objects.
    (Wrapper class)
     --------The process of converting primitive data types into an object wrapper class.
    (Auto boxing -- Wrapper class conversation Automatically)
                  Automatically convert a primitive data types into a corresponding object.
    (Auto Unboxing -- Wrapper class object to primitive data type)
                      Vise versa
    Comparator and Comparable Both are interfaces
    Type_Casting:
              Type casting in Java is the process of converting a value from one data type into another
    Generics:
              Java Generics allow classes, interfaces, and methods to work with different data types while providing compile-time type safety.
    Util Package;
    CollectionFramework
    -------------------Map_Interface:
    --------------------Collection_Interfaces:
    ------------------------------------------Set_Interface:
    -------------------------------------------Queue_Interface:
    -------------------------------------------List_Interface:  What is list? == It maintains insertion order , it allows duplicate's therefore everything below allows it.
    --------------------------------------ArrayList(Dynamic Array): Dynamically increase the Array size.
                                                                             Lamda Expression(Anonymous fuction): (Arguments/Parmeters) -> {Expression}
    --------------------------------------LinkedList:
    --------------------------------------Vector:
    --------------------------------------Stack:
    */


    static class ArrayListExamples{
        public static void main(String[] args) {

//            ArrayList<Integer> arr = new ArrayList();
//            arr.add(10);
//            arr.add(2);
//            arr.add(3);
//            arr.add(40);
//            arr.add(40);
//
//            System.out.println(arr); //does the same things calls the .toString internally
//            arr.remove(2);
//            System.out.println(arr); //[10,2,40,40]
//
//            System.out.println(arr.indexOf(40)); // 3, gives the first occurrence of the element
//
//            System.out.println(arr.indexOf(123));// Gives -1 not found
//
//            arr.remove(arr.indexOf(40)); //arr.remove takes index we get the index of an element using .indedxOf of an element thus using two method in once
//
//            System.out.println(arr); //


//            System.out.println(arr.toString());
//            for(int i = 0 ; i < arr.size() ; i++){
//                System.out.printf(arr.get(i) + " ");
//            }
//            System.out.println();
//            for(Integer o  : arr){
//                System.out.println(o);
            //    }

            ArrayList<Integer> arr2 = new ArrayList();
            arr2.add(13);
            arr2.add(288);
            arr2.add(30);
            arr2.add(30);
            arr2.add(31);

            arr2.sort(Comparator.naturalOrder());
            System.out.println(arr2);


            arr2.sort(Comparator.reverseOrder());
            System.out.println(arr2);


            Collections.sort(arr2);
            System.out.println(arr2);

            Collections.reverse(arr2);
            System.out.println(arr2);


//            arr2.set(arr2.indexOf(31) , 300);
//            System.out.println(arr2);
//
//            //Collection's is a class
//
//            //Collection is an interface
//
//            System.out.println(arr2.contains(22));

//            arr2.clear();
//            System.out.println(arr2.isEmpty());



//            int n = 30;
//            System.out.println(arr2);
//
//            for(int i = 0; i < arr2.size(); i++){
//                if(arr2.get(i) == n){
//                    arr2.remove(i);
//                    --i;
//                }
//            }
//            System.out.println(arr2);


        }
        static class CustomSorting{
      /*
      Requirement for CustomSorting:
        Interface and Functional Interface : If there is only one abstract method then the Interface is called Functional interface Use's an annotation called -- @FunctionalInterface
        But in Functional interface we use *Lambda expression* Anonymous function so that to override the method of the Functional Interface without needing a  class to be implement to override.
   */

        }
    }
}
