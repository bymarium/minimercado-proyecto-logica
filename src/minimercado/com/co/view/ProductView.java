package minimercado.com.co.view;

import minimercado.com.co.controller.ClientController;
import minimercado.com.co.controller.DocumentTypeController;
import minimercado.com.co.controller.LineProductController;
import minimercado.com.co.controller.ProductController;
import minimercado.com.co.model.DocumentType;
import minimercado.com.co.model.LineProduct;
import minimercado.com.co.utils.Misc;

import java.util.Date;

public class ProductView {
  private static ProductController productController = new ProductController();

  public void register() {
    char register;
    do {
      String code = Misc.getString("Ingrese el codigo: ");
      String name = Misc.getString("Ingrese el nombre: ");
      String description = Misc.getString("Ingrese la descripcion: ");
      Float price = Misc.getFloat("Ingrese el precio: ");
      int quantity = Misc.getInteger("Ingrese la cantidad: ");
      String selectLineProduct= Misc.optionsSelector("Seleccione la linea de productos que vende: ", new String[]{"Linea de hogar", "Linea de aseo", "Linea de aseo personal", "Linea de fritas y verduras", "Linea de abarrotes", "Linea de confiteria"});
      LineProductController lineProductController = new LineProductController();
      LineProduct lineProduct = lineProductController.register(1, selectLineProduct);

      boolean result = productController.register(code, name, description, price, quantity, lineProduct);
      if (result) {
        Misc.showMessage("¡El producto se ha registrado exitosamente!");
      } else {
        Misc.showMessage("¡No se ha podido registrar el producto, intentelo nuevamente!");
      }

      register = Misc.getString("¿Desea registrar otro producto? S/N: ").toUpperCase().charAt(0);
    } while (register == 'S');

  }

  public void search() {
    String code = Misc.getString("Ingrese el numero de codigo del producto al cual desea consultar sus datos: ");

    String result = productController.search(code);
    if (result != null && !result.isEmpty()) {
      Misc.showMessage(result);
    }
  }

  public void update() {
    String currentCode = Misc.getString("Ingrese el numero de codigo del producto al cual desea actualizar sus datos: ");

    String search = productController.search(currentCode);
    if (search.equals(currentCode)) {
      Misc.showMessage("A continuacion ingrese los datos actualizados del producto");

      String code = Misc.getString("Ingrese el codigo: ");
      String name = Misc.getString("Ingrese el nombre: ");
      String description = Misc.getString("Ingrese la descripcion: ");
      Float price = Misc.getFloat("Ingrese el precio: ");
      int quantity = Misc.getInteger("Ingrese la cantidad: ");
      String selectLineProduct= Misc.optionsSelector("Seleccione la linea de productos que vende: ", new String[]{"Linea de hogar", "Linea de aseo", "Linea de aseo personal", "Linea de fritas y verduras", "Linea de abarrotes", "Linea de confiteria"});
      LineProductController lineProductController = new LineProductController();
      LineProduct lineProduct = lineProductController.register(1, selectLineProduct);

      boolean result = productController.register(code, name, description, price, quantity, lineProduct);
      if (result) {
        Misc.showMessage("¡El producto se ha registrado exitosamente!");
      } else {
        Misc.showMessage("¡No se ha podido registrar el producto, intentelo nuevamente!");
      }
    } else {
      Misc.showMessage("¡No hay registro de clientes!");
    }
  }

  public void list() {
    String listProducts = productController.list();
    Misc.showMessage(listProducts);
  }

  public void delete() {
    String code = Misc.getString("Ingrese el numero de codigo del producto que desea eliminar: ");

    String search = productController.search(code);
    if (search == null && search.isEmpty()) {
      Misc.showMessage("¡No hay productos para listar!");
    }

    if (productController.delete(code)) {
      Misc.showMessage("¡Producto eliminado satisfactoriamente!");
    } else {
      Misc.showMessage("¡No se ha podido eliminar el producto!");
    }

  }
}
