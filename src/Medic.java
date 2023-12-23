class Medic extends Hero {
    private int healPoints;

    public Medic(int hp, int damage, int healPoints) {
        super(hp, damage, "HEALING");
        this.healPoints = healPoints;
    }

    public int getHealing() {
        return healPoints;
    }

    public void increaseExperience() {
        healPoints += (int) (healPoints * 0.1);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность: " + getSuperAbility());
        increaseExperience();
    }
}
