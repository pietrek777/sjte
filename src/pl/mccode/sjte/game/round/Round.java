package pl.mccode.sjte.game.round;

import pl.mccode.sjte.player.Player;

public class Round {
	public static final int MAIN_PLAYER_INDEX = 0;
	private Player[] players;
	public Round(Player[] players) {
		this.players = players;
		start();
	}
	private void start(){
		System.out.println(players[MAIN_PLAYER_INDEX] + " has to earn at least 100 points (unless anybody wants to play instead of him/her)");
	}


}
