package calculator;

import java.awt.*;        // Using AWT's layouts
import java.awt.event.*;  // Using AWT's event classes and listener interfaces
import javax.swing.*;     // Using Swing's components and container
 
// A Swing application extends from javax.swing.JFrame

// In this version each button has its own anonymous inner class implementation of
// the ActionListener interface, so each button has its own actionPerformed method.
// In that we put the code to execute when that particular button is clicked
public class OOSD2Calculator extends JFrame {
   private JTextField num1Field, num2Field, resultField;
   private JButton btnAdd, btnClear, btnSubtract, btnMultiply, btnDivide, btnMod;
   int number1;
private int number2;
private int result;
   private JPanel panel = new JPanel();

   // Constructor to set up UI components and event handlers
   public OOSD2Calculator() {
    
      // Set the panel to grid layout of 6 rows and 2 columns
      panel.setLayout(new GridLayout(6, 2));
 
      // Components are added from left-to-right, top-to-bottom
      panel.add(new JLabel("First Number "));     // at (1, 1)
      num1Field = new JTextField(10);
      num1Field.setHorizontalAlignment(JTextField.RIGHT);
      panel.add(num1Field);                       // at (1, 2)
      
      panel.add(new JLabel("Second Number "));     // at (2, 1)
      num2Field = new JTextField(10);
      num2Field.setHorizontalAlignment(JTextField.RIGHT);
      panel.add(num2Field); 
      
      panel.add(new JLabel("Result "));     // at (3, 1)
      resultField = new JTextField(10);
      panel.add(resultField);
 
      btnAdd = new JButton("+");
      panel.add(btnAdd);                         // at (4, 1)
      btnAdd.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            number1 = Integer.parseInt(num1Field.getText());
            number2 = Integer.parseInt(num2Field.getText());
            result = number1 + number2;
            resultField.setText(String.valueOf(result));
         }
      });
      
      btnSubtract = new JButton("-");
      panel.add(btnSubtract);                         // at (4, 2)
      btnSubtract.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            number1 = Integer.parseInt(num1Field.getText());
            number2 = Integer.parseInt(num2Field.getText());
            result = number1 - number2;
            resultField.setText(String.valueOf(result));
         }
      });
      
      btnMultiply = new JButton("*");
      panel.add(btnMultiply);                         // at (5, 1)
      btnMultiply.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            number1 = Integer.parseInt(num1Field.getText());
            number2 = Integer.parseInt(num2Field.getText());
            result = number1 * number2;
            resultField.setText(String.valueOf(result));
         }
      });
      
      btnDivide = new JButton("/");
      panel.add(btnDivide);                         // at (5, 2)
      btnDivide.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            number1 = Integer.parseInt(num1Field.getText());
            number2 = Integer.parseInt(num2Field.getText());
            result = number1 / number2;
            resultField.setText(String.valueOf(result));
         }
      });
      
      btnMod = new JButton("%");
      panel.add(btnMod);                         // at (6, 1)
      btnMod.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            number1 = Integer.parseInt(num1Field.getText());
            number2 = Integer.parseInt(num2Field.getText());
            result = number1 % number2;
            resultField.setText(String.valueOf(result));
         }
      });
 
      btnClear = new JButton("CLEAR");
     panel.add(btnClear);                                // at (6, 2)
      btnClear.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
           num1Field.setText(" ");
           num2Field.setText(" ");
           resultField.setText(" ");
         }
      });
 
      add(panel);//add panel to the frame
      setDefaultCloseOperation(EXIT_ON_CLOSE); // for the "window-close" button
      setTitle("OOSD2 Simple Calculator");
      setSize(300, 170);
      setVisible(true);
   }
 
   // The entry main() method
   public static void main(String[] args) {
      // For thread safety, use the event-dispatching thread to construct UI
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new OOSD2Calculator(); // Let the constructor does the job
         }
      });
   }
}