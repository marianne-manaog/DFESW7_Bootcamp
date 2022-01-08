package conditionals_unique_sum;

public class UniqueSumOfThree {

	// variables
	int x;
	int y;
	int z;
	
	boolean isXEqualY = false;
	boolean isXEqualZ = false;
		
	// method that returns an array of unique numbers if input numbers were different
	public int smartSum(int x, int y, int z) {
		
		if (x==y && y==z && x==z) {
			x = 0;
			y = 0;
			z = 0;
		}
		if (x==y && x!=0 && y!=0) {
			isXEqualY = true;
			x = 0;
			y = 0;
		}
		if (x==z && x!=0 && z!=0 && isXEqualY == false) {
			isXEqualZ = true;
			x = 0;
			z = 0;
		}
		if (y==z && y!=0 && z!=0 && isXEqualY == false && isXEqualZ == false) {
			y = 0;
			z = 0;
		}
		int sumOfNums = x + y + z; 
		return sumOfNums;
		
	}
}
