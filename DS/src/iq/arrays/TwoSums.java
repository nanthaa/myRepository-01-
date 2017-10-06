package iq.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSums
{

	public static void main(String[] args)
	{
		int[] ans = twoSums(new int[] { 1, 2, 3, 4 ,5}, 5);
		System.out.println(ans[0] + " - " + ans[1]);
	}

	public static int[] twoSums(int[] nums, int target)
	{
		int[] arr = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++)
		{
			Integer val = map.get(target - nums[i]);
			System.out.println(val);
			if (val == null)
			{
				map.put(nums[i], i);
			}
			else
			{
				arr[0] = val;
				arr[1] = i;
				break;
			}
		}
		return arr;
	}
}
