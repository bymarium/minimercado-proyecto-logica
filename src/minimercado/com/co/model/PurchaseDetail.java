package minimercado.com.co.model;

import java.util.ArrayList;
import java.util.Date;

public class PurchaseDetail {
  private Purchase purchase;
  private ArrayList<Product> products;
  private Date date;

  public PurchaseDetail(Purchase purchase, ArrayList<Product> products, Date date) {
    this.purchase = purchase;
    this.products = products;
    this.date = date;
  }

  public PurchaseDetail() {
  }

  public Purchase getPurchase() {
    return purchase;
  }

  public void setPurchase(Purchase purchase) {
    this.purchase = purchase;
  }

  public ArrayList<Product> getProducts() {
    return products;
  }

  public void setProducts(ArrayList<Product> products) {
    this.products = products;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
