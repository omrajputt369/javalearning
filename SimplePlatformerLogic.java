/**
 * Simulates basic platformer physics (gravity, jumping, and floor collision).
 */
public class SimplePlatformerLogic {
    private double x, y;
    private double velocityY;
    private final double GRAVITY = -0.5;
    private final double JUMP_FORCE = 10.0;
    private final double FLOOR_Y = 0.0;
    private boolean isGrounded;

    public SimplePlatformerLogic() {
        this.x = 0;
        this.y = FLOOR_Y;
        this.velocityY = 0;
        this.isGrounded = true;
    }

    public void jump() {
        if (isGrounded) {
            System.out.println("Jumping!");
            velocityY = JUMP_FORCE;
            isGrounded = false;
        }
    }

    public void update() {
        if (!isGrounded) {
            y += velocityY;
            velocityY += GRAVITY;

            if (y <= FLOOR_Y) {
                y = FLOOR_Y;
                velocityY = 0;
                isGrounded = true;
                System.out.println("Landed on the floor.");
            }
        }
    }

    public void status() {
        System.out.printf("Position: (%.2f, %.2f) | VelocityY: %.2f | Groudned: %b\n", x, y, velocityY, isGrounded);
    }

    public static void main(String[] args) {
        SimplePlatformerLogic player = new SimplePlatformerLogic();
        System.out.println("--- Simple Platformer Physics Simulation ---");

        player.status();
        player.jump();

        // Simulate frames
        for (int i = 0; i < 25; i++) {
            player.update();
            if (i % 5 == 0 || player.isGrounded) {
                player.status();
            }
            if (player.isGrounded && i > 0)
                break;
        }
    }
}
