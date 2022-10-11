public class CloneArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3};
        int[] clone = intArr.clone();

        System.out.println(intArr == clone);
        for (int i = 0; i < clone.length; i++) {
            System.out.println(clone[i] + " ");
        }

        int[][] arr = {{10, 20, 30},{40,50}};
        int[][] cloneArr = arr.clone();

        System.out.println(arr == cloneArr);
        System.out.println(arr[0] == cloneArr[0]);
        System.out.println(arr[1] == cloneArr[1]);
    }
}
