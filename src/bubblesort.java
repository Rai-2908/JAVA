import java.util.Arrays;
class bubblesort {
     
    static void bubbleSort(int array[]){
        int size= array.length;
        for(int i=0; i<size-1; i++)
            for(int j=0; j<size-i-1; j++)
                if(array[j] > array[j+1]){
                    int temp =array[j];
                    array[j]= array[j+1];
                    array[j+1] =temp;
                }
    }

    public static void main(String[] args) {
        int[] data={12, 32,3232,23,54,7,76,86,75,244};
        bubblesort.bubbleSort(data);

        System.out.println("sorted data");
        System.out.println(Arrays.toString(data));
    }
}