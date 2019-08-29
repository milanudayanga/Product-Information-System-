package pis.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pis.model.IModel;
import pis.model.SingleMalt;
import pis.view.IView;

/**
 *
 * @author milan
 */
public class SingleMaltController {

    private IView view;
    private IModel model;

    // private final IQueries queries;
    public SingleMaltController(IModel model1) {
        this.model = model1;
    }

    public void AllMalts() {

        model.SetToAllMalts(); //calling the method in singlemaltmodel class

    }

    public void bind(IView view) {
        this.view = view;
    }

    public void clear() {

        model.clear();
    }

    public void closeConnection() {

        model.close();

    }

    public void maltsFromRegion(String region) {

        model.setToAllMaltsFromRegion(region);

    }

    public void maltsInAgeRange(String age1, String age2) {

        int value1 =Integer.parseInt(age1);
        int value2 =Integer.parseInt(age2);
        model.setToMaltsWithinAgeRange(value1, value2);

    }

    public void next() {
        model.next();
    }

    public void previous() {
        model.previous();
    }

    public void updatePrice(String Distellery, int age, int price) {

        model.ChangePriceForMalt(Distellery, age, price);

    }

}
