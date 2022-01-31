package algorithm;
import java.util.Scanner;

public class LinearSearch{
    public static int linearSearch(int[] array, int key){
        for(int n = 0; n < array.length; n++){
            if(array[n] == key){
                return n;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size, key, n = 1;
        System.out.print("\nSize of the array: ");
        size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            System.out.print(String.format("\n" + n++ + ". element of the array[%d] : " , i));
            array[i] = input.nextInt();
        }
        System.out.print("\nEnter the key element what you want to found in the array: ");
        key = input.nextInt();
        System.out.print(key + " is found at index " + linearSearch(array,key) + "\n");
    }
}
