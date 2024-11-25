public class MINandMax{
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        System.out.println("Maximum number : "+findMaximum(myArray));
        System.out.println("Minimum number : "+findMinimum(myArray));
        System.out.println("Second Maximum number : "+findSecMaximum(myArray));
    }
    public static int findMinimum(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i]; 
            }
        }
        return min;
    }
    public static int findMaximum(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findSecMaximum(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int secMax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < max && arr[i]>secMax){
                secMax = arr[i];
            }
        }
        return secMax;
    }
}