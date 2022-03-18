import javax.swing.*;

public class voting  extends JFrame {
    private JPanel votingpanel;

    public voting(){

        setContentPane(votingpanel);
        setTitle("welcome");
        setSize(450, 400);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }
    public static void main(String[]args){
        new voting();
    }
}

