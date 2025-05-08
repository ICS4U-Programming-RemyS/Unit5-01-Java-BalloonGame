import java.awt.Color;

/**.
* This is the Balloon class for the Balloon Game.
*
* @author Remy Skelton
* @version 1.0
* @since 2025-05-01
*/
public class Balloon {
    /** X position variable. */
    private int xPosition;
    /** Y position variable. */
    private int yPosition;
    /** Color variable. */
    private Color balloonColor;
    /** ID variable. */
    private int id;
    /** Popped boolean variable. */
    private boolean isPopped = false;

    /**
     * Constructor of the Balloon class.
     *
     * @param xpos X position
     * @param ypos Y position
     * @param color Color of the balloon
     * @param balloonId ID of the balloon
     */
    public Balloon(final int xpos, final int ypos,
            final Color color, final int balloonId) {
        this.xPosition = xpos;
        this.yPosition = ypos;
        this.balloonColor = color;
        this.id = balloonId;
    }

    /**
     * Get x position.
     *
     * @return x position of the balloon
     */
    public int getXPosition() {
        return this.xPosition;
    }

    /**
     * Get y position.
     *
     * @return y position of the balloon
     */
    public int getYPosition() {
        return this.yPosition;
    }

    /**
     * Get balloon color.
     *
     * @return color of the balloon
     */
    public Color getBalloonColor() {
        return this.balloonColor;
    }

    /**
     * Get ID.
     *
     * @return ID of the balloon
     */
    public int getId() {
        return this.id;
    }

    /**
     * Check if balloon is popped.
     *
     * @return true if balloon is popped, false otherwise
     */
    public boolean getIsPopped() {
        return this.isPopped;
    }

    /**
     * Move balloon method.
     *
     * @param xSpaces number of spaces to move in the x direction
     * @param ySpaces number of spaces to move in the y direction
     */
    public void moveBalloon(final int xSpaces, final int ySpaces) {
        this.xPosition += xSpaces;
        this.yPosition += ySpaces;
    }

    /**
     * Change color method.
     *
     * @param newColor new color of the balloon
     */
    public void changeColor(final Color newColor) {
        this.balloonColor = newColor;
    }

    /**
     * Pop balloon method.
     */
    public void pop() {
        this.isPopped = true;
        System.out.println("Balloon " + this.id + " has popped!");
    }
}
