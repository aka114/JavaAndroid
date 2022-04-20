package lesson3;



import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestArrays {

    static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        //testRandom();
        testConsoleInput();

    }

    private static void testConsoleInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input int:");
        int a = getNumFromScanner(scan);
    }

    private static int getNumFromScanner(Scanner scan) {
        while(true){
            if(scan.hasNextInt()){
                return scan.nextInt();
            }
            System.out.println("Type mismatch");
            scan.next();
        }
    }

    private static void testRandom() {
        int[] data = new int[40];
        Random rnd = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt(10, 20);
            data[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(data));
    }

    private static void testTwoArray() {
        int[][] deepData = new int[3][3];
        //int[][] deepData = {{1, 2, 3}, {}};

        deepData[0][0] = 1;
        deepData[0][1] = 1;
        deepData[0][2] = 1;
        deepData[1][0] = 1;
        deepData[1][1] = 1;
        deepData[1][2] = 1;
        deepData[2][0] = 1;
        deepData[2][1] = 1;
        deepData[2][2] = 1;

/*
        int n = 1;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData.length; j++) {
                deepData[i][j] = n++;
            }
        }
*/
        for(int[] datum : deepData) {
            for(int num:datum) {
                
            }
        }
    }

    private static void testOneArray() {

        int[] data = new int[ARRAY_SIZE];
        int[] data1 = {1, 2, 3, 4, 5};

        data[0] = 3;
        data[5] = 3;
        data[3] = 7;
        data[6] = 8;
        data[8] = 11;
        data[9] = 0;
        data[1] = 3;
        Arrays.sort(data);

        System.out.println(Arrays.toString(data));
    }

}
