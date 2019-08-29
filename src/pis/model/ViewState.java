package pis.model;

/**
 *
 * @author milan
 */
public class ViewState {

    String message;
    SingleMalt smObject;

    public ViewState() {
        message = "";
        smObject = null;
    }

    public ViewState(String message, SingleMalt smObject) {
        this.message = message;
        this.smObject = smObject;
    }

    public String getMessage() {
        return message;
    }

    public SingleMalt getRecord() {
        return smObject;
    }
}
