public class accOrder{
    public static void main(String[] args){
        int[] myArray = {1,2,9,10,3,5};
        printArray(increasingOrder(myArray));

    }
    public static int[] increasingOrder(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]) { 
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }      
        }
        return arr;
    }
    public static void printArray(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
}