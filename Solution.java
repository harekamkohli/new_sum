import java.util.*;
public class Solution {
    public static int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length ;i++){
            for(int j=0;j<nums.length;j++){
                if(i != j){
                int[] twoSum = new int[2];
                int y= nums[i] + nums[j];
                if(target == y){
                    twoSum[0]=i;
                    twoSum[1]=j;
                    return twoSum;
                }
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int a= input.nextInt();

        System.out.println("Enter the array: ");
        int[] b =new int[a];

        for(int i=0; i<a;i++){
            b[i]=input.nextInt();
        }

        System.out.print("Enter the target:");
        int x=input.nextInt();

        int[] y1= twoSum(b,x);
        System.out.print("["+ y1[0] +" ,"+ y1[1] + " ]");

    }
}