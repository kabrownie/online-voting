import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame{
    private JButton adminLoginButton;
    private JButton voterLoginButton;
    private JPanel homepanel;

    public home() {
        setContentPane(homepanel);
        setTitle("welcome");
        setSize(300, 450);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        adminLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        voterLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }
    public static void main(String[] args){
        new home();
    }
}
