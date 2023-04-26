package kg.geeks.game.players;

import static kg.geeks.game.players.SuperAbility.REVIVE;

public class Witcher extends Hero {

    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.REVIVE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] != this && heroes[i].getHealth() <= 0) { //&& RPG_Game.random.nextBoolean()
                heroes[i].setHealth(this.getHealth());
                this.setHealth(0);
                System.out.println("Witcher saved one life");
                break;
            }
        }
    }
}
