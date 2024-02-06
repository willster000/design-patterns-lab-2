package headfirst.designpatterns.observer.sport;

public class MockGame {

	public static void main(String[] args) {
		GameData gameData = new GameData();

	Observer score = (homeScore, awayScore, half, homePlayer, awayPlayer)-> 
	{System.out.println("Home team: " + homeScore + "\n" + "awayTeam: " + awayScore);};
	gameData.registerObserver(score);

	Observer half = (homeScore, awayScore, halfBool, homePlayer, awayPlayer)->
	{if (halfBool) System.out.println("We're in the first half");
	else System.out.println("We're in the second half");};
		gameData.registerObserver(half);

	gameData.setGameChanges(1, 2, true, "Messi", "Mbappe");
	gameData.setGameChanges(2, 2, false, "Messi", "Mbappe");
	}
}