import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import   java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        setTitle("voter registration");
        setSize(600, 450);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        registerNowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
              ///



                //database  voters connection

                ResultSet rs;
                String username = regNum.getText();
                String query = "SELECT * FROM `voters` WHERE `reg_no` =? ";

                try {
                    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting","newuser","Karanja_019");
                    PreparedStatement Pstatement=connection.prepareStatement("insert into voters values(?,?,?,?,?)");
                    Pstatement.setString(1,regNum.getText());
                    Pstatement.setString(2,firstName.getText());
                    Pstatement.setString(3,lastName.getText());
                    Pstatement.setString(4,password.getText());
                    Pstatement.setString(5,passwordConfm.getText());

                    PreparedStatement ps = connection.prepareStatement(query);
                    ps.setString(1, username);

                    rs = ps.executeQuery();




                    if(regNum.getText().trim().isEmpty() ||firstName.getText().trim().isEmpty()  ||lastName.getText().trim().isEmpty()  ||password.getText().trim().isEmpty()  ||passwordConfm.getText().trim().isEmpty())  {
                            JOptionPane.showMessageDialog(null,"Please fill in the required field!.");
                    }


                   else if(rs.next()){
                        JOptionPane.showMessageDialog(null,"This user already exist!");
                    }

                    else if(password.getText().equalsIgnoreCase(passwordConfm.getText()))
                    {

                        Pstatement.executeUpdate();
                        JOptionPane.showMessageDialog(null,"You have been Registered Successfully" +"\n" + "click ok to proceed to the login page");
                        setVisible(false);
                        voterLogin link = new voterLogin();
                        link.setVisible(true);


                    }


                    else
                    {


                        JOptionPane.showMessageDialog(null,"password did not match!");
                    }

                } catch (SQLException e1) {
                    e1.printStackTrace();
                    Logger.getLogger(voterLogin.class.getName()).log(Level.SEVERE, null,e1);
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
