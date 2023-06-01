package ShapesAgain;

import org.newdawn.slick.Graphics;

public class Circles implements Actor {
    private float x;
    private float y;
    private float speed;
    private int diameter;

    public Circles(float x, float y, float speed, int diameter) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.diameter = diameter;
    }

    @Override
    public void render(Graphics graphics) {graphics.drawOval(this.x,this.y,this.diameter,this.diameter);}

    @Override
    public void update(int delta) {
        if(this.x > 600){
            this.x = 10;
            diameter = 10;
        }
        else{
            diameter ++;
            this.x += (float) delta / this.speed;
        }
    }
}
