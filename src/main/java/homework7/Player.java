/*              Homework - Football Team Management
A football team has variable number of players, a name and a rating.
A player has a name and stats which are the basis for his skill level. The stats a player has are endurance, sprint, dribble, passing and shooting. Each stat can be in the range [0..100]. The overall skill level of a player is calculated as the average of his stats. Only the name of a player and his stats should be visible to all of the outside world. Everything else should be hidden.
A team should expose (term for giving an access where access would not otherwise be available) a name, a rating (calculated by the average skill level of all players in the team) and methods for adding and removing players.

Model the team and the players following the proper principles of Encapsulation. Expose only the properties that needs to be visible and validate data appropriately.

Data Validation

1. A name cannot be null, empty or white space. If not, print "A name should not be empty. "
2. Stats should be in the range 0..100. If not, print "[Stat name] should be between 0 and 100. "
3. If you receive a command to remove a missing player, print "Player [Player name] is not in [Team name] team. "
4. If you receive a command to add a player to a missing team, print "Team [team name] does not exist."
5. If you receive a command to show stats for a missing team, print "Team [team name] does not exist."

Method Calls Params                                     Expected Output
Team;Barcelona                                          Barcelona – 81
Add;Barcelona;Lionel_Messi;75;85;84;92;67
Add;Barcelona;Gerard_Pique;95;82;82;89;68
Remove;Barcelona;Gerard_Pique
Rating;Barcelona
END
_________________________________________________________________________________
Team;Barcelona                                              Endurance should be between 0 and 100.
Add;Barcelona;Lionel_Messi;75;85;84;92;67
Add;Barcelona;Gerard_Pique;195;82;82;89;68                  Player Gerard_Pique is not in Barcelona team.
Remove;Barcelona;Gerard_Pique
Rating;Barcelona                                            Barcelona - 81
END
___________________________________________________________________________________
Team;Barcelona                                               Barcelona – 0
Rating;Barcelona
END
 */

package homework7;

public class Player {
        private String name;
        private int endurance;
        private int sprint;
        private int dribble;
        private int passing ;
        private int shooting;

        public Player(String name, Integer endurance, Integer sprint, Integer dribble, Integer passing, Integer shooting){
            setName(name);
            setEndurance(endurance);
            setSprint(sprint);
            setDribble(dribble);
            setPassing(passing);
            setShooting(shooting);
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            if (!name.isEmpty() || name != null || name != " " ) {
                this.name = name;
            } else {
                System.out.print("A name should not be empty.");
            }
        }

        private void setEndurance(int endurance){
                if (endurance < 0 || endurance > 100) {
                    System.out.print("Endurance should be between 0 and 100.");
                } else {
                    this.endurance = endurance;
                }
            }

        private void setSprint(int sprint) {
            if (sprint < 0 || sprint > 100) {
                System.out.print("Sprint should be between 0 and 100.");
            } else {
                this.sprint = sprint;              }
        }

        private  void setDribble(int dribble) {
            if (dribble < 0 || dribble > 100) {
                System.out.printf("Dribble should be between 0 and 100.");
            } else {
                this.dribble = dribble;
            }
        }

        private void setPassing(int passing) {
            if (passing < 0 || passing > 100) {
                System.out.println("Passing should be between 0 and 100.");
            } else {
                this.passing = passing;
            }
        }

        private void setShooting(int shooting) {
            if (shooting < 0 || shooting > 100) {
                System.out.println("Shooting should be between 0 and 100.");
            } else {
                this.shooting = shooting;
            }
        }


        public int getOverallSkill(){
            return (int)Math.round((this.endurance+this.sprint+this.dribble+this.passing+this.shooting)/5.0);
        }
    }

