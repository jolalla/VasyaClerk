package Pruebas;

public class VasyaClerk {
	public static String Tickets(int[] peopleInLine) {
		int bill25 = 0;
		int bill50 = 0;
		int bill100 = 0;

		for (int x = 0; x < peopleInLine.length; x++) {
			if (peopleInLine[x] == 25) {
				bill25++;
			}
			if (peopleInLine[x] == 50) {
				bill25--;
				bill50++;
			}
			if (peopleInLine[x] == 100) {
				if (bill50 > 0) {
					bill50--;
					bill25--;
				} else {
					bill25 -= 3;
				}
			}
			if (bill25 < 0)
				return "NO";
		}
		return "YES";
	}
}