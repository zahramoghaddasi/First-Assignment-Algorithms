import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercises2 {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    */

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    For example, 2 is written as II in Roman numeral, just two ones added together.
    12 is written as XII, which is simply X + II.
    The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right.
    However, the numeral for four is not IIII.
    Instead, the number four is written as IV.
    Because the one is before the five we subtract it making four.
    The same principle applies to the number nine, which is written as IX.
    There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

    Given a roman numeral, convert it to an integer.
    */

    public int romanToInt(String s) {
        Map<Character, Integer> romanToValue = new HashMap<>();
        romanToValue.put('I', 1);
        romanToValue.put('V', 5);
        romanToValue.put('X', 10);
        romanToValue.put('L', 50);
        romanToValue.put('C', 100);
        romanToValue.put('D', 500);
        romanToValue.put('M', 1000);
        int finalVar = romanToValue.get(s.charAt(s.length()-1));
        for(int i = s.length()-2 ; i >= 0 ; i--){
            if(romanToValue.get(s.charAt(i)) < romanToValue.get(s.charAt(i+1))){
                finalVar -= romanToValue.get(s.charAt(i));
            }
            else{
                finalVar += romanToValue.get(s.charAt(i));
            }
        }
        return finalVar;
    }

    /*
    Given an array nums of distinct integers, return all the possible permutations.
    You can return the answer in any order.
    */

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> keep = new ArrayList<Integer>();
        keep.add(nums[0]);
        ans.add(keep);
        for(int i = 1 ; i < nums.length ; i++){
            ArrayList<ArrayList<Integer>> keep2 = new ArrayList<ArrayList<Integer>>();
            for(int j = 0 ; j < ans.size() ; j++){
                for(int k = 0 ; k <= i ; k++){
                    ArrayList<Integer> keep3 = new ArrayList<Integer>();
                    keep3 = (ans.get(j));
                    ArrayList<Integer> keep4 = new ArrayList<Integer>();
                    for(int m = 0 ; m < k ; m++)
                        keep4.add(keep3.get(m));
                    keep4.add(nums[i]);
                    for(int m = k ; m <= (i-1) ; m++)
                        keep4.add(keep3.get(m));
                    keep2.add(keep4);
                }
            }
            ans  = keep2;
        }
        for(int i = 0 ; i < ans.size() ; i++){
            for(int j = 0 ; j < ans.get(i).size() ; j++ ){
                System.out.print(ans.get(i).get(j));
                System.out.print(' ');
            }
            System.out.print("\n");
        }
        return null;
    }

    public static void main(String[] args) {
        // test your code here!
    }
}