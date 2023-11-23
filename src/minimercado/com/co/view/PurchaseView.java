package minimercado.com.co.view;

import minimercado.com.co.controller.ProductController;
import minimercado.com.co.controller.ProviderController;
import minimercado.com.co.controller.PurchaseController;
import minimercado.com.co.model.Product;
import minimercado.com.co.model.Provider;
import minimercado.com.co.utils.Misc;

public class PurchaseView {
  private final PurchaseController purchaseController = new PurchaseController();
  private ProviderController providerController;
  private ProductController productController;

  public PurchaseView(ProviderController providerController, ProductController productController) {
    this.providerController = providerController;
    this.productController = productController;
  }

  public void makePurchase() {
    if (this.providerController.list().startsWith("¡No hay")) {
      Misc.showMessage("¡No hay proveedores registrados, por lo tanto, no se puede reabastecer!");
    } else {
      String providerMessage = "Ingrese el documento del proveedor con el que desea reabastecer la tienda: \n" + this.providerController.list();
      String providerDocument = Misc.getString(providerMessage);

      Provider provider = providerController.getByDocument(providerDocument);

      if (provider == null) {
        Misc.showMessage("¡El proveedor que ingresaste no existe!");
      } else {
        purchaseController.addProvider(provider);

        boolean wantContinue;
        do {
          String productsMessage = "Ingrese el codigo del producto que desea agregar: \n" + this.productController.list();
          String productCode = Misc.getString(productsMessage);
          Product product = productController.getByCode(productCode);
          product.setQuantity(Misc.getInteger("Ingresa la cantidad que vas a comprar de " + product.getName()));
          purchaseController.addProduct(product);
          wantContinue = Misc.getString("¿Desea agregar otro producto? (S/N): ").toUpperCase().startsWith("S");
        } while (wantContinue);
        Misc.showMessage("El reabastecimiento realizado tiene la siguiente información: \n" + purchaseController.showPurchase());
      }
    }
  }
}
