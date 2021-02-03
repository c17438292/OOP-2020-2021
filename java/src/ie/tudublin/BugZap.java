package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {

    float x;
    float y;
    float playerWidth;

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        x = height / 2;
        y = width - 100;
        playerWidth = 50;
    }

    public void draw() {
        background(197, 252, 0);
        drawPlayer((x - 50), y, (x - 25), y);
        drawPlayer(x - 25, y, x - 25, y - 25);
        drawPlayer(x - 25, y - 25, x + 25, y - 25);
        drawPlayer(x + 25, y - 25, x + 25, y);
        drawPlayer(x + 25, y, x + 50, y);
    }

    public void drawPlayer(float x, float y, float w, float h) {
        // rectMode(CENTER);
        // rect(x, y, w + 10, w);
        line(x, y, w, h);
    }

    public void keyPressed() {
        if (keyCode == LEFT) {
            x -= 5;
        }
        if (keyCode == RIGHT) {
            x += 5;
        }
        if (key == ' ') {
            System.out.println("SPACE key pressed");
        }
    }
}
