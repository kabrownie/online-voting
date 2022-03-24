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
        setSize(450, 400);
        setResizable(false);
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


                try {

                    Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting","newuser","Karanja_019");

                    PreparedStatement Pstatement=connection.prepareStatement("insert into president_rank values(?,?)");
                    Pstatement.setString(1,selectPresident.getSelectedItem().toString());
                    Pstatement.setString(2,voter.getText());

                    PreparedStatement Pstatement2=connection.prepareStatement("insert into v_president_rank values(?,?)");
                    Pstatement2.setString(1,selectVice.getSelectedItem().toString());
                    Pstatement2.setString(2,voter.getText());


                    PreparedStatement Pstatement3=connection.prepareStatement("insert into sec_rank  values(?,?)");
                    Pstatement3.setString(1,selectSec.getSelectedItem().toString());
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
