import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
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
    private JTextField voter;


    public voting(){

        setContentPane(votingpanel);
        setTitle("voting");
        setSize(600, 400);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        ///
        voteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                ResultSet rs;
                String username = voter.getText();
                String query = "SELECT * FROM `president_rank` WHERE `voter` =? ";

                ResultSet rs2;
                String username2 = voter.getText();
                String query2 = "SELECT * FROM `voters` WHERE `reg_no` =?";

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting", "newuser", "Karanja_019");
                    PreparedStatement ps2 = connection.prepareStatement(query2);
                    ps2.setString(1, username2);


                    rs2 = ps2.executeQuery();








                try {
<<<<<<< HEAD
=======

                    Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting","newuser","Karanja_019");
>>>>>>> 184bcec66ecaff7070a477db2c0fa7ad73b0370a

                    PreparedStatement Pstatement=connection.prepareStatement("insert into president_rank values(?)");
                    Pstatement.setString(1,selectPresident.getSelectedItem().toString());
<<<<<<< HEAD
                    Pstatement.setString(2,voter.getText());
=======
>>>>>>> 184bcec66ecaff7070a477db2c0fa7ad73b0370a

                    PreparedStatement Pstatement2=connection.prepareStatement("insert into v_president_rank values(?)");
                    Pstatement2.setString(1,selectVice.getSelectedItem().toString());
<<<<<<< HEAD
                    Pstatement2.setString(2,voter.getText());
=======
>>>>>>> 184bcec66ecaff7070a477db2c0fa7ad73b0370a


                    PreparedStatement Pstatement3=connection.prepareStatement("insert into sec_rank  values(?)");
                    Pstatement3.setString(1,selectSec.getSelectedItem().toString());
<<<<<<< HEAD
                    Pstatement3.setString(2,voter.getText());

                    PreparedStatement Pstatement4=connection.prepareStatement("insert into treasur_rank values(?,?)");
                    Pstatement4.setString(1,selectTresure.getSelectedItem().toString());
                    Pstatement4.setString(2,voter.getText());



                    PreparedStatement ps = connection.prepareStatement(query);
                    ps.setString(1, username);

                    rs = ps.executeQuery();
                    if(voter.getText().trim().isEmpty())  {
                        JOptionPane.showMessageDialog(null,"Please fill in the required field!.");
                    }
                    else if (!rs2.next()){
                        JOptionPane.showMessageDialog(null,"invalid registration number!");

                    }
=======

                    PreparedStatement Pstatement4=connection.prepareStatement("insert into treasur_rank values(?)");
                    Pstatement4.setString(1,selectTresure.getSelectedItem().toString());
>>>>>>> 184bcec66ecaff7070a477db2c0fa7ad73b0370a


                    else if(rs.next()){
                        JOptionPane.showMessageDialog(null,"Our database shows that you have already voted"+"\n"+"You are only allowed to vote once!");
                    }
                    else {


                        Pstatement.executeUpdate();
                        Pstatement2.executeUpdate();
                        Pstatement3.executeUpdate();
                        Pstatement4.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Your vote is cast successfully "+"\n"+"Thank you");

                    }








                } catch (SQLException e1) {
                    Logger.getLogger(voterLogin.class.getName()).log(Level.SEVERE, null,e1);
                }

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
