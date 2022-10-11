public class MultidimensionalArrayPractice {
    public static void main(String[] args) {
        int[][][] arr1 = new int[2][2][2];
        arr1[0][0][0] = 1;

        System.out.println(arr1[0][0][0]);
        System.out.println(arr1[0][0][1]);
        int[][][] arr2 = {{{1, 44}, {2, 66}}, {{4, 44}, {5, 55}}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println("arr["+i+"]["+j+"]["+k+"]=" + arr2[i][j][k]);
                }
            }
        }
    }
}
