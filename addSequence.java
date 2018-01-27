import java.util.*;
public class addSequence{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to enter? ");
        int num = scanner.nextInt();
        System.out.println("Please Enter target number");
        int target = scanner.nextInt();
        System.out.println("Enter the array");
        int seq[] = new int[num];
        for(int i=0;i<num;i++){
            seq[i]= scanner.nextInt();
        }
        display(seq);
        boolean ans = addSeq(seq, target);
        System.out.println(ans);
    }

    public static void display(int[] seq){
        for(int i=0;i<seq.length;i++){
            System.out.println(seq[i]);
        }
    }

    public static boolean addSeq(int[] seq, int target){
        int sum=0;
        if(seq.length==0){
            return false; 
        }
        for(int i=0;i<seq.length;i++){
            sum = sum+seq[i];
            if(sum == target)
                return true;
        }
        return false;
    }
}