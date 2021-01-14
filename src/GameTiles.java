/**
 * Клас, който отговаря за визуалния аспект на плочките на играта.
 */

import java.awt.*;

public class GameTiles {
    private int row;
    private int col;
    private int tileSize;

    public GameTiles(int row, int col) {
        this.row = row;
        this.col = col;
        this.tileSize = 100;
    }

    /**
     * Метод, който разпределя цветовете на плочките/и самите плочки/
     *
     * @param g
     */
    public void tileColors(Graphics g) {

        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        boolean lightGreySquares = (this.row == 1 || this.row == 3);
        boolean whiteSquares = (this.row == 2 || this.col == 2);
        boolean firstRowRedSquares = this.row == 0 && (this.col == 4 || this.col == 0);
        boolean fourthRowRedSquares = this.row == 4 && (this.col == 1 || this.col == 3);
        boolean fourthRowDarkGraySquares = this.row == 4 && (this.col == 0 || this.col == 4);
        boolean firstRowDarkGraySquares = this.row == 0 && (this.col == 3 || this.col == 1);

        if (lightGreySquares) {
            g.setColor(Color.LIGHT_GRAY);
        }
        if (whiteSquares) {
            g.setColor(Color.WHITE);
        }
        if (firstRowRedSquares || fourthRowRedSquares) {
            g.setColor(Color.RED);
        }
        if (fourthRowDarkGraySquares || firstRowDarkGraySquares) {
            g.setColor(Color.DARK_GRAY);
        }
        g.fillRect(tileX, tileY, this.tileSize, this.tileSize);
    }

    /**
     * Метод, който визуализира кръгчето в средата.
     *
     * @param g
     */
    public void midOval(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.drawOval(225, 225, 50, 50);//border
        g.fillOval(225, 225, 50, 50);

    }
}
