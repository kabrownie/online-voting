import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminlogin extends JFrame {
    private JTextField adminId;
    private JPasswordField adminPassword;
    private JButton loginButton;
    private JButton homePageButton;
    private JPanel adminlogpanel;

    public adminlogin() {
        setContentPane(adminlogpanel);
        setTitle("welcome");
        setSize(450, 350);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        homePageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

    }

    public static void main(String[]args){
        new adminlogin();
    }
}
