package pl.mccode.sjte.game;

import pl.mccode.sjte.player.Player;

import java.util.Arrays;

public class Game {
	private Player[] players;
	private int roundNumber;

	public Game(Player p1, Player p2){
		this.players = new Player[] {p1,p2};
		play();
		/////// TODO: 04.02.2017 Add game for 2 players feature
	}
	public Game(Player p1, Player p2, Player p3){
		this.players = new Player[] {p1, p2, p3};
		play();
	}
	public Game(Player p1, Player p2, Player p3, Player p4){
		this.players = new Player[] {p1, p2, p3, p4};
		play();
		//// TODO: 04.02.2017 Add game for 4 players feature
	}
	private void play(){
		System.out.println("Game started!");
		System.out.println("Players in game: ");
		printPlayers();
		while(!isGameFinished()){
			roundNumber++;
			System.out.println("Round " + roundNumber);
			System.out.println("Players stats: ");
			printPlayers();
			//// TODO: 04.02.2017 Create new round
		}


	}
	private boolean isGameFinished(){
		for (Player p : players) { if(p.getPoints()>=1000) return true; }
		return false;
	}
	private void printPlayers(){
		for (Player p : players) System.out.println(p);
	}
}
