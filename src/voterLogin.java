import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class voterLogin extends JFrame {
    private JTextField regNum;
    private JPasswordField password;
    private JButton loginButton;
    private JButton goToRegPageButton;
    private JPanel logpanel;

    public voterLogin() {

        setContentPane(logpanel);
        setTitle("welcome");
        setSize(450, 400);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        goToRegPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                voterReg link = new voterReg();
                link.setVisible(true);

            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //go to vote



            }
        });
    }
    public static void main(String[] args){
        new voterLogin();
    }
}
