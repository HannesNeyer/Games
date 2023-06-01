package ShapesAgain;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Rectangle implements Actor{
    private float x,y;
    private float speed;
    private String direction;

    public Rectangle(float x, float y, float speed, String direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    @Override
    public void render(Graphics graphics) {graphics.drawRect(this.x,this.y,20,10);}

    @Override
    public void update(int delta) {
        if(direction == "right"){
            this.x += (float) delta / this.speed;
        }
        else{
            this.x -= (float) delta / this.speed;
        }
    }
}
