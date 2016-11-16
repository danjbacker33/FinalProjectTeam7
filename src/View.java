
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class View {
    private Model model;
    private JTextField player1TextField;
    private JTextField player2TextField;
    private JButton redButton_P1;
    private JButton blueButton_P1;
    private JButton greenButton_P1;
    private JButton redButton_P2;
    private JButton blueButton_P2;
    private JButton greenButton_P2;
    private String player1Name;
    private String player2Name;
    private String highestScorer;
    private Color player1Color;
    private Color player2Color;
    private int player1Score;
    private int player2Score;
    private int highScore;
    
    View() {
        player1TextField = new JTextField("Enter Player 1 Name");
        player2TextField = new JTextField("Enter Player 2 Name");
        redButton_P1 = new JButton("Red");
        blueButton_P1 = new JButton("Blue");
        greenButton_P1 = new JButton("Green");
        redButton_P2 = new JButton("Red");
        blueButton_P2 = new JButton("Blue");
        greenButton_P2 = new JButton("Green");
    }
}
