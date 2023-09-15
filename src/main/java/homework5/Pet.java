/*Имплементирайте клас Parrot по подобие на клас Dog, който extend-ва клас Pet:
  1. Какви instance променливи биха били подходящи (и за двата класа)?
  2. Създайте get & set методи за всяка от тях (с подходящи валидации).
  3. Помислете какви действия биха били възможни с тях и имплементирайте логика за тях
  4. Направете конструктор с параметри
 */

package homework5;

public class Pet {
    private String breed;
    private String families;
    private String name;
    private byte passportNumber;
    private String Address;
    private String sex;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.isEmpty()) {
            this.breed = breed;
        } else {
            System.out.println("Invalid entry for breed");
        }
    }

    public String getFamilies() {
        return families;
    }

    public void setFamilies(String families) {
        if (!families.isEmpty()) {
            this.families = families;
        } else {
            System.out.println("Invalid entry for families");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid entry for name");
        }
    }

    public byte getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(byte passportNumber) {
        if (passportNumber > 0) {
            this.passportNumber = passportNumber;
        } else {
            System.out.println("Invalid entry for passport number");
        }
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        if (!address.isEmpty()) {
            Address = address;
        } else {
            System.out.println("Invalid entry for address");
        }
    }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex){
            if (!sex.isEmpty()) {
                this.sex = sex;
            } else {
                System.out.println("Invalid entry for sex");
            }
        }


    public Pet(String breed) {
        setBreed(breed);
    }

        public void eat() {
            System.out.println(this.name + " is eating");
        }


        public void getSick() {
            System.out.println(this.name + " is getting sick");
        }


        public void goingToTheVet() {
            System.out.println(this.name + " is going to the Vet");
        }

        public void fly(){
            System.out.println(this.name +  "can fly");
        }
        public void canSpeak(){
            System.out.println(this.name + " can not speak" );
        }
    }








