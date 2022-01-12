package factorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factorial {

	public String getFactorial(int n) {

		int i = 1;
		List<Integer> list = new ArrayList<>();
		List<Integer> listOfDivision = new ArrayList<>();
		List<Integer> listOfRemainder = new ArrayList<>();

		while (n >= 1) {
			n /= i;
			i += 1;
			if (n % i == 0 && n / i >= 1) {
				list.add(i);
				int quotient = n / i;
				listOfDivision.add(quotient);
			}
		}

		String maximumNumber = Collections.max(list).toString();

		if (Collections.min(listOfDivision) != 1) {
			maximumNumber = "NONE";

		}
		return maximumNumber;

	}

}
