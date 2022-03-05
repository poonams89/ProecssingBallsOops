/**
 * This program is to draw 4 moving balls:
 * each at equal distance on the screen vertically:
 * First ball at 1/5, second at 2/5, third at 3/5 and 4th at 4/5 of screen's height
 *
 * The class uses core lib of processing and extends PApplet class
 */

import processing.core.PApplet;

public class ProcessingBalls extends PApplet {
    public static final int SCREEN_HEIGHT = 640;
    public static final int SCREEN_WIDTH = 640;

    int x=0;
    int c = 20;
    int d = 20;
    int noOfBalls = 4;

    /**
     * From PApplet
     * called once
     */
    @Override
    public void settings() {
        super.settings();
        size(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    /**
     * From PApplet
     * called in infinite loop
     */
    @Override
    public void draw() {
        drawBalls();
    }

    /**
     * To draw ball continuously on x-axis
     */
    public  void drawBalls() {
        int y;
        for (int n=0; n<noOfBalls;n++) {
            y = SCREEN_WIDTH*(n+1)/5;
            ellipse(x,y , c, d);
            x++;
        }
    }
}
