package com;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import com.Period;

import static com.Period.*;

public class Test {

    static boolean f(String s) {
        System.out.println("creating a value for \"" + s + '"');
        return s.isEmpty();
    }

    public static void main(String[] args) {


        String[] s=new String[]{"America is shit","india is avg","nothing is good avg"};
        Arrays.stream(s).filter(str->str.contains("avg")).forEach(System.out::println);


//        Team team=Team.HOME;
//        System.out.println(team.toString());


        //        List<Long> list = new LinkedList<>();
        //        list.add(100L);
        //        list.add(90L);
        //        list.add(80L);
        //        list.add(70L);
        //        list.add(60L);
        //        list.add(50L);
        //
        //        List<Long> newList = new LinkedList<>(list);
        //
        //        System.out.println(list);
        //        System.out.println(newList);

//        LinkedList<Long> list = new LinkedList<>();
//        list.add(100L);
//        list.add(90L);
//
//        List<Long> newList = new LinkedList<>(list);
//        System.out.println(list);
//        System.out.println(newList);
//
//        int size = newList.size();
//        Long element = newList.remove(size - 1);
//        System.out.println(element);
//        System.out.println(list);
//        System.out.println(newList);
//
//        size = newList.size();
//        element = newList.remove(size - 1);
//        System.out.println(element);
//        System.out.println(list);
//        System.out.println(newList);
//
//        size = newList.size();
//        if (size > 0) {
//            element = newList.remove(size - 1);
//            System.out.println("ele=" + element);
//        }
//        System.out.println(list);
//        System.out.println(newList);
//

//        Stack<Long> stack=new Stack<>();
//        stack.push(2L);
//        stack.push(3L);
//
//        //System.out.println(stack);
//
//        Stack<Long> newStack = (Stack<Long>) stack.clone();
//
//      //  System.out.println(stack);
//        System.out.println(newStack);

//        ArrayList<Object> list = new ArrayList<>();
//        list.add("first");
//        list.add("second");
//        list.add("third");
//        list.add("fourth");
//        list.add("fifth");
//        list.add("sixth");
//        list.add("seventh");
//
//        list.remove(0);
//        list.forEach(System.out::println);
//
//        Integer x=null;
//        if(x<0)
//        System.out.println(x);

//        String s="(Popup for yards and downs + name of Happening)";
//        System.out.println(s.split("\\+")[0]);
//        System.out.println("Anurag");



        //        List<String> list=new ArrayList<>();
        //        list.add("1");
        //        list.add("2");
        //        list.add("3");
        //        list.add("4");
        //        list.add("5");
        //        list.add("6");
        //        Optional<String> val = list.stream().filter(n -> Integer.parseInt(n) > 3).findAny();
        //        System.out.println(val);

        //        List<Message> messages = new LinkedList<>();
        //        messages.add(new Message(1, "1st sem"));
        //        messages.add(new Message(2, "2nd sem"));
        //        messages.add(new Message(3, "3rd sem"));
        //        messages.add(new Message(4, "4th sem"));
        //        messages.add(new Message(5, "5th sem"));
        //        messages.add(new Message(6, "6th sem"));
        //
        //        for (ListIterator<Message> it = messages.listIterator(messages.size()); it.hasPrevious(); ) {
        //            Message bookieMessage = it.previous();
        //            boolean isfound = bookieMessage.getId() == 3;
        //            if (isfound) {
        //                it.remove();
        //                break;
        //            }
        //            String[] firstPart = bookieMessage.getText().split(" ");
        //            String str= firstPart[0].replaceAll("[^0-9]","");
        //
        //            int val = Integer.parseInt(str);
        //
        //        }
        //
        //       messages.forEach(System.out::println);


    }
}
