import Tournament.Player;

import java.util.ArrayList;

class Team {
    private String name;
    private ArrayList<Player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {

    }

    public void removePlayer(Player player) {

    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}