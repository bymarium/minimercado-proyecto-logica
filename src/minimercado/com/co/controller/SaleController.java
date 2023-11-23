package minimercado.com.co.controller;

import minimercado.com.co.model.*;

public class SaleController {
  private final SaleDetail saleDetail = new SaleDetail();

  public void addClient(Client client) {
    Sale sale = new Sale(1, client);
    saleDetail.setSale(sale);
  }

  public void addProduct(Product product) {
    saleDetail.getProducts().add(product);
  }

  public String showSale() {
    String result =  "Cliente: " + saleDetail.getSale().getClient().getName() + " " + saleDetail.getSale().getClient().getLastName() + "\n";
    float totalPrice = 0;
    for (Product product: this.saleDetail.getProducts()) {
      totalPrice += product.getPrice() * product.getQuantity();
      result += "Producto: " + product.getCode() + " - " + product.getName() + "\n";
    }
    result += "Total a pagar: " + totalPrice;
    return result;
  }
}
