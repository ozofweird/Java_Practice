package template2;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player bPlayer = new Player();
		bPlayer.play(1);
		
		PlayerLevel aLevel = new AdvancedLevel();
		bPlayer.upgradeLevel(aLevel);
		bPlayer.play(2);
		
		PlayerLevel sLevel = new SuperLevel();
		bPlayer.upgradeLevel(sLevel);
		bPlayer.play(3);
		
	}

}
