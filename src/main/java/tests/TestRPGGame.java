public class TestRPGGame {
    public static void main(String[] args) {
        int hp = 100;
        // int hp = testRandom(60,150);
        int fDamage = testRandom(20, 400);
        int shield = testRandom(50, 150);
        int damage = 0;

        int resultDamage = fDamage - shield;
        if (resultDamage > 0) {
            hp -= resultDamage;
            damage = fDamage - shield;
            shield = 0;
        } else {

            shield -= damage;
            damage = 0;
        }
        System.out.printf("Hp:%d FullDamage:%d Shield:%d Damage%d%n", hp, fDamage, shield, damage);


        if (hp <= 0) {
            System.out.println("Paladin Died");
        }else {
            System.out.println("Paladin Win");
        }
    }


    static int testRandom(int from, int to) {


        int result;
        result = (int) (from + Math.random() * (to - from));
        return result;

    }


}
