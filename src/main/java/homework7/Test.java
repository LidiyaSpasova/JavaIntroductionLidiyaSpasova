package homework7;

public class Test {
    public static void main(String[] args) {

        Team barcelona = new Team("Barcelona");
        Player Lionel_Messi = new Player("Lionel_Messi", 75, 85, 84, 92, 67);
        Player Gerard_Pique = new Player("Gerard_Pique", 95, 82, 82, 89, 68);
        barcelona.addPlayer(Lionel_Messi);
        barcelona.addPlayer(Gerard_Pique);
        barcelona.removePlayer(Gerard_Pique);

        System.out.println(barcelona.getName() + " - " + Lionel_Messi.getOverallSkill());

    }
}

