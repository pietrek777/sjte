package pl.mccode.sjte.game;

import pl.mccode.sjte.game.round.Round;
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
			System.out.println("Current players stats: ");
			printPlayers();
			System.out.println("Round " + roundNumber);
			Round round = new Round(players);
			movePlayersArray();
		}
		System.out.println("The Game has ended!");
		Arrays.sort(players);
		System.out.println("The winner is " + players[0].getName());
		System.out.println("Players stats: ");
		printPlayers();
		System.out.println("Thanks for playing");
	}
	private boolean isGameFinished(){
		for (Player p : players) { if(p.getPoints()>=1000) return true; }
		return false;
	}
	private void printPlayers(){
		for (Player p : players) System.out.println(p);
	}
	private void movePlayersArray(){
		Player temp = players[0];
		for(int i=0; i<players.length-1; i++){
			players[i]=players[i+1];
		}
		players[players.length-1] = temp;
	}
}
