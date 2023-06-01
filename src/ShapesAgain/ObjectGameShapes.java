package ShapesAgain;

import org.newdawn.slick.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGameShapes extends BasicGame
{
    private List<Actor> actors;

    public ObjectGameShapes(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<10;i++) {
            ShapesAgain.Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), random.nextInt(50),"right");
            actors.add(rectangle);
        }

        for(int i=0; i<10;i++){
            ShapesAgain.Circles circles = new Circles(10, 10, 5, 10);
            this.actors.add(circles);
        }

        for(int i=0; i<10;i++){
            ShapesAgain.Ellipsen ellipse = new Ellipsen(random.nextInt(600), random.nextInt(600),10);
            this.actors.add(ellipse);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor: this.actors){
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.actors){
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ShapesAgain.ObjectGameShapes("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
