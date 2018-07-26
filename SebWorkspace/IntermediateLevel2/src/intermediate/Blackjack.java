package intermediate;

public class Blackjack {

	public int blackjack(int a, int b) {

		if (a > 21 && b > 21) {
			return 0;
		} else if (((21 - a > 21 - b) || (a > 21)) && (b < 21)) {
			return b;
		} else {
			return a;
		}
	}

}
