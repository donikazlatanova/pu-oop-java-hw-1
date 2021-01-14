/**
 * Клас, отговарящ за визуализацията на игровата дъска и нейните характеристики.
 */

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {
    public GameBoard() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle("GameBoard");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * Метод, визуализиращ фигурите и плочките в дъска 5х5.
     * @param g
     */
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for(int row = 0; row < 5; row++) {
            for(int col = 0; col < 5; col++) {
                GameTiles tile = new GameTiles(row, col);
                tile.tileColors(g);
                tile.midOval(g);
                GameFigures figure = new GameFigures();
                figure.yellowFrogsBorder(g);
                figure.greenFrogsBorder(g);
                figure.greenFrogs(g);
                figure.yellowFrogs(g);
            }
        }
    }
}