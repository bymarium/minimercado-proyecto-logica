package minimercado.com.co.view;

import minimercado.com.co.controller.ClientController;
import minimercado.com.co.controller.DocumentTypeController;
import minimercado.com.co.model.DocumentType;
import minimercado.com.co.utils.Misc;

import java.util.Date;

public class ClientView {
  public ClientController clientController = new ClientController();

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
      Date birthdate = Misc.getDate("Ingrese la fecha de cumpleaños ('DD/MM/YYYY'): ");
      String optionFrequent = Misc.optionsSelector("¿Es cliente frecuente?", new String[]{"Si", "No"});
      boolean isFrequent = optionFrequent.equals("Si");

      boolean result = clientController.register(documentType, document, name, lastName, phone, cellPhone, email, birthdate, isFrequent);
      if (result) {
        Misc.showMessage("¡El cliente se ha registrado exitosamente!");
      } else {
        Misc.showMessage("¡No se ha podido registrar el cliente, intentelo nuevamente!");
      }

      register = Misc.getString("¿Desea registrar otro cliente? S/N: ").toUpperCase().charAt(0);
    } while (register == 'S');

  }

  public void search() {
    String document = Misc.getString("Ingrese el numero de documento del cliente al cual desea consultar sus datos: ");

    String result = clientController.search(document);
    Misc.showMessage(result);
  }

  public void update() {
    String currentDocument = Misc.getString("Ingrese el numero de documento del cliente al cual desea actualizar sus datos: ");

    if (!clientController.list().startsWith("¡No hay")) {
      if (!clientController.search(currentDocument).startsWith("¡Cliente no ")) {
        Misc.showMessage("A continuacion ingrese los datos actualizados del cliente");

        String typeDocument = Misc.optionsSelector("Seleccione el tipo de documento: ", new String[]{"Cedula de ciudadania", "Tarjeta de identidad", "Nit", "Pasaporte"});
        DocumentTypeController documentTypeController = new DocumentTypeController();
        DocumentType documentType = documentTypeController.register(1, typeDocument);
        String document = Misc.getString("Ingrese el numero de documento: ");
        String name = Misc.getString("Ingrese el nombre: ");
        String lastName = Misc.getString("Ingrese el apellido: ");
        String phone = Misc.getString("Ingrese el numero de telefono: ");
        String cellPhone = Misc.getString("Ingrese el numero de celular: ");
        String email = Misc.getString("Ingrese el correo electronico: ");
        Date birthdate = Misc.getDate("Ingrese la fecha de cumpleaños ('DD/MM/YYYY'): ");


        String optionFrequent = Misc.optionsSelector("¿Es cliente frecuente?", new String[]{"Si", "No"});
        boolean isFrequent = optionFrequent.equals("Si");

        boolean result = clientController.update(currentDocument, documentType, document, name, lastName, phone, cellPhone, email, birthdate, isFrequent);

        if (result) {
          Misc.showMessage("¡El cliente se ha actualizado exitosamente!");
        } else {
          Misc.showMessage("¡No se ha podido actualizar el cliente, intentelo nuevamente!");
        }
      } else {
        Misc.showMessage("¡Cliente no encontrado, el numero de documento ingresado no coincide con los datos guardados!");
      }
    } else {
      Misc.showMessage("¡No hay registro de clientes!");
    }
  }

  public void list() {
    String listClients = clientController.list();
    Misc.showMessage(listClients);
  }

  public void delete() {
    String document = Misc.getString("Ingrese el numero de documento del cliente que desea eliminar: ");


    if (!clientController.list().startsWith("¡No hay")) {
      if (!clientController.search(document).startsWith("¡Cliente no ")) {
        if (clientController.delete(document)) {
          Misc.showMessage("¡Cliente eliminado satisfactoriamente!");
        } else {
          Misc.showMessage("¡No se ha podido eliminar el cliente, intentelo nuevamente!");
        }
      } else {
        Misc.showMessage("¡Cliente no encontrado, el numero de documento ingresado no coincide con los datos guardados!");
      }
    } else {
      Misc.showMessage("¡No hay registro de clientes!");
    }


  }
}
