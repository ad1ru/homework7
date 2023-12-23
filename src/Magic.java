class Magic extends Hero {
    public Magic(int hp, int damage) {
        super(hp, damage, "MAGIC POWER");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность: " + getSuperAbility());
    }
}
