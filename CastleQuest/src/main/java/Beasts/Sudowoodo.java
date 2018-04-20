package Beasts;

public class Sudowoodo extends Creature {

    private String seedColour;

    public Sudowoodo(String name, int healthPoints, int damagePoints, String seedColour){
        super(name, healthPoints, damagePoints);
        this.seedColour = seedColour;
    }

    public String getseedColour() {
        return seedColour;
    }

    public void setseedColour(String newSeedColour){
        seedColour = newSeedColour;
    }

}
