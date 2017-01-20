package pl.mccode.sjte.player;

import java.util.Objects;

public class Player {
	private String name;
	private int points;
	private int bombs;

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}
	public void addPoints(int points){
		this.points += points;
	}
	public int getBombs() {
		return bombs;
	}
	public void addBomb(){
		this.bombs++;
	}

	public Player(String name) {
		this.name = name;
		this.points = 0;
		this.bombs = 0;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Player)) return false;
		Player player = (Player) o;
		return getPoints() == player.getPoints() &&
				getBombs() == player.getBombs() &&
				Objects.equals(getName(), player.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getPoints(), getBombs());
	}

	@Override
	public String toString() {
		return "Player{ " +
				"name= " + name + ", " +
				", points= " + points +
				", bombs= " + bombs +
				" }";
	}
}
