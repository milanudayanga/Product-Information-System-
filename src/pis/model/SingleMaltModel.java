
package pis.model;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author milan
 */

public class SingleMaltModel extends Observable implements IModel {

    SingleMaltQueries queris;
    private List<SingleMalt> singlemalt;
    private String dispay;
    private int index;
    ViewState view;
    int i = 1;

    public SingleMaltModel(SingleMaltQueries queries) {

        this.queris = queries;

    }

    @Override
    public void previous() {
        if (singlemalt.size() > index && index > 0) { //if the singlemalt array is greater than index value and index value greater than 0 
            index--; // index value is decremented by one 
            SingleMalt recordEntry = singlemalt.get(index);
            String recordCount = "Record " + (index + 1) + " of " + singlemalt.size();
            ViewState updateData = new ViewState(recordCount, recordEntry);
            setChanged();
            notifyObservers(updateData);
        }
    }

    @Override
    public void next() {
        if (singlemalt.isEmpty()) {
            setChanged();
            notifyObservers();
        } else if (singlemalt.size() - 1> index) { 
            index++;
            if(index==singlemalt.size()-1){
                index=-1;
            }
            else{
            SingleMalt recordEntry = singlemalt.get(index);
            String recordCount = "Record " + (index + 1) + " of " + singlemalt.size();
            ViewState updateData = new ViewState(recordCount, recordEntry); //passing rhe message that nedds to be displayed along with the count
            setChanged();
            notifyObservers(updateData); //send viewstate object to observable class  
            }
        }
    }

    @Override
    public void close() {
        int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "User Confirmation",
                JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @Override
    public void SetToAllMalts() {
        try {
            dispay = "";
            singlemalt = queris.getAllMalts(); //retrive data from database and add to the singlemalt array
            int numberOfRecords = singlemalt.size();  // calculate the size of the array
            if (numberOfRecords != 0) {
                for (SingleMalt record : singlemalt) { //iterate through the array to get the data 
                    dispay = dispay + record.toString();
                }
                index = -1;   // assign the index value to -1 and calling the next() method
                next();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void setToAllMaltsFromRegion(String region) {

        try {
            singlemalt = queris.getAllMaltsFromRegion(region);
            index = -1;
            next();
        } catch (Exception e) {
            System.exit(0);
        }
    }

    @Override
    public void setToMaltsWithinAgeRange(int age1, int age2) {

        try {
            singlemalt = queris.numberOfMaltsWithinAgeRange(age1, age2);
            index = -1;
            next();
        } catch (Exception e) {
            System.exit(0);
        }
    }

    @Override
    public void ChangePriceForMalt(String distillery, int age, int price) {
        try {
            int result = queris.ChangePriceForMalt(distillery, age, price);

            if (result == 1) {
                index++;

                SingleMalt recordEntry = singlemalt.get(index);
                String recordCount = "Record updated " + i;  //if the update is done, record count will be incresed by 1
                ViewState updateData = new ViewState(recordCount, recordEntry);
                setChanged();
                notifyObservers(updateData);
                i++;
            }

        } catch (Exception e) {
            System.exit(0);
        }

    }

    @Override
    public void clear() {
        try {
            singlemalt.clear(); //clear the singlemalt array
            next();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
