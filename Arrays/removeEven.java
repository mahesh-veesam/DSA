
public class removeEven{
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5,6,7,8,9};

        printArray(removeEvenInt(myArray));
    }
    public static int[] removeEvenInt(int[] arr){
        int oddNum = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]%2 != 0){  // counts the odd numbers in the given array
                oddNum++;
            }
        }
        int index = 0;
        int[] result = new int[oddNum]; // declaration of new array with the size of odd num count
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){ 
                result[index]=arr[i]; 
                index++;  // whenever loop executes then the odd num get into the new array using index and index increases for the next one
            }
        }
        return result;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}