import java.util.*;
public class rotatedSearch{

    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter length of array");
        int num = scanObj.nextInt();
        int[] arr = new int[num];
        System.out.println("Fill the array");
        for(int i=0;i<num;i++){
            arr[i] = scanObj.nextInt(); 
        }
        System.out.println("Enter target number");
        int target = scanObj.nextInt();
        System.out.println("Found at position: "+checkNumber(arr, 0, arr.length-1, target));
    }

    public static int checkNumber(int[] arr, int low, int high, int target){
        if(low>high){
            return -1;
        }
        int mid = low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[low]<=arr[mid]){
            if(target<=arr[mid] && target>=arr[low]){
                return checkNumber(arr, low, mid-1, target);
            }else{
                return checkNumber(arr, mid+1, high, target);
            }
        }else if(arr[mid]<=arr[high]){
            if(target>=arr[mid] && target<=arr[high]){
                return checkNumber(arr, mid+1, high, target);
            }else{
                return checkNumber(arr, low, mid-1, target);    
            }
        }
    return -1;
    }
}