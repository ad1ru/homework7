abstract class Hero implements HavingSuperAbility {
    private int hp;
    private int damage;
    private String superAbility;

    public Hero(int hp, int damage, String superAbility) {
        this.hp = hp;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
