package entity;

public class Sale {
    private int SaleID;
    private int SallerID;
    private int CustomerID;
    private String Date;
    private float Total;

    public int getSaleID() {
        return SaleID;
    }

    public void setSaleID(int saleID) {
        SaleID = saleID;
    }

    public int getSallerID() {
        return SallerID;
    }

    public void setSallerID(int sallerID) {
        SallerID = sallerID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float total) {
        Total = total;
    }
}