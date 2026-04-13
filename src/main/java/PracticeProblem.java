import java.util.ArrayList;
import java.util.List;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}
	public static String[] towerOfHanoi(int n) {
		List<String> moves = new ArrayList<>();
		if (n <= 0) {
			return moves.toArray(new String[0]);
		}
		solve(n, 'L', 'R', 'M', moves);
		return moves.toArray(new String[0]);
	}

	private static void solve(int n, char from, char to, char aux, List<String> moves) {
		if (n <= 0) {
			return;
		}
		if (n == 1) {
			moves.add("" + from + to);
			return;
		}
		solve(n - 1, from, aux, to, moves);
		moves.add("" + from + to);
		solve(n - 1, aux, to, from, moves);
	}


	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
