
public class Solution005 {

	public static void main(String[] args) {

		new Solution005();
	}

	public Solution005() {
		int testcase = 0;
		Boolean outcome = false;

		while (!outcome) {
			testcase++;
			int remainders = 0;
			for (int i=1 ; i <= 10; i++ ) {
				remainders += testcase%i;
				if (remainders!= 0) 
					break;
			}		
			if (remainders == 0)
				outcome = true;			
		}
		System.out.println(testcase);
	}
}
