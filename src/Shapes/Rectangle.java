package Shapes;

import org.newdawn.slick.Graphics;
public class Rectangle implements Actor{
    private float x;
    private float y;
    private float speed;
    private enum Direction{Right,Down,Left,Up};

    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x,this.y,10,5);
    }
    public void update(int delta){
        this.x += (float)delta/this.speed;
        if(this.x >= 600){
            this.x = 0;
        }
    }
}
