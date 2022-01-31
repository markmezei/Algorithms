package algorithm;
import java.util.Scanner;

public class BinarySearch{
    public static int binarySearch(int[] array, int key, int first, int last){
        if(first <= last){
            int mid = (first + last)/2;
            if(key == array[mid]){
                return mid;
            }
            if(key < array[mid]){
                return binarySearch(array, key,first, mid);
            }
            if(key > array[mid]){
                return binarySearch(array, key, mid, last);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size, key, n = 1, first = 0;
        System.out.print("\nSize of the array: ");
        size = input.nextInt();
        int[] array = new int[size];
        int last = array.length-1;
        for(int i = 0; i < array.length; i++){
            System.out.print(String.format("\n" + n++ + ". element of the array[%d]: ", i));
            array[i] = input.nextInt();
        }
        System.out.print("\nEnter the key element what you want to found in the array: ");
        key = input.nextInt();
        int find = binarySearch(array,key,first,last);
        if (find == -1){
            System.out.println("\nElement isn't found!");
        }
        else{
            System.out.println("\nElement is found at index: " + find);
        }
    }

}

