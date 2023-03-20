package Classes;

public abstract class Meter {
    String meterNo, userID;
    public Meter() {}
    public Meter(String meterNo, String userID) {
        this.meterNo = meterNo;
        this.userID = userID;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getMeterNo() {
        return meterNo;
    }
    public String getUserID() {
        return userID;
    }
    public abstract void showDetails();
}
