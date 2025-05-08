/**.
* This is the spike class for the Balloon Game.
*
* @version 1.0
* @since 2025-05-01
*/
public class Spike {
    /** X position variable. */
    private int xPosition;

    /** Y position constant. */
    public static final int Y_POSITION = 0;

    /**
     * Constructor of the Spike class.
     *
     * @param xpos X position
     */
    public Spike(final int xpos) {
        this.xPosition = xpos;
    }

    /**
     * Move spike method.
     *
     * @param xSpaces number of spaces to move horizontally
     */
    public void moveSpikeHorizontally(final int xSpaces) {
        this.xPosition += xSpaces;
    }

    /**
     * Get x position.
     *
     * @return x position of the spike
     */
    public int getXPosition() {
        return this.xPosition;
    }

    /**
     * Pop balloon method.
     *
     * @param balloon balloon to check for popping
     */
    public void popBalloon(final Balloon balloon) {
        if (balloon.getXPosition() == this.xPosition
            && balloon.getYPosition() == Y_POSITION
            && !balloon.getIsPopped()) {
            balloon.pop();
        } else {
            System.out.println("Balloon " + balloon.getId() + " is safe!");
        }
    }
}
