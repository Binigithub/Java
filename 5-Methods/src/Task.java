public class Task {

	public static void main(String[] args) {

		int highScorePosition=calculateHighScorePosition(1500);

		displayHighScorePosition("Mike", highScorePosition);

		highScorePosition=calculateHighScorePosition(900);

		displayHighScorePosition("Smith", highScorePosition);

		highScorePosition=calculateHighScorePosition(400);

		displayHighScorePosition("Anna", highScorePosition);

		displayHighScorePosition("Tedd", calculateHighScorePosition(100));

}

	public static void displayHighScorePosition(String playerName,int highScorePosition) {

		System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");

	}

		public static int calculateHighScorePosition(int playerscore) {

		if(playerscore>=1000) {

			return 1;

		}else if(playerscore>=500 && playerscore<1000) {

			return 2;

		}else if(playerscore>=100 && playerscore<500) {

			return 3;

		}else {

			return 4;

		}

		}

	}
