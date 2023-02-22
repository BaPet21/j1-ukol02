package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
       /* nakresliTrojuhelnik();
        ctverec();
        zofka.setLocation(120,200);
        obdelnik();
        zofka.setLocation(220,200);
        kolecko();*/

        zofka.setLocation(100, 60);
        trojuhelnik(80,Color.RED);
        zofka.setLocation(200, 100);
        nakresliCtverec(70,Color.GREEN);
        zofka.setLocation(300, 100);
        nakresliObdelnik(90, 40,Color.PINK);
        zofka.setLocation(400, 50);
        nakresliKolecko(15,10,Color.YELLOW);


    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }


    private void nakresliTrojuhelnik() {
        for (int i = 0; i < 3; i++) {
            zofka.turnRight(60);
            zofka.move(100);
            zofka.turnRight(60);
        }
    }

    private void ctverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(60);
            zofka.turnRight(90);
        }
    }

    private void obdelnik() {
        for (int i = 0; i < 2; i++) {
            zofka.move(60);
            zofka.turnLeft(90);
            zofka.move(80);
            zofka.turnLeft(90);
        }
    }

    private void kolecko() {
        for (int i = 0; i < 24; i++) {
            zofka.turnRight(15);
            zofka.move(10);
        }
    }

    private void trojuhelnik(double velikostStrany,Color barvaTuzky) {
        for (int i = 0; i < 3; i++) {
            zofka.turnLeft(60);
            zofka.move(velikostStrany);
            zofka.turnLeft(60);
        }
        zofka.setPenColor(barvaTuzky);
    }

    private void nakresliCtverec(double velikostStrany, Color barvaTuzky) {
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(90);
        }
        zofka.setPenColor(barvaTuzky);
    }

    private void nakresliObdelnik(int velikostStrany1, int velikostStrany2,Color barvaTuzky) {
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStrany1);
            zofka.turnLeft(90);
            zofka.move(velikostStrany2);
            zofka.turnLeft(90);
        }
        zofka.setPenColor(barvaTuzky);

    }

    private void nakresliKolecko(int velikostStrany, int uhel,Color barvaTuzky) {
        for (int i = 0; i < 24; i++) {
            zofka.turnLeft(velikostStrany);
            zofka.move(uhel);
        }
        zofka.setPenColor(barvaTuzky);

    }
}




