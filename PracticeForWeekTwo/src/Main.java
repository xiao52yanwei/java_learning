import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Integer[] printArray = generateRandomArray(1000);

        printArray(printArray);

        long endTime = System.currentTimeMillis();
        long spendTime = endTime - startTime;
        System.out.println(spendTime);
    }

    /**
     *Author: yanwei
     *Description: 生成隨機數組
     * @param arrayLength 數組長度
     *Date: 2017/10/15 11:22
     */
    private static Integer[] generateRandomArray(Integer arrayLength) {
        Integer[] resultArray = new Integer[arrayLength];
        Random random = new Random();
        for (Integer i = 0; i < arrayLength; i++) {
            Integer randomNumber = random.nextInt(10);
            if (i == 0) {
                resultArray[i] = randomNumber;
            } else {
                resultArray[i] = resultArray[i - 1] + randomNumber;
            }
        }
        return resultArray;
    }

    /**
     *Author: yanwei
     *Description: 打印int數組
     * @param array 需要打印的int數組
     *Date: 2017/10/15 11:26
     */
    private static void printArray(Integer[] array) {
        /*
        for (Integer item : array) {
            System.out.println(item);
        }*/
        System.out.print(Arrays.toString(array));
    }
}
