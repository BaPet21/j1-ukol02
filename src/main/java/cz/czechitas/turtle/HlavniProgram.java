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

        /*zofka.setLocation(100, 60);
        trojuhelnik(80,Color.RED);
        zofka.setLocation(200, 100);
        nakresliCtverec(70,Color.GREEN);
        zofka.setLocation(300, 100);
        nakresliObdelnik(90, 40,Color.PINK);
        zofka.setLocation(400, 50);
        nakresliKolecko(15,10,Color.YELLOW);*/

        //zmrzlina
        /*zofka.setLocation(180,100);
        nakresliKolecko(15,20,Color.GREEN);

        zofka.setLocation(180,120);

       trojuhelnik(125,Color.YELLOW);*/

        // snehulak
        zofka.setLocation(380,100);
        nakresliKolecko(20,20,Color.PINK);
        zofka.setLocation(280,190);
        nakresliKolecko(15,20,Color.PINK);
        zofka.setLocation(255,358);
        nakresliKolecko(15,30,Color.PINK);

        zofka.setLocation(200,200);
        nakresliKolecko(20,10,Color.PINK);

        zofka.setLocation(420,250);
        nakresliKolecko(20,10,Color.PINK);







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
            zofka.turnLeft(120);
            zofka.move(velikostStrany);
            zofka.turnLeft(120);
        }
        zofka.setPenColor(barvaTuzky);
    }
    private void rovnoramennyTrojuhelnik(double velikostStranyA, double velikostStranyC, Color barvaTuzky){
        //var velikostPrepony = Math.sqrt(2*Math.pow(velikostStrany, 2));
        //Math.pow() umocní první pamater na hodnotu druhého parametru. Math.sqrt() vypočítá druhou odmocninu.
    }

    private void nakresliCtverec(double velikostStrany, Color barvaTuzky) {
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(90);
        }
        zofka.setPenColor(barvaTuzky);
    }

    private void nakresliObdelnik(double velikostStrany1, double velikostStrany2,Color barvaTuzky) {
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStrany1);
            zofka.turnLeft(90);
            zofka.move(velikostStrany2);
            zofka.turnLeft(90);
        }
        zofka.setPenColor(barvaTuzky);

    }

    private void nakresliKolecko(double velikostStrany, double uhel,Color barvaTuzky) {
        for (int i = 0; i < 24; i++) {
            zofka.turnLeft(velikostStrany);
            zofka.move(uhel);
        }
        zofka.setPenColor(barvaTuzky);

    }
}




