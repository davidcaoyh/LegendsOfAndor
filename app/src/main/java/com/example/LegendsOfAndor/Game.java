package com.example.LegendsOfAndor;

public class Game {
    private int maxNumPlayers;
    private int currentNumPlayers;
    private Player[] players;
    private String gameName;
    private boolean isActive;

    public Game() {
    }

    public Game(Player p, int maxNumPlayers, String gameName) {
        this.gameName = gameName;
        this.maxNumPlayers = maxNumPlayers;
        this.currentNumPlayers = 1;
        this.players = new Player[maxNumPlayers];
        this.players[0] = p;
    }

    public int getMaxNumPlayers() {
        return maxNumPlayers;
    }

    public void setMaxNumPlayers(int maxNumPlayers) {
        this.maxNumPlayers = maxNumPlayers;
    }

    public int getCurrentNumPlayers() {
        return currentNumPlayers;
    }

    public void setCurrentNumPlayers(int currentNumPlayers) {
        this.currentNumPlayers = currentNumPlayers;
    }

    public Player[] getPlayers() {
        return players;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Player getSinglePlayer(String username) {
        for (Player p : players) {
            if (p.getUsername().equals(username)) {
                return p;
            }
        }
        return null;
    }

    public void addPlayer(Player p) {
        for (int i = 0; i < maxNumPlayers; i++) {
            if (players[i] == null) {
                players[i] = p;
                currentNumPlayers++;
                break;
            }
        }
    }
}
