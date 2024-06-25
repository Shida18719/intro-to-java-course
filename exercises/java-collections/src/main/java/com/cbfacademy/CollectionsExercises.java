package com.cbfacademy;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        LinkedList<Integer> linkedElement = new LinkedList<>();

        linkedElement.addFirst(4);
        linkedElement.add(5);
        linkedElement.add(6);
        linkedElement.add(8);
        linkedElement.add(2);
        linkedElement.add(9);
        linkedElement.addLast(2);
        linkedElement.add(2, 4);
        System.out.print(linkedElement.element());

        return linkedElement;
    }
        
    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack

        Stack<Integer> stackElement = new Stack<>();

        stackElement.push(5);
        stackElement.push(6);
        stackElement.push(8);
        stackElement.push(9);
        System.out.print(stackElement.firstElement());
        System.out.print(stackElement.lastElement());
        System.out.print(stackElement.pop());
        stackElement.push(4);

        return stackElement;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        ArrayDeque<Integer> dequeElement = new ArrayDeque<>();
        dequeElement.add(5);
        dequeElement.add(6);
        dequeElement.add(8);
        dequeElement.add(9);
        System.out.print(dequeElement.peekFirst());
        System.out.print(dequeElement.peekLast());
        System.out.print(dequeElement.poll());
        System.out.print(dequeElement.element());

        return dequeElement;

    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        HashMap<Integer, String> hashMapElement = new HashMap<>();
        hashMapElement.put(1, "TypeScript");
        hashMapElement.put(2, "Kotlin");
        hashMapElement.put(3, "Python");
        hashMapElement.put(4, "Java");
        hashMapElement.put(5, "JavaScript");
        hashMapElement.put(6, "Rust");

        System.out.print(hashMapElement.keySet());
        System.out.print(hashMapElement.values());
        System.out.print(hashMapElement.containsValue("English"));

        return hashMapElement;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
