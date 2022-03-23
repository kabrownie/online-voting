import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class voting  extends JFrame {
    private JPanel votingpanel;
    private JComboBox selectPresident;
    private JLabel name;
    private JComboBox selectVice;
    private JComboBox selectSec;
    private JComboBox selectTresure;
    private JButton voteButton;



    public voting(){

        setContentPane(votingpanel);
        setTitle("voting");
        setSize(450, 400);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        voteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {
                    Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting","newuser","Karanja_019");

                    PreparedStatement Pstatement=connection.prepareStatement("insert into president_rank values(?,?)");
                    Pstatement.setString(1,selectPresident.getSelectedItem().toString());
                    Pstatement.setString(2,"");

                    PreparedStatement Pstatement2=connection.prepareStatement("insert into v_president_rank values(?,?)");
                    Pstatement2.setString(1,selectVice.getSelectedItem().toString());
                    Pstatement2.setString(2,"");


                    PreparedStatement Pstatement3=connection.prepareStatement("insert into sec_rank  values(?,?)");
                    Pstatement3.setString(1,selectSec.getSelectedItem().toString());
                    Pstatement3.setString(2,"");

                    PreparedStatement Pstatement4=connection.prepareStatement("insert into treasure_rank values(?,?)");
                    Pstatement4.setString(1,selectTresure.getSelectedItem().toString());
                    Pstatement4.setString(2,"");




                    Pstatement.executeUpdate();
                    Pstatement2.executeUpdate();
                    Pstatement3.executeUpdate();
                    Pstatement4.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Your vote is cast successfully");






                } catch (SQLException e1) {
                    e1.printStackTrace();
                    Logger.getLogger(voterLogin.class.getName()).log(Level.SEVERE, null,e1);
                }



            }

        });
}
    public static void main(String[]args){
        new voting();
    }
}
///////
