import javax.swing.*;

public class voting  extends JFrame {
    private JPanel votingpanel;
    private JComboBox selectPresident;
    private JLabel name;
    private JComboBox selectVice;
    private JComboBox selectSec;
    private JComboBox selectTresure;
    private JButton voteButton;


    public voting(){

        setContentPane(votingpanel);
        setTitle("voting");
        setSize(450, 400);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


    }
    public static void main(String[]args){
        new voting();
    }
}
///////
