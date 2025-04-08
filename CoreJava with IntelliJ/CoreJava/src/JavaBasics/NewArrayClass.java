package JavaBasics;

public class NewArrayClass {
    GetInput newInput = new GetInput();
    public int[] defineArray(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = newInput.getInt();
        }
        newInput.closeInput();
        return arr;
    }

    public void printArray(int[] arr){
        System.out.print("Elements in an Array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
