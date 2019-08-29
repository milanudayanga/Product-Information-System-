package pis.model;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author milan
 */
public interface IModel {

    public void ChangePriceForMalt(String distillery, int age, int price);

    public void clear();

    public void close();

    public void SetToAllMalts();

    public void setToAllMaltsFromRegion(String region);

    public void setToMaltsWithinAgeRange(int age1, int age2);

    public void previous();

    public void next();

}
