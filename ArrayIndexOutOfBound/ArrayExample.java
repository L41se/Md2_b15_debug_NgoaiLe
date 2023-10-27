package ArrayIndexOutOfBound;

import java.util.Random;

public class ArrayExample {
    public Integer[] getRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu mang: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

}
