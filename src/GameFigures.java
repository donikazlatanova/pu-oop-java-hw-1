/**
 * Клас, който отговаря за външния вид на фигурите и позицията им.
 */

import java.awt.*;

public class GameFigures {
    /**
     * Метод, отговарящ за зелената рамка на жълтите жаби.
     * @param g
     */
    public void yellowFrogsBorder(Graphics g) {
        g.setColor(Color.GREEN);

        g.drawOval(25, 25, 50, 50);
        g.fillOval(25, 25, 50, 50);

        g.drawOval(125, 25, 50, 50);
        g.fillOval(125, 25, 50, 50);

        g.drawOval(225, 25, 50, 50);
        g.fillOval(225, 25, 50, 50);

        g.drawOval(325, 25, 50, 50);
        g.fillOval(325, 25, 50, 50);

    }

    /**
     * Метод, отговарящ за жълтата рамка на зелените жаби.
     * @param g
     */
    public void greenFrogsBorder(Graphics g) {
        g.setColor(Color.YELLOW);

        g.drawOval(125, 425, 50, 50);
        g.fillOval(125, 425, 50, 50);

        g.drawOval(225, 425, 50, 50);
        g.fillOval(225, 425, 50, 50);

        g.drawOval(325, 425, 50, 50);
        g.fillOval(325, 425, 50, 50);

        g.drawOval(425, 425, 50, 50);
        g.fillOval(425, 425, 50, 50);
    }
    /**
     * Метод, отговарящ за вида и позицията на зелените жаби.
     * @param g
     */
    public void greenFrogs(Graphics g) {
        g.setColor(Color.GREEN);

        g.drawRect(25, 425, 50, 50);
        g.fillRect(25, 425, 50, 50);

        g.drawOval(130, 430, 40, 40);
        g.fillOval(130, 430, 40, 40);

        g.drawOval(230, 430, 40, 40);
        g.fillOval(230, 430, 40, 40);

        g.drawOval(330, 430, 40, 40);
        g.fillOval(330, 430, 40, 40);

        g.drawOval(430, 430, 40, 40);
        g.fillOval(430, 430, 40, 40);
    }

    /**
     * Метод, отговарящ за вида и позицията на жълтите жаби.
     * @param g
     */
    public void yellowFrogs(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawRect(425, 25, 50, 50);
        g.fillRect(425, 25, 50, 50);

        g.drawOval(30, 30, 40, 40);
        g.fillOval(30, 30, 40, 40);

        g.drawOval(130, 30, 40, 40);
        g.fillOval(130, 30, 40, 40);

        g.drawOval(230, 30, 40, 40);
        g.fillOval(230, 30, 40, 40);

        g.drawOval(330, 30, 40, 40);
        g.fillOval(330, 30, 40, 40);
    }
}