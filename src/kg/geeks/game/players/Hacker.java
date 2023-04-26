package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

import java.util.Random;

public class Hacker extends Hero {
    private int round = 1;
    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HACK_SYSTEM);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (round++ % 2 == 0) {
            int takenHealth = RPG_Game.random.nextInt(0, boss.getHealth());
            boss.setHealth(takenHealth);
            do {
                int index = RPG_Game.random.nextInt(heroes.length);
                if (heroes[index].getHealth() > 0 && !(heroes[index] instanceof Hacker)) {
                    heroes[index].setHealth(takenHealth);
                    System.out.println("Hacker took " + takenHealth + " and gave to " + heroes[index].getName() );
                    break;
                }
            } while (true);
        }
    }
}
