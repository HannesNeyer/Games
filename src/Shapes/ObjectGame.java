package Shapes;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGame extends BasicGame {
    private List<Rectangle> rectangles;
    private List<Circles> circles;

    public ObjectGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangles = new ArrayList<>();
        this.circles = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<100;i++){
            Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), random.nextInt(50));
            rectangles.add(rectangle);
        }
        for(int i=0; i<100;i++){
            Circles circles = new Circles();
            this.circles.add(circles);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
       for (Rectangle rectangle: this.rectangles){
           rectangle.update(delta);
       }

        for (Circles circles: this.circles){
            circles.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangle rectangle: this.rectangles){
            rectangle.render(graphics);
        }

        for (Circles circles: this.circles){
            circles.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectGame("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
