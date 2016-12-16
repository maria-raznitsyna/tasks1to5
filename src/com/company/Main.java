package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// first task
        String name;
        System.out.println("What is your name?");
        name = new Scanner(System.in).next();
        System.out.println("Hello," + name + ",nice to see you!");
        //third password
        String pass= "training";
        Scanner password= new Scanner(System.in);
        boolean c = false;
        System.out.println("\nWhat is your password? ");
        while (c != true) {
            String passtest= password.next();
            if (pass.equals(passtest)){
                System.out.println("your password is correct!");
                c = true;
            } else {
                System.out.println("WRONG PASSWORD!Try again: ");
                c =false;
            }}
     // second task
        Scanner vvod = new Scanner(System.in); // Объявляем Scanner
        int sum=0;
        int mult=1;
        System.out.println("Enter array length: ");
        int size = vvod.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = vvod.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            sum+= array[i];
            mult =mult* array[i];
        }
        System.out.println("Array elements in reverse order: ");
        for (int i=size;i>0;i--){
            System.out.print( array[i-1]+";");
        }
        System.out.println("\nThe sum of elements of array is: "+ sum);
        System.out.println("The multiply of elements of array is: "+ mult);
   // task four randomizer
       // Scanner input = new Scanner(System.in);
        System.out.println("\nenter the quantity of elements of random array: ");
        int sizer= vvod.nextInt();
        int number [] = new int[sizer];
        Random rand= new Random();
        for (int i=0;i<sizer;i++) {
            number[i]= rand.nextInt(1000);
            System.out.println( "The number [" + (i+1) +"]  is : " + number[i]+";");
            // System.out.print( "The number [" + (i+1) +"]  is : " + number[i]+";");//для вывода на одной строке
        }
        System.out.print("\nrandom array is: ");
        System.out.println(Arrays.toString(number));


}
}
