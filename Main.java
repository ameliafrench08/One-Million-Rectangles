import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        Rectangle firstRectangle = new Rectangle(20, 10, 10, 15);

        int timesLeft = 1000000;
        int numIntersect = 0;

        Random rand = new Random();

        while (timesLeft != 0){
            Rectangle rectangle = new Rectangle(rand.nextInt(41) + 10, rand.nextInt(16) + 5, rand.nextInt(51), rand.nextInt(51));
            rectangles.add(rectangle);
            timesLeft--;
        }

        for (Rectangle rectangle : rectangles) {
            if (rectangle.intersect(firstRectangle)) {
                numIntersect++;
            }
        }


        System.out.println("PERCENTAGE: " + (100 * ((double) numIntersect/1000000)));

    }
}