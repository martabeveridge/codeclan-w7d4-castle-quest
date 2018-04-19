package Characters;



import Behaviours.ITargetable;
import Behaviours.IWeaponable;

public class Fighter extends Player{

    private IWeaponable weapon;

    public Fighter(String name, int healthPoints, IWeaponable weapon){
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public IWeaponable getWeapon() {
        return weapon;
    }

    public void changeWeapon(IWeaponable newWeapon){
        weapon = newWeapon;
    }

    public void action(ITargetable target){
        target.takeDamage(weapon.wield());
    }

}
