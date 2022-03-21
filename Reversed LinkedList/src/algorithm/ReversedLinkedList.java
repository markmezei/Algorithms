package algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class ReversedLinkedList{

    static Scanner input = new Scanner(System.in);

    public static List<Integer> reversedLinkedList(List<Integer> linkedlist){
        for (int i = 0; i < linkedlist.size() / 2; i++)
        {
            int temp = linkedlist.get(i);
            linkedlist.set(i, linkedlist.get(linkedlist.size() - i - 1));
            linkedlist.set(linkedlist.size() - i - 1, temp);
        }
        return linkedlist;
    }

    public static void main(String[] args){
        List<Integer> linkedList = new LinkedList<>();
        int size, n = 1;
        out.print("\nSize of the array: ");
        size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            out.printf("\n" + n++ + ". element of the array[%d]: ", i);
            array[i] = input.nextInt();
        }
        for(int a1 : array){
            linkedList.add(a1);
        }
        out.println();
        out.println(linkedList);
        reversedLinkedList(linkedList);
        out.println(linkedList);
    }
}

