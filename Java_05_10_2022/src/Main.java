public class Main {
    //ArrayPractice
    public static void main(String[] args) {

        int[][] arr1 = new int[3][3];
        arr1[0][0]= 5;

        printArray(arr1);
        int[][] arr2 = {{5, 7, 19}, {13, 4, 1}, {17, 44, 22, 33}};

        printArray(arr2);

        System.out.println();

        boolean[][] arrBoolean = new boolean[3][3];
        for (int i = 0; i < arrBoolean.length; i++) {
            for (int j = 0; j < arrBoolean[i].length; j++) {
                System.out.println(arrBoolean[i][j] + " ");
            }
        }
    }

    private static void printArray(int[][] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

}