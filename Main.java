package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //метод

        // write your code here. Найти локальный минимум в массиве из целых чисел.
        // в столбик заполнить массив случайными числами, в столбик выводить 9например пятерка на 3 позиции) \arr

        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size]; //math.random
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10); //пишет сигнатуру метода (10 не включается)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] < arr[i-1] && arr[i] < arr[i+1]){
                System.out.println(arr[i] + " на позиции " + i);
            }
        }*/


        //поиск минимального элемента в массиве:
        //найти минимальный элемент в массиве

        /*Scanner in = new Scanner(System.in);

        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];         //math.random
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);       //пишет сигнатуру метода (10 не включается)
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0];
        int minIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if (arr[i]< min){
                min=arr[i];
                minIndex=i;
            }
        }
        System.out.println("min= " + min + " index = " + minIndex);*/


        //Array28. Дан массив A размера N. Найти минимальный элемент из его элементов с четными номерами: A2, A4, A6, . . . .

        /*Scanner in = new Scanner(System.in);

        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];        //math.random
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);       //пишет сигнатуру метода (10 не включается)
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0];
        int minIndex = 0;
        for(int i = 0; i < arr.length; i+=2){
            if (arr[i]< min){
                min=arr[i];
                minIndex=i;
            }
        }
        System.out.println("min= " + min + " index = " + minIndex);*/

        //Array29. Дан массив A размера N. Найти максимальный элемент из его элементов с нечетными номерами: A1, A3, A5, . . . .

        /*Scanner in = new Scanner(System.in);

        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size<=0);
        int[] arr=new int[size];         //math.random
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);        //пишет сигнатуру метода (10 не включается)
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max = arr[1];
        int maxIndex = 1;
        for(int i = 0; i < arr.length; i+=2){
            if (arr[i] > max){
                max=arr[i];
                maxIndex=i;
            }
        }
        System.out.println("max= " + max + " index = " + maxIndex);*/

        //Array51. Даны массивы A и B одинакового размера N. Поменять местами их
        //содержимое и вывести вначале элементы преобразованного массива A, а
        //затем — элементы преобразованного массива B.

        /*Scanner in = new Scanner(System.in);

        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] arr = new int[size];                //math.random
        int[] mas = new int[size];*/

        //заполнение случайными числами
        /*Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);       //пишет сигнатуру метода (10 не включается)
            mas[i] = gen.nextInt(21) - 10;  //что бы у нас второй массив отличался от первого
        }

        System.out.println("Массив arr: ");        //вывод массива arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Массив mas: ");         //вывод массива маs
        for (int i = 0; i < arr.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        //обмен
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i]=mas[i];
            mas[i]=temp;
        }

        //вывод массивов
        System.out.println("Массив arr: ");        //вывод массива arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Массив mas: ");         //вывод массива маs
        for (int i = 0; i < arr.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();*/


        //Array52. Дан массив A размера N. Сформировать новый массив B того же
        //размера, элементы которого определяются следующим образом:
        //B[K] = 2·A[K], если A[K] < 5,
        //A[K]/2 в противном случае.

        /*Scanner in = new Scanner(System.in);

        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];                //math.random
        int[] b = new int[size];

        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(10);       //пишет сигнатуру метода (10 не включается)
        }

        //Вывод массива а
        System.out.println("Массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //формирование массива b
        for (int i = 0; i < a.length; i++) {
            if (a[i]<5){
                b[i]=2*a[i];
            }
            else{
                b[i]=a[i]/2;
            }
        }

        //Вывод массива b
        System.out.println("Массив b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();*/


        //Array53. Даны два массива A и B одинакового размера N. Сформировать новый
        //массив C того же размера, каждый элемент которого равен максимальному
        //из элементов массивов A и B с тем же индексом.

        /*Scanner in = new Scanner(System.in);

        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];                //math.random
        int[] b = new int[size];
        int[] c = new int[size];

        //заполнение массивов a и b случайными числами
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(10);       //пишет сигнатуру метода (10 не включается)
            b[i] = gen.nextInt(10);
        }

        //Вывод массива а
        System.out.println("Массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //Вывод массива b
        System.out.println("Массив b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        //формируем массив с
        for (int i = 0; i < c.length; i++) {
            if (a[i]>=b[i]){
                c[i]=a[i];
            }
            else{
                c[i]=b[i];
            }
        }

        //Вывод массива c
        System.out.println("Массив c: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();*/


        //Array54. Дан целочисленный массив A размера N.
        // Переписать в новый целочисленный массив B все четные числа из исходного массива (в том же
        //порядке) и вывести размер полученного массива B и его содержимое.

        /*Scanner in = new Scanner(System.in);

        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];

        //заполнение массивов a  случайными числами
        Random gen = new Random();
        int even_qty = 0;           //на заполнениии считаем
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(15);
            if (a[i]%2==0) even_qty++;
        }

        //Вывод массива а
        System.out.println("Массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //создание и формирование массива b
        if (even_qty == 0){
            System.out.println("В массиве а нет чётных чисел");
        }
        else {
            int[] b = new int[even_qty];
            int j = 0;
            for (int i = 0; i < a.length; i++) {
                if(a[i]%2==0){
                    b[j]=a[i]; //или b[j++] = a[i];
                    j++;

                }

            }
            System.out.println("Массив b");
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i] + " ");
            }
            System.out.println();
        }  */
        //не получилось


        //Array55. Дан целочисленный массив A размера N (≤ 15). Переписать в новый
        //целочисленный массив B все элементы с нечетными порядковыми номерами (1, 3, . . .) и вывести размер полученного массива B и его содержимое.
        //Условный оператор не использовать.

        /*Scanner in = new Scanner(System.in);

        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        int[] b = new int[size/2];

        //заполнение массивa a случайными числами
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
        }

        //Вывод массива а
        System.out.println("Массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //формирование массива b
        for (int i = 1, j = 0; i < a.length; i+=2, j++) {
            b[j] = a[i];
            //изменение счётчиков
        }

        //Вывод массива b
        System.out.println("Массив b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();*/
        //найдите первы чётный
        // i присваиваем последний и i-- 4 задачи (while) САМОСТОЯТЕЛЬНАЯ!!!


        //Array65. Дан массив A размера N и целое число K (1 ≤ K ≤ N). Преобразовать
        //массив, увеличив каждый его элемент на исходное значение элемента AK.

        Scanner in = new Scanner(System.in);

        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        int[] b = new int[size / 2];

        //заполнение массивa a случайными числами
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
        }

        //Вывод массива а
        System.out.println("Исходный Массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Введите номер элекмента массива ");
        int k = in.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (i != k) {
                a[i] += a[k];
            }
        }
        a[k] += a[k];

        //Вывод преобразованного массива а
        System.out.println("Преобразованный Массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //Array68◦
        //. Дан массив размера N. Поменять местами его минимальный и максимальный элементы

        Scanner in = new Scanner(System.in);

        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        int[] b = new int[size / 2];

        //заполнение массивa a случайными числами
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
        }

        //Вывод массива а
        System.out.println("Исходный Массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //ищем максимальный и минимальный элементы в массиве
        int min = a[0];
        int minIndex = 0; //можно написать алгоритм в котром участвует тоьлко minIndex без min
        int max = a[0];
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            } else if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }

        //переставляем местами макс и минимаьлный
        a[minIndex]=max;
        a[maxIndex]=min;


    }
}
