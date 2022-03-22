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
        setSize(400, 450);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        adminLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                adminlogin link = new adminlogin();
                link.setVisible(true);

            }
        });
        voterLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                voterLogin link = new voterLogin();
                link.setVisible(true);

            }
        });
    }
    public static void main(String[] args){
        new home();
    }
}
