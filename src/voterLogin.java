import com.mysql.cj.MysqlConnection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import   java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class voterLogin extends JFrame {
    private JTextField regNum;
    private JPasswordField password;
    private JButton loginButton;
    private JButton goToRegPageButton;
    private JPanel logpanel;

    public voterLogin() {

        setContentPane(logpanel);
        setTitle("voter login");
        setSize(450, 400);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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

                // retrive data


                ResultSet rs;
                String username = regNum.getText();
                String pass = String.valueOf(password.getPassword());
                String query = "SELECT * FROM `voters` WHERE `reg_no` =? AND `pswd` =?";

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting", "newuser", "Karanja_019");
                    PreparedStatement ps = connection.prepareStatement(query);
                    ps.setString(1, username);
                    ps.setString(2, pass);

                    rs = ps.executeQuery();

                    if(regNum.getText().trim().isEmpty()  ||password.getText().trim().isEmpty())  {
                        JOptionPane.showMessageDialog(null,"Please fill in the required field!.");
                    }

                   else if (rs.next()){
                        setVisible(false);
                        voting link = new voting();
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
    }
        public static void main (String[]args){
            new voterLogin();
        }
    }
