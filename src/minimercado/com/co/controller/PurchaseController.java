package minimercado.com.co.controller;

import minimercado.com.co.model.Product;
import minimercado.com.co.model.Provider;
import minimercado.com.co.model.Purchase;
import minimercado.com.co.model.PurchaseDetail;

public class PurchaseController {  private final PurchaseDetail purchaseDetail = new PurchaseDetail();

  public void addProvider(Provider provider) {
    Purchase purchase = new Purchase(1, provider);
    purchaseDetail.setPurchase(purchase);
  }

  public void addProduct(Product product) {
    purchaseDetail.getProducts().add(product);
  }

  public String showPurchase() {
    String result =  "Proveedor: " + purchaseDetail.getPurchase().getProvider().getName() + " " + purchaseDetail.getPurchase().getProvider().getLastName() + "\n";
    float totalPrice = 0;
    for (Product product: this.purchaseDetail.getProducts()) {
      totalPrice += product.getPrice() * product.getQuantity();
      result += "Producto: " + product.getCode() + " - " + product.getName() + "\n";
    }
    result += "Total a pagar: " + totalPrice;
    return result;
  }

}
