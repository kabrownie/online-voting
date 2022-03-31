import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adminlogin extends JFrame {
    private JTextField adminId;
    private JPasswordField adminPassword;
    private JButton loginButton;
    private JButton homePageButton;
    private JPanel adminlogpanel;

    public adminlogin() {
        setContentPane(adminlogpanel);
        setTitle("admin");
        setSize(600, 400);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //login
                ResultSet rs;
                String username = adminId.getText();
                String pass = String.valueOf(adminPassword.getPassword());
                String query = "SELECT * FROM `admin_detail` WHERE `id` =? AND `pwd` =?";

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting", "newuser", "Karanja_019");
                    PreparedStatement ps = connection.prepareStatement(query);
                    ps.setString(1, username);
                    ps.setString(2, pass);

                    rs = ps.executeQuery();

                    if(adminId.getText().trim().isEmpty()  ||adminPassword.getText().trim().isEmpty())  {
                        JOptionPane.showMessageDialog(null,"Please fill in the required field!.");
                    }

                    else if (rs.next()){
                        setVisible(false);
                        adminpanel link = new adminpanel();
                        link.setVisible(true);

                    }
                    else {
                        JOptionPane.showMessageDialog(null, "login failed" + "\n" +"Incorrect username or password!");
                    }



                } catch (SQLException e1) {
                    Logger.getLogger(voterLogin.class.getName()).log(Level.SEVERE, null,e1);
                }




            }
        });

        homePageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                setVisible(false);
                home link = new home();
                link.setVisible(true);

            }
        });

    }

    public static void main(String[]args){
        new adminlogin();
    }
}
