public class prob1{
    public static void main(String[] args) {
        int[] myarray = {1,2,3,4,5};
    
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 4;
        myArray[2] = 3;
        myArray[3] = 2;
        myArray[4] = 1;

        //updating
        myArray[2]=9;
        myarray[2]=9; 



        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        
    }


//we can execute outside of the main method

public void arrayDemo() {
    int[] myarray2 = {1,2,3,4,5};
    
    int[] myArray2 = new int[5];
    myArray2[0] = 5;
    myArray2[1] = 4;
    myArray2[2] = 3;
    myArray2[3] = 2;
    myArray2[4] = 1;

    printArray(myArray2);
    printArray(myarray2); 
}
public void printArray(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
}

