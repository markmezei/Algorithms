package algorithm;
import java.util.Scanner;

public class BubbleShort {
    public static void bubbleShort(int[] array){
        int temp;
        for(int n = 0; n < array.length; n++){
            for(int k = 1; k < array.length-n; k++){
                if(array[k-1] > array[k]){
                    temp = array[k-1];
                    array[k-1] = array[k];
                    array[k] = temp;
                }

            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size, n = 1;
        System.out.print("\nSize of the array: ");
        size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            System.out.print(String.format("\n" + n++ + ". element of the array[%d]: ", i));
            array[i] = input.nextInt();
        }

        System.out.print("\nArray before bubble sort\n");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        bubbleShort(array);

        System.out.println();
        System.out.print("\nArray after bubble sort\n");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
    }
}
