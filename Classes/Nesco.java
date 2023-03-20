package Classes;

public class Nesco extends Meter {
    private double unit, unitPrice, bill; 
    public Nesco() {
        unitPrice = 5.50;
    }
    public Nesco(double unit, double unitPrice) {
        this.unit = unit;
        this.unitPrice = unitPrice;
    }
    public void setUnit(double unit) {
        this.unit = unit;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getUnit() {
        return unit;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setBill(double bill) {
        this.bill = bill;
    }
    public boolean payBill(double amount) {
        if(amount > 0) {
            bill -= amount;
            return true;
        }
        return false;
    }
    public double getBill(double unit) {
        double result = 0;
        if(unit <= 100) {
            result = unit * unitPrice * .2; // 20% VAT
        }else {
            result = unit * unitPrice * .25; // 25% VAT
        }
        bill = result;
        return result;
    }
    public void showDetails() {
        System.out.println("Meter No : " + meterNo);
        System.out.println("User ID : " + userID);
        System.out.println("Bill : " + bill);
    }
}
