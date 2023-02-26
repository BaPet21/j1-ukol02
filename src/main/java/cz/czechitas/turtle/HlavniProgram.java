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

        //lokomotiva
        zofka.setLocation(800,400);
        zofka.setPenColor(Color.darkGray);
        nakresliObdelnik(200,120,Color.DARK_GRAY);
        zofka.turnLeft(90);
        nakresliObdelnik(200,120,Color.DARK_GRAY);
        zofka.turnLeft(90);
        nakresliKolecko(15,16,Color.DARK_GRAY);

        zofka.turnRight(90);
        zofka.move(50);
        nakresliKolecko(20,10,Color.DARK_GRAY);

        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(55);
        zofka.move(40);
        zofka.penDown();
        nakresliKolecko(20,10,Color.DARK_GRAY);

        zofka.setLocation(596,325);
        zofka.turnRight(25);
        rovnoramennyTrojuhelnik(100,Color.DARK_GRAY);

        // zmrzlina
        zofka.setLocation(165,135);
        nakresliKolecko(18,20,Color.GREEN);
        zofka.setLocation(170,120);

        zofka.turnLeft(62);
        nakresliTrojuhelnik();





    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }


    private void nakresliTrojuhelnik() {
            zofka.move(120);
            zofka.turnLeft(120);
            zofka.move(120);
            zofka.turnLeft(120);
            zofka.move(120);

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
    private void rovnoramennyTrojuhelnik(double velikostStrany, Color barvaTuzky){
        var velikostPrepony = Math.sqrt(2*Math.pow(velikostStrany, 2));
        zofka.move(velikostStrany);
        zofka.turnRight(90);
        zofka.move(velikostStrany);
        zofka.turnRight(135);
        zofka.move(velikostPrepony);


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
            zofka.turnRight(90);
            zofka.move(velikostStrany2);
            zofka.turnRight(90);
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




