package Beasts;

public class Mollusc extends Creature {

    private String objectInside;

    public Mollusc(String name, int healthPoints, int damagePoints, String objectInside){
        super(name, healthPoints, damagePoints);
        this.objectInside = objectInside;
    }

    public String getObjectInside() {
        return objectInside;
    }

    public void setObjectInside(String newObject){
        objectInside = newObject;
    }


}
