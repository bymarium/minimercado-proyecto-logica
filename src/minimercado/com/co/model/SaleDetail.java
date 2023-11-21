package minimercado.com.co.model;

import java.util.ArrayList;
import java.util.Date;

public class SaleDetail {
  private Sale sale;
  private ArrayList<Product> products;
  private Date date;

  public SaleDetail(Sale sale, ArrayList<Product> products, Date date) {
    this.sale = sale;
    this.products = products;
    this.date = date;
  }

  public SaleDetail() {
  }

  public Sale getSale() {
    return sale;
  }

  public void setSale(Sale sale) {
    this.sale = sale;
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
