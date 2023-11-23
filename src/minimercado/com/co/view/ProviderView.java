package minimercado.com.co.view;

import minimercado.com.co.controller.DocumentTypeController;
import minimercado.com.co.controller.LineProductController;
import minimercado.com.co.controller.ProviderController;
import minimercado.com.co.model.DocumentType;
import minimercado.com.co.model.LineProduct;
import minimercado.com.co.utils.Misc;

public class ProviderView {
  private static ProviderController providerController = new ProviderController();

  public void register() {
    char register;
    do {
      String typeDocument = Misc.optionsSelector("Seleccione el tipo de documento: ", new String[]{"Cedula de ciudadania", "Tarjeta de identidad", "Nit", "Pasaporte"});
      DocumentTypeController documentTypeController = new DocumentTypeController();
      DocumentType documentType = documentTypeController.register(1, typeDocument);
      String document = Misc.getString("Ingrese el numero de documento: ");
      String name = Misc.getString("Ingrese el nombre: ");
      String lastName = Misc.getString("Ingrese el apellido: ");
      String phone = Misc.getString("Ingrese el numero de telefono: ");
      String cellPhone = Misc.getString("Ingrese el numero de celular: ");
      String email = Misc.getString("Ingrese el correo electronico: ");
      String address = Misc.getString("Ingrese su direccion: ");
      String city = Misc.getString("Ingrese su ciudad: ");
      String selectLineProduct= Misc.optionsSelector("Seleccione la linea de productos que vende: ", new String[]{"Linea de hogar", "Linea de aseo", "Linea de aseo personal", "Linea de fritas y verduras", "Linea de abarrotes", "Linea de confiteria"});
      LineProductController lineProductController = new LineProductController();
      LineProduct lineProduct = lineProductController.register(1, selectLineProduct);

      boolean result = providerController.register(documentType, document, name, lastName, phone, cellPhone, email, address, city, lineProduct);
      if (result) {
        Misc.showMessage("¡El proveedor se ha registrado exitosamente!");
      } else {
        Misc.showMessage("¡No se ha podido registrar el proveedor, intentelo nuevamente!");
      }

      register = Misc.getString("¿Desea registrar otro proveedor? S/N: ").toUpperCase().charAt(0);
    } while (register == 'S');

  }

  public void search() {
    String document = Misc.getString("Ingrese el numero de documento del proveedor al cual desea consultar sus datos: ");

    String result = providerController.search(document);
    if (result != null && !result.isEmpty()) {
      Misc.showMessage(result);
    }
  }

  public void update() {
    String currentDocument = Misc.getString("Ingrese el numero de documento del proveedor al cual desea actualizar sus datos: ");

    String search = providerController.search(currentDocument);
    if (search.equals(currentDocument)) {
      Misc.showMessage("A continuacion ingrese los datos actualizados del proveedor");

      String typeDocument = Misc.optionsSelector("Seleccione el tipo de documento: ", new String[]{"Cedula de ciudadania", "Tarjeta de identidad", "Nit", "Pasaporte"});
      DocumentTypeController documentTypeController = new DocumentTypeController();
      DocumentType documentType = documentTypeController.register(1, typeDocument);
      String document = Misc.getString("Ingrese el numero de documento: ");
      String name = Misc.getString("Ingrese el nombre: ");
      String lastName = Misc.getString("Ingrese el apellido: ");
      String phone = Misc.getString("Ingrese el numero de telefono: ");
      String cellPhone = Misc.getString("Ingrese el numero de celular: ");
      String email = Misc.getString("Ingrese el correo electronico: ");
      String address = Misc.getString("Ingrese su direccion: ");
      String city = Misc.getString("Ingrese su ciudad: ");
      String selectLineProduct= Misc.optionsSelector("Seleccione la linea de productos que vende: ", new String[]{"Linea de hogar", "Linea de aseo", "Linea de aseo personal", "Linea de fritas y verduras", "Linea de abarrotes", "Linea de confiteria"});
      LineProductController lineProductController = new LineProductController();
      LineProduct lineProduct = lineProductController.register(1, selectLineProduct);

      boolean result = providerController.update(currentDocument, documentType, document, name, lastName, phone, cellPhone, email, address, city, lineProduct);

      if (result) {
        Misc.showMessage("¡El proveedor se ha actualizado exitosamente!");
      } else {
        Misc.showMessage("¡No se ha podido actualizar el proveedor, intentelo nuevamente!");
      }
    } else {
      Misc.showMessage("¡No hay registro de proveedores!");
    }
  }

  public void list() {
    String listProviders = providerController.list();
    Misc.showMessage(listProviders);
  }

  public void delete() {
    String document = Misc.getString("Ingrese el numero de documento del proveedor que desea eliminar: ");

    String search = providerController.search(document);
    if (search == null || search.isEmpty()) {
      Misc.showMessage("¡No hay proveedores para listar!");
    }

    if (providerController.delete(document)) {
      Misc.showMessage("¡Proveedor eliminado satisfactoriamente!");
    } else {
      Misc.showMessage("¡No se ha podido eliminar el proveedor!");
    }

  }
}
