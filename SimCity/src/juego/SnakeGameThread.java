
package juego;

public class SnakeGameThread implements Runnable {
	@Override
	public void run() {
		SnakeGame snake = new SnakeGame();
		snake.startGame();
	}
}
