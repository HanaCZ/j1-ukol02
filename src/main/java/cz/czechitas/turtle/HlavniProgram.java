package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(90);

        nakresliCtverec(50);

        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnLeft(90);

        nakresliObdelnik(50, 100);

        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnLeft(90);
        
        nakresliKolecko(5);

        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);

        zofka.turnRight(30);
        
        nakresliRovnostrannyTroj(50);

        zofka.turnLeft(30);
    }

    private void nakresliRovnostrannyTroj(int delkaStrTroj) {
        zofka.penDown();
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrTroj);
            zofka.turnRight(120);
        }
        zofka.penUp();
    }

    private void nakresliKolecko(int delkaStrKolecka) {
        zofka.penDown();
        for (int i = 0; i < 48; i++) {
            zofka.move(delkaStrKolecka);
            zofka.turnRight(7.5);
        }
        zofka.penUp();
    }

    private void nakresliObdelnik(int delkaStrA, int delkaStrB) {
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStrA);
            zofka.turnRight(90);
            zofka.move(delkaStrB);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    private void nakresliCtverec(int delkaStrCtverce) {
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrCtverce);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

}
