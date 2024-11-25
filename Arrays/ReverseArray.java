public class ReverseArray{
    public static void main(String[] args) {
        int[] myArray={1,2,3,4,5};
        System.out.print("Orginal Array : ");
        printArray(myArray);
        System.out.print("Reversed Array : ");
        printArray(reverseArray(myArray));
    }
    public static int[] reverseArray(int[] arr){
       int start = 0; // start index of the given array
       int end = arr.length-1; // last index of the given array

        while(start<end){ 
            int temp=arr[start];
            arr[start]=arr[end];  // It swaps the value one by one until it comes to middle one
            arr[end]=temp;
            start++; // increases the front index 
            end--; // decreases the last index 
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}