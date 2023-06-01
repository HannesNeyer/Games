package ShapesAgain;

import org.newdawn.slick.Graphics;

public class Ellipsen implements Actor
{
    private float x,y;
    private float speed;

    public Ellipsen(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void render(Graphics graphics) {graphics.drawOval(this.x,this.y,20,10);}

    @Override
    public void update(int delta) {
        if(this.x < 600 || this.y < 600){
            this.y += (float) delta / this.speed;
            this.x += (float) delta / this.speed;
        }
        else{
            this.x = 100;
            this.y = 100;
        }
    }
}
