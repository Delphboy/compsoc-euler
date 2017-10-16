import java.util.ArrayList;

public class Solution002 {

	public static void main(String[] args) {
		
		new Solution002();

	}

	public Solution002() {
		int a = 1;
		int b = 2;
		int c = a+b;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int sum = 0;

		while (c < 4000000) {
			nums.add(c);
			c = a+b;
			a = b;
			b = c;		
		}

		for (Integer i : nums) {
			if (i%2==0) 
				sum +=i;
		}		
		System.out.println(sum);
	}

}
