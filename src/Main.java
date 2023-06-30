import javax.swing.plaf.synth.SynthDesktopIconUI;

// LINEAR SEARCH
/*public class Main {

    public static void main(String[] args) {
        
        int[] array={9, 1, 2, 3, 4, 5, 6, 7, 8, 10};
        int index = LinearSearch(array, 11);

        if(index != -1){
            System.out.println("Element Found at index "+ index);
        }
        else{
            System.out.println("Element not found");
        }


    }

    private static int LinearSearch(int[] array, int value) {
        for(int i=0; i<array.length;i++ ){
            if(array[i]==value){
                return i;
            } 
        }
        return -1;
    }
}
*/

// BINARY SEARCH
/*import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        int array[]= new int[100];
        int target= 189;

        for(int i=0; i<array.length; i++){
            array[i]=i;
        }

        int index=binarySearch(array, target);
        if(index == -1){
            System.out.println(target + " not found");
        }
        else{
            System.out.println("Element found at: "+ index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low=0;
        int high=array.length-1;

        while(low<=high){

            int mid = low+(high-low)/2;
            int value= array[mid];
            
            if(value< target) low= mid + 1;
            else if (value>target) high = mid-1; 
            else return mid;// target is found
        }

        return -1;// target not found
    }

}*/

// Interpolation data search
/*improvemnt over binar search  best used for"uniformly" distributesd "guesses 
where a value might be based on calculated probe result"
if probe is incorrect, search area is narrowed, and a new probe is 

average case : O(log(log(n)))
worst case:O(n)[valiues increase exponetially]
*/

public class  Main {
    public static void main(String  args[]) {

        int[] array ={1,2,3,4,5,6,7,8,9};
        int index=interpolationSearch(array, 15);

        if(index != -1){
            System.out.println("Element found out at index: "+index);
            
        }
        else{
            System.out.println("Element not found");
        }
        
    }

    private static int interpolationSearch(int[]array, int value) {
        
        int high= array.length -1;
        int low=0;

        while(value >= array[low] && value<= array[high] && low<=high){

            int probe= low+(high - low)*(value- array[low])/
                        (array[high]- array[low]);

            System.out.println("probe: "+probe);

            if(array[probe]== value){
                return  probe;
            }
            else if(array[probe]< value){
                low=probe +1;
            }
            else{
                high = probe-1;
            }
        }
        return -1;
    }
}









