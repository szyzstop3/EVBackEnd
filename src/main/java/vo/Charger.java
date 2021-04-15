package vo;

public class Charger {
    private int chargerid;
    private int userid;
    private String state;
    private String location;
    private String time;
    private double longitude;
    private double latitude;
    private String CSA;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChargerName() {
        return chargerName;
    }

    public void setChargerName(String chargerName) {
        this.chargerName = chargerName;
    }

    private String chargerName;

    public int getChargerid() {
        return chargerid;
    }

    public void setChargerid(int chargerid) {
        this.chargerid = chargerid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getCSA() {
        return CSA;
    }

    public void setCSA(String CSA) {
        this.CSA = CSA;
    }
}
