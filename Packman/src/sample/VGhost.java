package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class VGhost extends Ghosts{
    Ellipse build(int xg, int yg) {
        Ellipse ellipse = new Ellipse(xg,yg,20,30);
        ellipse.setFill(Color.GREEN);
        return ellipse;
    }
}
