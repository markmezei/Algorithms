package algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTree{

    public static class node{
        int data;
        node left;
        node right;
    }

    static int index;

    public static void store(node node, int[] array){
        if (node == null){
            return;
        }

        store(node.left, array);
        array[index] = node.data;
        index++;
        store(node.right, array);
    }

    public static int count(node root){
        if(root == null){
            return 0;
        }

        int n = count(root.left);
        int k = count(root.right);
        return n+k+1;
    }

    public static void Tree(int[] array, node root){
        if (root == null){
            return;
        }

        Tree(array, root.left);
        root.data = array[index];
        index++;
        Tree(array, root.right);
    }

    public static void convertTree(node root){
        if (root == null){
            return;
        }

        int i = count(root);
        int[] array = new int[i];
        store(root, array);
        Arrays.sort(array);
        index = 0;
        Tree(array, root);
    }


    public static node add(int data){
        node temp = new node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    public static void print(node node){
        if(node == null){
            return;
        }

        print(node.left);
        System.out.print(node.data + " ");
        print(node.right);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        node root;

        int k = 1;
        int[] nodes = new int[9];
        for(int n = 0; n < nodes.length; n++){
            System.out.print("\n" + k++ + ". node of the three: ");
            nodes[n] = input.nextInt();
        }

        root = add(nodes[0]);
        root.left = add(nodes[1]);
        root.right = add(nodes[2]);
        root.left.left = add(nodes[3]);
        root.right.right = add(nodes[4]);
        root.left.right = add(nodes[5]);
        root.right.left = add(nodes[6]);
        root.left.left.left = add(nodes[7]);
        root.right.right.right = add(nodes[8]);

        System.out.print("\nBinary Tree\n");
        print(root);
        convertTree(root);
        System.out.print("\n\nConverted Binary Search Tree\n");
        print(root);
        System.out.println();
        System.exit(0);
    }
}