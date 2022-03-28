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
<<<<<<< HEAD
    private JLabel result;
    private JButton button1;
    private JButton resultsButton;
    private JLabel pres2;
    private JLabel vice1;
    private JLabel vice2;
    private JLabel sec1;
    private JLabel sec2;
    private JLabel tres1;
    private JLabel tres2;
=======
>>>>>>> 184bcec66ecaff7070a477db2c0fa7ad73b0370a


    public adminpanel() {
        setContentPane(apanel);
        setTitle("admin");
        setSize(600, 400);
        setResizable(true);
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
<<<<<<< HEAD

			/* Step 3: Establish a connection using
					DriverManager method */
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_voting","newuser", "Karanja_019");

                                // Try block to check exceptions
                                try {
                                    Statement st = con.createStatement();

                                    res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM  " + "voters");

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
=======

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
>>>>>>> 184bcec66ecaff7070a477db2c0fa7ad73b0370a

                    // Try block to check exceptions
                    try {
                        Statement st = con.createStatement();

                     //   res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "president_rank");
                        res = st.executeQuery("SELECT COUNT(*) FROM president_rank");

                        /* Step 5: Execute the query */
                        res.next();

                        /* Step 6: Process the results */
                        votescast.setText ("The Total number of votes casted per candidate is:  " +res.getInt(1));
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

<<<<<<< HEAD
                finally {

                    // Step 7: Closing the connection
                    res = null;
                    con = null;
                }
            }


        });
        resultsButton.addActionListener(new ActionListener() {
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

                            //   res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "president_rank");
                            res = st.executeQuery("SELECT COUNT(*) FROM president_rank WHERE Name LIKE '1%'");

                            /* Step 5: Execute the query */
                            res.next();

                            /* Step 6: Process the results */
                            result.setText ("president candidate 1 has   " +res.getInt(1))  ;


                    }

                    // Catch block to handle exceptions
                    catch (SQLException s) {
                        // Message to be displayed if SQLException
                        // occurs
                    }
                    try {

                        Statement st = con.createStatement();

                        //   res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "president_rank");
                        res = st.executeQuery("SELECT COUNT(*) FROM president_rank WHERE Name LIKE '2%'");

                        /* Step 5: Execute the query */
                        res.next();

                        /* Step 6: Process the results */
                        pres2.setText ("president candidate 2 has   " +res.getInt(1)) ;


                    }

                    // Catch block to handle exceptions
                    catch (SQLException s) {
                        // Message to be displayed if SQLException
                        // occurs
                    }
                    try {

                        Statement st = con.createStatement();

                        //   res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "president_rank");
                        res = st.executeQuery("SELECT COUNT(*) FROM v_president_rank WHERE Name LIKE '1%'");

                        /* Step 5: Execute the query */
                        res.next();

                        /* Step 6: Process the results */
                        vice1.setText ("vice president candidate 1 has   " +res.getInt(1)) ;


                    }

                    // Catch block to handle exceptions
                    catch (SQLException s) {
                        // Message to be displayed if SQLException
                        // occurs
                    }




                     try {

                        Statement st = con.createStatement();

                        //   res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "president_rank");
                        res = st.executeQuery("SELECT COUNT(*) FROM v_president_rank WHERE Name LIKE '2%'");

                        /* Step 5: Execute the query */
                        res.next();

                        /* Step 6: Process the results */
                        vice2.setText ("vice president candidate 2 has   " +res.getInt(1)) ;


                    }


                    // Catch block to handle exceptions
                    catch (SQLException s) {
                        // Message to be displayed if SQLException
                        // occurs
                    }
                    try {

                        Statement st = con.createStatement();

                        //   res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "president_rank");
                        res = st.executeQuery("SELECT COUNT(*) FROM sec_rank WHERE Name LIKE '1%'");

                        /* Step 5: Execute the query */
                        res.next();

                        /* Step 6: Process the results */
                        sec1.setText ("secretary candidate 1 has   " +res.getInt(1)) ;


                    }

                    // Catch block to handle exceptions
                    catch (SQLException s) {
                        // Message to be displayed if SQLException
                        // occurs
                    }
                    try {

                        Statement st = con.createStatement();

                        //   res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "president_rank");
                        res = st.executeQuery("SELECT COUNT(*) FROM sec_rank WHERE Name LIKE '2%'");

                        /* Step 5: Execute the query */
                        res.next();

                        /* Step 6: Process the results */
                        sec2.setText ("secretary candidate 2 has   " +res.getInt(1)) ;


                    }

                    // Catch block to handle exceptions
                    catch (SQLException s) {
                        // Message to be displayed if SQLException
                        // occurs
                    }



                    try {

                        Statement st = con.createStatement();

                        //   res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "president_rank");
                        res = st.executeQuery("SELECT COUNT(*) FROM treasur_rank WHERE Name LIKE '1%'");

                        /* Step 5: Execute the query */
                        res.next();

                        /* Step 6: Process the results */
                        tres1.setText ("treasure candidate 1 has   " +res.getInt(1)) ;


                    }  // Catch block to handle exceptions
                    catch (SQLException s) {
                        // Message to be displayed if SQLException
                        // occurs
                    }
                    try {

                        Statement st = con.createStatement();

                        //   res = st.executeQuery("SELECT COUNT(1) as NumberOfRows FROM " + "president_rank");
                        res = st.executeQuery("SELECT COUNT(*) FROM treasur_rank WHERE Name LIKE '2%'");

                        /* Step 5: Execute the query */
                        res.next();

                        /* Step 6: Process the results */
                        tres2.setText ("treasure candidate 2 has   " +res.getInt(1)) ;


                    }

                    // Catch block to handle exceptions
                    catch (SQLException s) {
                        // Message to be displayed if SQLException
                        // occurs
                    }


                } catch (Exception e) {
			/* Displaying line where exception occured using
			method returning line number in code */
                    e.printStackTrace();
                }
            }
        });
=======
        });
>>>>>>> 184bcec66ecaff7070a477db2c0fa7ad73b0370a
    }
            public static void main(String[]args){
        new adminpanel();

            }

        }