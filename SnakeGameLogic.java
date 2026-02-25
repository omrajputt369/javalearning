import java.util.LinkedList;

/**
 * Simulates the core logic of a Snake game (movement, growth, collision).
 */
public class SnakeGameLogic {
    private static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Point))
                return false;
            Point p = (Point) o;
            return x == p.x && y == p.y;
        }
    }

    private LinkedList<Point> snake;
    private Point food;
    private int width, height;
    private int score;

    public SnakeGameLogic(int width, int height) {
        this.width = width;
        this.height = height;
        this.snake = new LinkedList<>();
        this.snake.add(new Point(width / 2, height / 2));
        this.score = 0;
        this.food = new Point(5, 5); // Mock food position
    }

    public boolean move(int dx, int dy) {
        Point head = snake.getFirst();
        Point newHead = new Point(head.x + dx, head.y + dy);

        // Check wall collision
        if (newHead.x < 0 || newHead.x >= width || newHead.y < 0 || newHead.y >= height) {
            System.out.println("Crashed into a wall! Score: " + score);
            return false;
        }

        // Check self collision
        if (snake.contains(newHead)) {
            System.out.println("Crashed into yourself! Score: " + score);
            return false;
        }

        snake.addFirst(newHead);

        // Check food collision
        if (newHead.equals(food)) {
            score += 10;
            System.out.println("Ate food! New Score: " + score);
            // In a real game, you would spawn new food here
            food = new Point(-1, -1); // Food consumed
        } else {
            snake.removeLast();
        }

        return true;
    }

    public void displayState() {
        System.out.println(
                "Snake Head: (" + snake.getFirst().x + ", " + snake.getFirst().y + ") | Length: " + snake.size());
    }

    public static void main(String[] args) {
        SnakeGameLogic game = new SnakeGameLogic(20, 20);
        System.out.println("--- Snake Game Simulation ---");
        game.displayState();

        game.move(1, 0); // Right
        game.move(0, 1); // Down
        game.displayState();

        System.out.println("Simulating growth...");
        game.food = new Point(11, 11);
        for (int i = 0; i < 3; i++)
            game.move(0, 1);
        game.displayState();
    }
}
