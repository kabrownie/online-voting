import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class voterReg extends JFrame {
    private JPanel regPanel;
    private JTextField regNum;
    private JTextField firstName;
    private JPasswordField password;
    private JPasswordField passwordConfm;
    private JButton registerNowButton;
    private JButton goToLoginPageButton;

    public voterReg() {

        setContentPane(regPanel);
        setTitle("welcome");
        setSize(450, 450);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        registerNowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        goToLoginPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }
    public static void main(String[]args){
        new voterReg();
    }
}
