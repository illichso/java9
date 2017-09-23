package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Word!");

            Process process = Runtime.getRuntime().exec("ls");
            Future<Integer> exitValue = process.onExit().thenApply(Process::exitValue);
            System.out.println(exitValue.get());
            System.out.println(process.isAlive());
            System.out.println(process.pid());

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        list.forEach(System.out::println);
        System.out.println("Changing");
        list1.set( 0, -1 );
        list1.forEach(System.out::println);



    }
}
