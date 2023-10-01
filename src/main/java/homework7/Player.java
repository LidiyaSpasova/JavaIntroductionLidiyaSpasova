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

