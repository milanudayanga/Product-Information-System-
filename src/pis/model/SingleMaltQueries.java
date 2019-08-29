package pis.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author milan
 */
public class SingleMaltQueries {

    private String PASSWORD;
    private String URL;
    private String USERNAME;
    private Connection connection;
    private PreparedStatement countMaltsWithinAgeRange;
    private PreparedStatement selectAllMalts;
    private PreparedStatement selectMaltsFromRegion;
    private PreparedStatement updatePriceForMalt;

    public SingleMaltQueries() throws SQLException {
        PASSWORD = "12345";
        USERNAME = "milan";
        URL = "jdbc:derby://localhost:1527/MILAN";

        try {

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("DB connected");
            try {
                Statement stmt = connection.createStatement(); //create database connection
                try {
                    stmt.executeUpdate("DROP TABLE SINGLEMALTS");

                    String createTbl = "CREATE TABLE SINGLEMALTS"
                            + "(DISTILLERY VARCHAR (32) NOT NULL,\n"
                            + "	AGE INT NOT NULL,\n"
                            + "	REGION VARCHAR (16) NOT NULL,\n"
                            + "	PRICE INT NOT NULL,\n"
                            + "PRIMARY KEY (DISTILLERY, AGE))";
                    stmt.executeUpdate(createTbl);
                                //inserting all the values
                    String insertData = "INSERT INTO SINGLEMALTS(DISTILLERY,AGE,REGION,PRICE)\n"
                            + "VALUES \n"
                            + "('Laphroaig',10,'Islay',100),\n"
                            + "('Laphroaig',15,'Islay',150),\n"
                            + "('Laphroaig',30,'Islay',500),\n"
                            + "('Lagavulin',16,'Islay',100),\n"
                            + "('Oban',14,'Highland',120),\n"
                            + "('Tomatin',12,'Highland',90),\n"
                            + "('Tomatin',14,'Highland',110)";
                    stmt.executeUpdate(insertData);

                    System.out.println("DB proccess succesfully completed");
                } catch (SQLException exception) {
                    System.out.println("Table can not DROP");
                }

            } catch (SQLException exception) {
                System.out.println("DB creating error");
            }
        } catch (SQLException exception) {
            System.out.println("DB connection error" + exception);
            close();
        }
    }

    public void close() {
        try {
            JOptionPane.showMessageDialog(new JFrame(), "Database connection not establish.! Application can not be open", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
            connection.close();
            System.exit(0);
        } catch (SQLException ex) {
            Logger.getLogger(SingleMaltQueries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<SingleMalt> getAllMalts() throws SQLException {
        List<SingleMalt> MaltList = new ArrayList<SingleMalt>();
        try {
            selectAllMalts = connection.prepareStatement("SELECT * FROM SINGLEMALTS");
            ResultSet rsDataObject = selectAllMalts.executeQuery();

            while (rsDataObject.next()) {
                SingleMalt recordObj = new SingleMalt(
                        rsDataObject.getString("DISTILLERY"),
                        Integer.parseInt((rsDataObject.getString("AGE"))),
                        rsDataObject.getString("REGION"),
                        Integer.parseInt((rsDataObject.getString("PRICE")))
                );
                MaltList.add(recordObj);
            }
            System.out.println("SINGLEMALTS reading done !");

        } catch (SQLException ex) {
            System.out.println("SINGLEMALTS reading error !");
            Logger.getLogger(SingleMaltQueries.class.getName()).log(Level.SEVERE, null, ex);
            close();
        }
        return MaltList; // return retrieved data array
    }

    public List<SingleMalt> getAllMaltsFromRegion(String region) throws SQLException {
        List<SingleMalt> MaltsFromRegion = new ArrayList<SingleMalt>();

        try {

            selectMaltsFromRegion = connection.prepareStatement("SELECT * FROM SINGLEMALTS WHERE REGION ='" + region + "'");

            ResultSet rsDataObject = selectMaltsFromRegion.executeQuery();

            while (rsDataObject.next()) {
                while (rsDataObject.next()) {
                    SingleMalt recordObj = new SingleMalt(
                            rsDataObject.getString("DISTILLERY"),
                            Integer.parseInt((rsDataObject.getString("AGE"))),
                            rsDataObject.getString("REGION"),
                            Integer.parseInt((rsDataObject.getString("PRICE")))
                    );
                    MaltsFromRegion.add(recordObj);
                }
                System.out.println("Range record reading done !");
            }

        } catch (SQLException ex) {
            System.out.println("record reading error !");
            Logger.getLogger(SingleMaltQueries.class.getName()).log(Level.SEVERE, null, ex);
            close();
        }
        return MaltsFromRegion;
    }

    public List<SingleMalt> numberOfMaltsWithinAgeRange(int age1, int age2) throws SQLException {
        List<SingleMalt> maltsInRange = new ArrayList<SingleMalt>();

        try {
            if (age1 <= age2 && age1 >= 0 && age2 >= 0) {

                countMaltsWithinAgeRange = connection.prepareStatement("SELECT * FROM SINGLEMALTS WHERE AGE BETWEEN " + Integer.toString(age1) + " AND " + Integer.toString(age2));

                ResultSet rsDataObject = countMaltsWithinAgeRange.executeQuery();

                while (rsDataObject.next()) {
                    while (rsDataObject.next()) {
                        SingleMalt recordObj = new SingleMalt(
                                rsDataObject.getString("DISTILLERY"),
                                Integer.parseInt((rsDataObject.getString("AGE"))),
                                rsDataObject.getString("REGION"),
                                Integer.parseInt((rsDataObject.getString("PRICE")))
                        );
                        maltsInRange.add(recordObj);
                    }
                    System.out.println("Range of the Malts reading done !");
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Input range format notify error. left value must be grater or equel rigt value and minimum value is 0", "Dialog",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            System.out.println("record reading error !");
            Logger.getLogger(SingleMaltQueries.class.getName()).log(Level.SEVERE, null, ex);
            close();
        }
        return maltsInRange;
    }

    public int ChangePriceForMalt(String distillery, int age, int price) throws SQLException {

        try {

            updatePriceForMalt = connection.prepareStatement("UPDATE SINGLEMALTS SET PRICE=? WHERE DISTILLERY=? AND AGE=?");
            updatePriceForMalt.setInt(1, price);
            updatePriceForMalt.setString(2, distillery);
            updatePriceForMalt.setInt(3, age);

            updatePriceForMalt.executeUpdate();
            System.out.println("successfully Updated !");

        } catch (SQLException ex) {
            System.out.println("Malts updating error !");
            Logger.getLogger(SingleMaltQueries.class.getName()).log(Level.SEVERE, null, ex);
            close();
        }
        return 1;
    }
}
