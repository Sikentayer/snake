package HomeWork2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] array2 = new int[array1.length];
        for (int i =1; i < array1.length; i++){
            array2[i] = (array1[i] + 1) % 2;
        }
        System.out.println("Задание 1.");
        System.out.println("Исходный    массив    : " + Arrays.toString(array1));
        System.out.println("Инвертированный массив: " + Arrays.toString(array2) + "\n");

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] array3 = new int[8];
        for (int i = 1; i < array3.length; i++){
            array3[i] = array3[i-1] + 3;
        }
        System.out.println("Задание 2. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21");
        System.out.println(Arrays.toString(array3) + "\n");

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        int[] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array4.length; i++){
            if (array4[i] < 6){
                array4[i] *= 2;
            }
        }
        System.out.println("Задание 3. Пройти по массиву циклом и числа меньшие 6 умножить на 2");
        System.out.println(Arrays.toString(array4) + "\n");

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("Задание 4. С помощью цикла(-ов) заполнить диагональные элементы массива единицами");
        int dimension = 10;
        int[][] array5 = new int[dimension][dimension];
        for(int i = 0; i < dimension; i++){
            array5[i][i] = 1;
            array5[i][dimension - i -1] = 1;
            System.out.println(Arrays.toString(array5[i]));
        }
        System.out.println(' ');

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("Задание 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы");
        int[] array6 = new int[dimension];
        for(int i = 0; i < dimension; i++){
            array6[i] = i;
        }
        int arrayMin = 0;
        int arrayMax = 0;
        for(int i = 0; i < dimension; i++){
            if(array6[i] > arrayMax){
                arrayMax = array6[i];
            }else if (array6[i] < arrayMin){
                arrayMin = array6[i];
            }

        }
        System.out.println(Arrays.toString(array6) + " минимальный элемент массива " + arrayMin + "\tмаксимальный элемент массива " + arrayMax + "\n");

        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
        // checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.
        int[] array7 = {1, 1, 1, 2, 1};
        System.out.println("Задание 6. Написать метод, который должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны");
        System.out.println(Arrays.toString(array7) + " checkBalance: " + checkBalance(array7) + "\n");

        //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.




    }

    public static boolean checkBalance(int[] array){
        int dimension = array.length;
        int sumLeft = 0;
        int sumRight = 0;
        for(int i = 0; i < dimension - 1; i++){
            sumLeft += array[i];
            sumRight = 0;
            for(int j = dimension - 1; j > i; j--){
                sumRight += array[j];
            }
            if(sumLeft == sumRight){
                return true;
            }
        }
        return false;
    }

    public static void shiftMatrix(int[] array, int shiftCount){

    }

}
