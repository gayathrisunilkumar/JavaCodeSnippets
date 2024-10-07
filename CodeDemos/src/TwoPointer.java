import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoPointer {
    public static void main(String[] args) {
        Map<Integer, Integer> mapOfPairsWithGivenSum;
        mapOfPairsWithGivenSum = checkPairWithGivenSum(new int[]{1,2,4,6,2},5,6);
        System.out.println(mapOfPairsWithGivenSum);
    }
    public static Map<Integer, Integer> checkPairWithGivenSum(int[] arr, int length, int targetSum){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int l= 0;
        int r = length-1;
        Arrays.sort(arr);
        while(l <r){
            if(arr[l]+arr[r] == targetSum) {
                map.put(arr[l],arr[r]);
                return map;
            }
            else if(arr[l]+arr[r] < targetSum) l++;
            else r--;
        }
        return map;
    }

}
