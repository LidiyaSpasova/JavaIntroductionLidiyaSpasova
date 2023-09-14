package oop;

public class Breed {
    private String breedName;
    private String characteristics;
    private String possibleIllness;

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        if (!breedName.isEmpty()){
        this.breedName = breedName;
    }else {
            System.out.println("Error: Invalid breed name!");
        }
        }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        if (!characteristics.isEmpty()){
        this.characteristics = characteristics;
    }else {
            System.out.println("Error: Invalid breed name!");
        }
    }

    public String getPossibleIllness() {
        return possibleIllness;
    }

    public void setPossibleIllness(String possibleIllness) {
        if(!possibleIllness.isEmpty()){
        this.possibleIllness = possibleIllness;
    }else {
            System.out.println("Error: Invalid breed name!");
        }
    }
    //constructor
    public Breed(String name, String chars, String illness){
        setBreedName(name);
        setCharacteristics(chars);
        setPossibleIllness(illness);
    }
}
