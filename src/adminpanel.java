import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class adminpanel extends JFrame{


    private JPanel apanel;
    private JLabel voters;
    private JButton noOfVotersButton;
    private JButton totalVotesCastButton;
    private JLabel votescast;


    public adminpanel() {
        setContentPane(apanel);
        setTitle("admin");
        setSize(450, 350);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        noOfVotersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                            // Initially connection is assigned Null valued
                            Connection con = null;
                            ResultSet res = null;
                            // Try block to check exceptions
                            try {
                                // Here- 'mysql-connector-java-8.0.22'
                                // is used using Class.forNmae() method
                                Class.forName("com.mysql.cj.jdbc.Driver");

			/* Step 3: Establish a connection using
					DriverManager method */
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting","newuser", "Karanja_019");

                                // Try block to check exceptions
                                try {
                                    Statement st = con.createStatement();

                                    res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "voters");

                                    /* Step 5: Execute the query */
                                    res.next();

                                    /* Step 6: Process the results */
                                    voters.setText ("The Total number of registered voters  is:  " + res.getInt("NumberOfRows") );
                                }

                                // Catch block to handle exceptions
                                catch (SQLException s) {
                                    // Message to be displayed if SQLException
                                    // occurs
                                                                    }
                            }
                            catch (Exception e) {
			/* Displaying line where exception occured using
			method returning line number in code */
                                e.printStackTrace();
                            }

                            finally {

                                // Step 7: Closing the connection
                                res = null;
                                con = null;
                            }
                        }

        });
        totalVotesCastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Initially connection is assigned Null valued
                Connection con = null;
                ResultSet res = null;
                // Try block to check exceptions
                try {
                    // Here- 'mysql-connector-java-8.0.22'
                    // is used using Class.forNmae() method
                    Class.forName("com.mysql.cj.jdbc.Driver");

			/* Step 3: Establish a connection using
					DriverManager method */
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting","newuser", "Karanja_019");

                    // Try block to check exceptions
                    try {
                        Statement st = con.createStatement();

                        res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "president_rank");

                        /* Step 5: Execute the query */
                        res.next();

                        /* Step 6: Process the results */
                        votescast.setText ("The Total number of votes casted is:  " + res.getInt("NumberOfRows") );
                    }

                    // Catch block to handle exceptions
                    catch (SQLException s) {
                        // Message to be displayed if SQLException
                        // occurs
                    }
                }
                catch (Exception e) {
			/* Displaying line where exception occured using
			method returning line number in code */
                    e.printStackTrace();
                }

                finally {

                    // Step 7: Closing the connection
                    res = null;
                    con = null;
                }
            }


        });
    }
            public static void main(String[]args){
        new adminpanel();
            }

        }