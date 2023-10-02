package homework7;

import java.util.LinkedList;

public class Team {

    private String name;
    private LinkedList<Player> players;
    private int ratting;


    public Team(String name) {
        setName(name);
        this.players = new LinkedList<>();
        this.ratting = 0;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name != null || !name.trim().isEmpty()) {
            this.name = name;

        } else {
            this.name = "no name";
            System.out.print("A name should not be empty.");
        }
    }

    public void addPlayer(Player player) {
        if (!players.contains(player)) {
            this.players.add(player);
            setRatting();
        } else {
            System.out.print("Player " + player.getName() + " is already in " + this.name + " team.\n");
        }
    }

    public void removePlayer(Player player) {
        if (players.contains(player)) {
            this.players.remove(player);
            setRatting();
        } else {
            System.out.print("Player " + player.getName() + " is not in " + this.name + " team.\n");
        }
    }


    public void setRatting() {
        Integer currRating = 0;
        for (Player player : this.players) {
            currRating += player.getOverallSkill();
        }
        if (currRating == 0) {
            this.ratting = currRating;
        } else {
            currRating = (int) Math.round(currRating / players.size());
            this.ratting = currRating;
        }
    }

    public int getRatting() {
        return this.ratting;
    }


}

