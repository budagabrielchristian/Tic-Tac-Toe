import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe implements ActionListener {
   JFrame frame = new JFrame();
   JButton buttons[] = new JButton[9];
   Font buttonFont = new Font("Georgia", Font.PLAIN, 35);
   int checkTurn = 0;
   int clickedButtons = 0;

   TicTacToe() {
      frame = new JFrame();
      frame.setSize(new Dimension(420, 420));
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new GridLayout(3, 3));
      initializeButtons();
      frame.setTitle("Tic Tac Toe");
      frame.setVisible(true);
   }

  public void initializeButtons() {
      for (int i = 0; i <= 8; i++) {
         buttons[i] = new JButton();
         buttons[i].setText("");
         buttons[i].addActionListener(this);
         buttons[i].setFont(buttonFont);
         buttons[i].setBackground(Color.white);
         buttons[i].setForeground(Color.black);
         frame.add(buttons[i]);
      }
   }
   @Override public void actionPerformed(ActionEvent e) {
      JButton buttonClicked = (JButton)e.getSource();
      for (JButton testA : buttons) {
         if (e.getSource() == testA) {
            clickedButtons++;
         }
      }
      if (checkTurn % 2 == 0) {
         buttonClicked.setText("O");
      } else {
         buttonClicked.setText("X");
      }

      checkStateVoid();

      checkTurn++;
      buttonClicked.setEnabled(false);
   }
  public void checkStateVoid() {
      int playerOneWins = -1, playerTwoWins = -1, draw = -1;

      if (buttons[0].getText() == buttons[1].getText() &&
          buttons[1].getText() == buttons[2].getText() &&
          !buttons[1].getText().isBlank()) {
         if (buttons[0].getText().equals("X")) {
            playerTwoWins = JOptionPane.showConfirmDialog(
                frame, "Player Two wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         } else {
            playerOneWins = JOptionPane.showConfirmDialog(
                frame, "Player One wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         }
         if (playerTwoWins == JOptionPane.OK_OPTION ||
             playerOneWins == JOptionPane.OK_OPTION || draw == JOptionPane.OK_OPTION) {
            TicTacToe newGame = new TicTacToe();
            frame.dispose();
         }
         return;
      } else if (buttons[3].getText() == buttons[4].getText() &&
                 buttons[4].getText() == buttons[5].getText() &&
                 !buttons[3].getText().isBlank()) {
         if (buttons[3].getText().equals("X")) {
            playerTwoWins = JOptionPane.showConfirmDialog(
                frame, "Player Two wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         } else {
            playerOneWins = JOptionPane.showConfirmDialog(
                frame, "Player One wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         }
         if (playerTwoWins == JOptionPane.OK_OPTION ||
             playerOneWins == JOptionPane.OK_OPTION || draw == JOptionPane.OK_OPTION) {
            TicTacToe newGame = new TicTacToe();
            frame.dispose();
         }
         return;
      } else if (buttons[6].getText() == buttons[7].getText() &&
                 buttons[7].getText() == buttons[8].getText() &&
                 !buttons[6].getText().isBlank()) {
         if (buttons[6].getText().equals("X")) {
            playerTwoWins = JOptionPane.showConfirmDialog(
                frame, "Player Two wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         } else {
            playerOneWins = JOptionPane.showConfirmDialog(
                frame, "Player One wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         }
         if (playerTwoWins == JOptionPane.OK_OPTION ||
             playerOneWins == JOptionPane.OK_OPTION || draw == JOptionPane.OK_OPTION) {
            TicTacToe newGame = new TicTacToe();
            frame.dispose();
         }
         return;
      } else if (buttons[0].getText() == buttons[3].getText() &&
                 buttons[3].getText() == buttons[6].getText() &&
                 !buttons[0].getText().isBlank()) {
         if (buttons[0].getText().equals("X")) {
            playerTwoWins = JOptionPane.showConfirmDialog(
                frame, "Player Two wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         } else {
            playerOneWins = JOptionPane.showConfirmDialog(
                frame, "Player One wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         }
         if (playerTwoWins == JOptionPane.OK_OPTION ||
             playerOneWins == JOptionPane.OK_OPTION || draw == JOptionPane.OK_OPTION) {
            TicTacToe newGame = new TicTacToe();
            frame.dispose();
         }
         return;
      } else if (buttons[1].getText() == buttons[4].getText() &&
                 buttons[4].getText() == buttons[7].getText() &&
                 !buttons[1].getText().isBlank()) {
         if (buttons[1].getText().equals("X")) {
            playerTwoWins = JOptionPane.showConfirmDialog(
                frame, "Player Two wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         } else {
            playerOneWins = JOptionPane.showConfirmDialog(
                frame, "Player One wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         }
         if (playerTwoWins == JOptionPane.OK_OPTION ||
             playerOneWins == JOptionPane.OK_OPTION || draw == JOptionPane.OK_OPTION) {
            TicTacToe newGame = new TicTacToe();
            frame.dispose();
         }
         return;
      } else if (buttons[2].getText() == buttons[5].getText() &&
                 buttons[5].getText() == buttons[8].getText() &&
                 !buttons[2].getText().isBlank()) {
         if (buttons[2].getText().equals("X")) {
            JOptionPane.showConfirmDialog(frame, "Player Two wins!", "Winner",
                                          JOptionPane.CLOSED_OPTION,
                                          JOptionPane.INFORMATION_MESSAGE);
         } else {
            JOptionPane.showConfirmDialog(frame, "Player One wins!", "Winner",
                                          JOptionPane.CLOSED_OPTION,
                                          JOptionPane.INFORMATION_MESSAGE);
         }
         if (playerTwoWins == JOptionPane.OK_OPTION ||
             playerOneWins == JOptionPane.OK_OPTION || draw == JOptionPane.OK_OPTION) {
            TicTacToe newGame = new TicTacToe();
            frame.dispose();
         }
         return;
      } else if (buttons[0].getText() == buttons[4].getText() &&
                 buttons[4].getText() == buttons[8].getText() &&
                 !buttons[0].getText().isBlank()) {
         if (buttons[0].getText().equals("X")) {
            playerTwoWins = JOptionPane.showConfirmDialog(
                frame, "Player Two wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         } else {
            playerOneWins = JOptionPane.showConfirmDialog(
                frame, "Player One wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         }
         if (playerTwoWins == JOptionPane.OK_OPTION ||
             playerOneWins == JOptionPane.OK_OPTION || draw == JOptionPane.OK_OPTION) {
            TicTacToe newGame = new TicTacToe();
            frame.dispose();
         }
         return;
      } else if (buttons[2].getText() == buttons[4].getText() &&
                 buttons[4].getText() == buttons[6].getText() &&
                 !buttons[2].getText().isBlank()) {
         if (buttons[2].getText().equals("X")) {
            playerTwoWins = JOptionPane.showConfirmDialog(
                frame, "Player Two wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         } else {
            playerOneWins = JOptionPane.showConfirmDialog(
                frame, "Player One wins!", "Winner", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         }
         if (playerTwoWins == JOptionPane.OK_OPTION ||
             playerOneWins == JOptionPane.OK_OPTION || draw == JOptionPane.OK_OPTION) {
            TicTacToe newGame = new TicTacToe();
            frame.dispose();
         }
         return;
      }
      if (clickedButtons == 9) {
         draw = JOptionPane.showConfirmDialog(frame, "DRAW", "Winner",
                                              JOptionPane.CLOSED_OPTION,
                                              JOptionPane.INFORMATION_MESSAGE);
         if (draw == JOptionPane.OK_OPTION) {
            TicTacToe newGame = new TicTacToe();
            frame.dispose();
         }
      }
   }
}
