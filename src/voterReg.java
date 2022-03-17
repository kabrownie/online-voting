import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import   java.sql.*;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class voterReg extends JFrame {
    private JPanel regPanel;
    private JTextField regNum;
    private JTextField firstName;
    private JPasswordField password;
    private JPasswordField passwordConfm;
    private JButton registerNowButton;
    private JButton goToLoginPageButton;
    private JTextField lastName;

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
              ///go to vote

                //database connection

                try {
                    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting","newuser","Karanja_019");
                    PreparedStatement Pstatement=connection.prepareStatement("insert into voters values(?,?,?,?,?)");
                    Pstatement.setString(1,regNum.getText());
                    Pstatement.setString(2,firstName.getText());
                    Pstatement.setString(3,lastName.getText());
                    Pstatement.setString(4,password.getText());
                    Pstatement.setString(5,passwordConfm.getText());


                    if(password.getText().equalsIgnoreCase(passwordConfm.getText()))
                    {

                        Pstatement.executeUpdate();
                        JOptionPane.showMessageDialog(null,"You have been Registered Successfully");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"password did not match!");
                    }

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }



            }
        });
        goToLoginPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                voterLogin link = new voterLogin();
                link.setVisible(true);

            }
        });
    }
    public static void main(String[]args){
        new voterReg();
    }
}
