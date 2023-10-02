package homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        List<Player> players = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {

            String[] inputArgs = input.split(";");

            if (inputArgs[0].equals("Team")) {
                Team team = new Team(inputArgs[1]);
                teams.add(team);
            }

            if (inputArgs[0].equals("Add")) {
                String teamName = inputArgs[1];
                String playerName = inputArgs[2];
                int endurance = Integer.parseInt(inputArgs[3]);
                int sprint = Integer.parseInt(inputArgs[4]);
                int dribble = Integer.parseInt(inputArgs[5]);
                int passing = Integer.parseInt(inputArgs[6]);
                int shooting = Integer.parseInt(inputArgs[7]);
                boolean added = false;

                Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                players.add(player);
                for (Team team : teams) {
                    if (team.getName().equals(teamName)) {
                        added = true;
                        team.addPlayer(player);
                    }
                }
                if (!added) {
                    System.out.println("Team " + teamName + " does not exist.\n");
                }
            }

            if (inputArgs[0].equals("Remove")) {
                String teamName1 = inputArgs[1];
                String playerToRemoveName = inputArgs[2];
                Player currPlayer = null;
                for (Player player : players) {
                    if (player.getName().equals(playerToRemoveName)) {
                        currPlayer = player;
                    }
                }
                if (currPlayer == null) {
                    System.out.println("Player " + playerToRemoveName + " is not in " + teamName1 + " team.\n");
                    break;
                }

                for (Team team : teams) {
                    if (team.getName().equals(teamName1)) {
                        team.removePlayer(currPlayer);
                    }
                }
            }

            if (inputArgs[0].equals("Rating")) {
                String teamName2 = inputArgs[1];
                boolean exist = false;
                for (Team team : teams) {
                    if (team.getName().equals(teamName2)) {
                        team.setRatting();
                        System.out.println(team.getName() + " - " + team.getRatting());
                        exist = true;
                    }
                }
                if (!exist) {
                    System.out.println("Team " + teamName2 + " does not exist.\n");
                }
            }

            input = scanner.nextLine();
        }
    }
}

