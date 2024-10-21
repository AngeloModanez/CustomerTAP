package entity;

public class SaleItem {
    private int ProductID;
    private int SaleID;
    private int Quantity;
    private float UnitValue;
    private float TotalValue;
    private float Discount;
    private float TotalDiscount;

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getSaleID() {
        return SaleID;
    }

    public void setSaleID(int saleID) {
        SaleID = saleID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public float getUnitValue() {
        return UnitValue;
    }

    public void setUnitValue(float unitValue) {
        UnitValue = unitValue;
    }

    public float getTotalValue() {
        return TotalValue;
    }

    public void setTotalValue(float totalValue) {
        TotalValue = totalValue;
    }

    public float getDiscount() {
        return Discount;
    }

    public void setDiscount(float discount) {
        Discount = discount;
    }

    public float getTotalDiscount() {
        return TotalDiscount;
    }

    public void setTotalDiscount(float totalDiscount) {
        TotalDiscount = totalDiscount;
    }
}