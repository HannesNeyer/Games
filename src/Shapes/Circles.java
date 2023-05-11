package Shapes;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circles {
    private float x;
    private float y;
    private float speed;
    private int diameter;

    public Circles() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(800);
        this.speed = random.nextInt(15) + 5;
        this.diameter = random.nextInt(10) + 3;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }

    public void update(int delta) {
        this.y += (float) delta / this.speed;
        if (this.y >= 600) {
            this.y = 0;
        }
    }
}
