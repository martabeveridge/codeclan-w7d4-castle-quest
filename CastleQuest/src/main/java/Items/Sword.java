package Items;

import Behaviours.IWeaponable;

public class Sword implements IWeaponable {


    private int damagePoints;
    private String sound;
    private int bladeLength;

    public Sword(int damagePoints, String sound, int bladeLength){
        this.damagePoints = damagePoints;
        this.sound = sound;
        this.bladeLength = bladeLength;
    }

    @Override
    public int wield() {
        return damagePoints;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public String getSound() {
        return sound;
    }

}
