package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - this.getDamage());
        if (RPG_Game.random.nextBoolean()) {
            boss.setStunnedRounds(1);
            System.out.println("Boss was stunned");
        }
    }
}
//удар по боссу имеет шанс оглушить босса на 1 раунд,
//вследствие чего босс пропускает 1 раунд и не наносит урон героям.