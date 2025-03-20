import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class gameUI {
    public gameUI() {
        // frame
        JFrame frame = new JFrame("Chessboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setLayout(new BorderLayout());

        // option menu on top
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new FlowLayout());
        optionsPanel.add(new JButton("New Game"));
        optionsPanel.add(new JButton("Undo"));
        optionsPanel.add(new JButton("Resign"));

        // making chessboard
        JPanel chessboard = new JPanel(new GridLayout(8, 8));

        // chess squares
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel square = new JPanel();
                if ((row + col) % 2 == 0) {
                    square.setBackground(Color.WHITE);
                } else {
                    square.setBackground(Color.BLACK);
                }
                chessboard.add(square);
            }
        }


        frame.add(optionsPanel, BorderLayout.NORTH);
        frame.add(chessboard, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}