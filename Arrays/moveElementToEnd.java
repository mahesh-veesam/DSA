public class moveElementToEnd{
    public static void main(String[] args){
        int[] myArray = {1,2,0,3,4,5,0,7,9,0,6};
        printArray(moveEnd(myArray));

    }
    public static int[] moveEnd(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
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