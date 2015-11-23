import java.util.Arrays;

public class Monte {
	public static void main(String args[]){
		System.out.println("The probabbility of drawing 3 marbles of the same color");
		System.out.println("100 trials: " + marbleSim(100));
		System.out.println("1000 trials: " + marbleSim(1000));
		System.out.println("10,000 trials: " + marbleSim(10000));
	}
	public static String marbleSim(int numTrials){
		final int B = 1;
		final int W = 2;

		double successes = 0.0;
		double result = 0.0;

		for(int t = 0; t < numTrials; t++){
			result++;

			int[] bowl = { B, B, B, W, W, W };
			int[] drawMarbles = new int[3];

			for (int draw = 0; draw < 3; draw++){
				int index = (int) (Math.random() * bowl.length);
				drawMarbles[draw] = bowl[index];
				int[] newBowl = new int[bowl.length - 1];
				int j = 0;
				for (int i = 0; i < newBowl.length; i++){
					if (i == index){
						continue;
					}
					newBowl[j] = bowl[i];
					j++;
				}
				bowl = newBowl;
			}

			if (drawMarbles[0] == drawMarbles[1] && drawMarbles[1] == drawMarbles[2]){
				successes++;
			}
		}

		return "Result: " + (successes/result);
	}
}