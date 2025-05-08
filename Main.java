import java.awt.Color;

/**.
* This is the main class for the Balloon Game
*
* @version 1.0
* @since 2025-05-1
*/
public final class Main {

    /**.
     * Private constructor to prevent instantiation
     */
    private Main() {
        // Prevent instantiation
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        // Create balloonA and balloonB
        Balloon balloonA = new Balloon(55, 41, Color.BLUE, 1);
        Balloon balloonB = new Balloon(25, 85, Color.PINK, 2);

        // Create a spike
        Spike spike = new Spike(0);

        // Print positions and colors before changing
        System.out.println("Balloon A is at ("
                + balloonA.getXPosition() + ", "
                + balloonA.getYPosition() + ") and is "
                + balloonA.getBalloonColor());
        System.out.println("Balloon B is at ("
                + balloonB.getXPosition() + ", "
                + balloonB.getYPosition() + ") and is "
                + balloonB.getBalloonColor());
        System.out.println("Spike is at x = "
                + spike.getXPosition());
        System.out.println();

        // Move balloons
        balloonA.moveBalloon(34, 12);
        balloonB.moveBalloon(43, 14);

        // Print positions after moving balloons
        System.out.println("Balloon A is at ("
                + balloonA.getXPosition() + ", "
                + balloonA.getYPosition() + ") and is "
                + balloonA.getBalloonColor());
        System.out.println("Balloon B is at ("
                + balloonB.getXPosition() + ", "
                + balloonB.getYPosition() + ") and is "
                + balloonB.getBalloonColor());
        System.out.println("Spike is at x = "
                + spike.getXPosition());
        System.out.println();

        // Move spike to balloonA's x position
        spike.moveSpikeHorizontally(89);

        // Print positions after moving spike
        System.out.println("After moving spike to Balloon A:");
        System.out.println("Spike is at x = "
                + spike.getXPosition());
        System.out.println();

        // Move balloonA vertically to ground
        balloonA.moveBalloon(0, -53);

        // Print final positions
        System.out.println("Balloon A is at ("
                + balloonA.getXPosition() + ", "
                + balloonA.getYPosition() + ") and is "
                + balloonA.getBalloonColor());
        System.out.println("Spike is at x = "
                + spike.getXPosition());
        System.out.println();

        // Check if balloonA pops
        spike.popBalloon(balloonA);
        spike.popBalloon(balloonB);
    }
}
