package structural.flyweight.derekB;

// The Flyweight design pattern is used when you need to
// create a large number of similar objects

// To reduce memory this pattern shares Objects that are
// the same rather than creating new ones

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import creational.prototype.Graphic;

public class FlyWeightTest extends JFrame {

    private static final long serialVersionUID = 1L;

    JButton startDrawing;

    int windowWidth = 1750;
    int windowHeight = 1000;

    // A new rectangle is created only if a new color is needed
    // extrinsic
    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
            Color.blue, Color.pink, Color.cyan, Color.magenta,
            Color.black, Color.gray};

    public static void main(String[] args) {

        new FlyWeightTest();

    }

    public FlyWeightTest() {

        // Create the frame, position it and handle closing it

        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();

        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Button 1");

        contentPane.add(drawingPanel, BorderLayout.CENTER);

        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                Graphics g = drawingPanel.getGraphics();
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 5; ++i) {
                    // Uses rectangles stored in the HashMap to
                    // speed up the program
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(),
                            getRandX(), getRandY());

//                    slowWay2(g);
//                    slowWay(g);
                }
                long endTime = System.currentTimeMillis();
                System.out.println("That took " + (endTime - startTime) + " milliseconds");
            }
        });

        this.add(contentPane);

        this.setVisible(true);

    }

    /**
     * Creating N MyRect objects
     */
    private void slowWay2(final Graphics g) {
//    MyRect rect = new MyRect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
//    rect.draw(g);
    }

    /**
     * doing the following will create one rect everytime for the total num of rect requested
     *
     * @param g Graphics
     */
    private void slowWay(final Graphics g) {
        g.setColor(getRandColor());
        g.fillOval(getRandX(), getRandY(), getRandX(), getRandY());
    }
    // Picks random x & y coordinates

    private int getRandX() {
        return (int) (Math.random() * windowWidth);
    }

    private int getRandY() {
        return (int) (Math.random() * windowHeight);
    }

    // Picks a random Color from the 9 available

    private Color getRandColor() {
        Random randomGenerator = new Random();

        int randInt = randomGenerator.nextInt(9);

        return shapeColor[randInt];

    }

}