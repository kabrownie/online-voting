import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adminpanel extends JFrame{
    private JButton addCandidateButton;
    private JTextField canName;


    private JComboBox position;
    private JPanel apanel;


    public adminpanel() {
        setContentPane(apanel);
        setTitle("admin");
        setSize(450, 350);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        addCandidateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {
                    Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting","newuser","Karanja_019");
                    PreparedStatement Pstatement=connection.prepareStatement("insert into candidate values(?,?)");
                    Pstatement.setString(1,canName.getText());
                    Pstatement.setString(2,position.getSelectedItem().toString());




                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null,"candidate added Successfully");





                } catch (SQLException e1) {
                    e1.printStackTrace();
                    Logger.getLogger(voterLogin.class.getName()).log(Level.SEVERE, null,e1);
                }



            }
        });
            }
            public static void main(String[]args){
        new adminpanel();
            }

        }