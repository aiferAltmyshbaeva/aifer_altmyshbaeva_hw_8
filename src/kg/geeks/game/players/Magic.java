package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && !(heroes[i] instanceof Witcher)) {//противоречие между 3 и 7 пунктами ДЗ_8
                heroes[i].setDamage(heroes[i].getDamage() + RPG_Game.random.nextInt(100));
               // System.out.println("Magic applied Boost for " + heroes[i].getName());
            }
        }
        System.out.println("Magic applied Boost");
    }
}
