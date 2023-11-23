package minimercado.com.co.view;

import minimercado.com.co.controller.*;
import minimercado.com.co.model.Client;
import minimercado.com.co.model.Product;
import minimercado.com.co.utils.Misc;

public class SaleView {
  private final SaleController saleController = new SaleController();
  private ClientController clientController;
  private ProductController productController;

  public SaleView(ClientController clientController, ProductController productController) {
    this.clientController = clientController;
    this.productController = productController;
  }

  public void makeSale() {
    if (this.clientController.list().startsWith("¡No hay")) {
      Misc.showMessage("¡No hay clientes registrados, por lo tanto, no se puede realizar la compra!");
    } else {
      String clientMessage = "Ingrese el documento del cliente que va a relizar la compra: \n" + this.clientController.list();
      String clientDocument = Misc.getString(clientMessage);

      Client client = clientController.getByDocument(clientDocument);

      if (client == null) {
        Misc.showMessage("¡El cliente que ingresaste no existe!");
      } else {
        saleController.addClient(client);

        boolean wantContinue;
        do {
          String productsMessage = "Ingrese el codigo del producto que desea agregar: \n" + this.productController.list();
          String productCode = Misc.getString(productsMessage);
          Product product = productController.getByCode(productCode);
          product.setQuantity(Misc.getInteger("Ingresa la cantidad que vas a comprar de " + product.getName()));
          saleController.addProduct(product);
          wantContinue = Misc.getString("¿Desea agregar otro producto? (S/N): ").toUpperCase().startsWith("S");
        } while (wantContinue);
        Misc.showMessage("La compra realizada tiene la siguiente información: \n" + saleController.showSale());
      }
    }
  }
}
