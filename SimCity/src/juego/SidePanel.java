package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SidePanel extends JPanel {
	
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = -40557434900946408L;

	/**
	 * The large font to draw with.
	 */
	private static final Font LARGE_FONT = new Font("Tahoma", Font.BOLD, 20);
	
	/**
	 * The medium font to draw with.
	 */
	private static final Font MEDIUM_FONT = new Font("Tahoma", Font.BOLD, 16);

	/**
	 * The small font to draw with.
	 */
	private static final Font SMALL_FONT = new Font("Tahoma", Font.BOLD, 12);
	
	/**
	 * The SnakeGame instance.
	 */
	private SnakeGame game;
	
	public SidePanel(SnakeGame game) {
		this.game = game;
		
		setPreferredSize(new Dimension(300, BoardPanel.ROW_COUNT * BoardPanel.TILE_SIZE));
		setBackground(Color.BLACK);
	}
	
	private static final int STATISTICS_OFFSET = 150;
	
	private static final int CONTROLS_OFFSET = 320;
	
	private static final int MESSAGE_STRIDE = 30;
	
	private static final int SMALL_OFFSET = 30;
	
	private static final int LARGE_OFFSET = 50;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		/*
		 * Set the color to draw the font in to white.
		 */
		g.setColor(Color.WHITE);
		
		/*
		 * Draw the game name onto the window.
		 */
		g.setFont(LARGE_FONT);
		g.drawString("Snake Game", getWidth() / 2 - g.getFontMetrics().stringWidth("Snake Game") / 2, 50);
		
		/*
		 * Draw the categories onto the window.
		 */
		g.setFont(MEDIUM_FONT);
		g.drawString("Estadisticas", SMALL_OFFSET, STATISTICS_OFFSET);
		g.drawString("Controles", SMALL_OFFSET, CONTROLS_OFFSET);
				
		/*
		 * Draw the category content onto the window.
		 */
		g.setFont(SMALL_FONT);
		
		//Draw the content for the statistics category.
		int drawY = STATISTICS_OFFSET;
		g.drawString("Puntuación Total: " + game.getScore(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Frutas Comidas: " + game.getFruitsEaten(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Puntuacion de Frutas: " + game.getNextFruitScore(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		//Draw the content for the controls category.
		drawY = CONTROLS_OFFSET;
		g.drawString("Mover Arriba: W / Tecla Arriba", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Mover Abajo: S / Tecla Abajo", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Mover Izquierda: A / Tecla Izquierda", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Mover Derecha: D / Tecla Derecha", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Pausa: P", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
	}

}
