package anonims;

public class Main {
    public static void main(String[] args) {


        //локальный класс
        class Simple {
            int field;

            public Simple(int field){
                this.field =field;
            }
        }

        Simple simple = new Simple(10);

        int gunBulletsCount = 10;
        int pistolBulletsCount = 5;
        //анонимный класс
        AbstractWeapon gun = new AbstractWeapon(gunBulletsCount) {
            @Override
            public void fire() {
                System.out.println("БАБАХ!");
            }
        };

        AbstractWeapon pistol = new AbstractWeapon(pistolBulletsCount) {
            @Override
            public void fire() {
                System.out.println("пиу");

            }
        };


        gun.fire();
        pistol.fire();
        gun.reload(gunBulletsCount);
        pistol.reload(pistolBulletsCount);


        MathOperationUtils mathOperationUtils = new MathOperationUtils() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }

            @Override
            public int div(int a, int b) {
                return a /b;
            }
        };

        System.out.println(mathOperationUtils.div(7,2));
        System.out.println(mathOperationUtils.sum(7,2));
    }
}