package com.neebal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayMoreList {
    public static void main(String[] args) {

        List<Integer> marks= Arrays.asList(4,3,5,531,34,22,12,34,545);

//        List<Integer> m1= new ArrayList<>();
//        marks.forEach(mark->{
//            if(mark%2==0 && mark > 4){
//                m1.add(mark);
//            }
//        });
//        System.out.println(m1);

        //Create a new List object

        List<Integer> m1 = marks
                .stream().filter(mark-> mark%2==0 && mark>4)
                .collect(Collectors.toList());
        System.out.println(m1);
     //create a new list object

        List<Integer> m2= marks
                .stream().map(mark->mark-1)
                .collect(Collectors.toList());
        System.out.println(m2);

        List<Integer> m3= marks.stream()
                .filter(mark-> mark%2!=0 && mark<10)
                .map(mark->mark*mark).sorted((a,b)->b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(m3);
    }

}
