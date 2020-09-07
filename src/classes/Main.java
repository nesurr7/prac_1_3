package classes;

import java.util.Arrays;

public class Main {
    static int forSum(int[] array) {
        int len = array.length;//Длина массива
        int sum = 0;//Сумма
        for (int i = 0; i < len; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int whileSum(int[] array) {
        int len = array.length;//Длина массива
        int sum = 0;//Сумма
        int i = 0;
        while (i < len) {
            sum += array[i];
            i++;
        }
        return sum;
    }

    static int doWhileSum(int[] array) {
        int len = array.length;//Длина массива
        int sum = 0;//Сумма
        int i = 0;
        if (len!=0)
        {
            do
            {
                sum+=array[i];
                i++;
            }
            while(i<len);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{7, 6, 3, 19, 0, -4};
        System.out.println("До суммирования методом forSum:" + Arrays.toString(array));
        System.out.println("После суммирования методом forSum:" + forSum(array));
        System.out.println("После суммирования методом whileSum:" + whileSum(array));
        System.out.println("После суммирования методом doWhileSum:" + doWhileSum(array));
    }
}

