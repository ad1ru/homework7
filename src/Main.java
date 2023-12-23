public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(100, 20), new Medic(100, 10, 50), new Warrior(150, 30)};

        for (Hero hero : heroes){
            hero.applySuperAbility();
        }

        Medic medic = (Medic) heroes[1];
        System.out.println("Увеличение опыта лечения у Medic: " + medic.getHealing());
    }
}