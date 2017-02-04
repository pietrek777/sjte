package pl.mccode.sjte.game;

import pl.mccode.sjte.player.Player;

public class Game {
	private Player[] players;

	public Game(Player p1, Player p2){
		this.players = new Player[] {p1,p2};
		/////// TODO: 04.02.2017 Add game for 2 players feature
	}
	public Game(Player p1, Player p2, Player p3){
		this.players = new Player[] {p1, p2, p3};
	}
	public Game(Player p1, Player p2, Player p3, Player p4){
		this.players = new Player[] {p1, p2, p3, p4};
		//// TODO: 04.02.2017 Add game for 4 players feature
	}
}
