package minimercado.com.co;

import minimercado.com.co.utils.Misc;
import minimercado.com.co.view.ClientView;
import minimercado.com.co.view.ProductView;
import minimercado.com.co.view.ProviderView;

public class Main {
  public static void main(String[] args) {
    menu();
  }

  public static void menu() {
    int option = Misc.getInteger("Bienvenido a Minimercado Neighborhood Store" + "\n¿Que desea hacer el dia de hoy?" + "\n1. Crud de Cliente" + "\n2. Crud de Proveedor" + "\n3. Crud de Productos" + "\n4. Salir del programa");
    switch (option) {
      case 1:
        menuClient();
        menu();
        break;
      case 2:
        menuProvider();
        menu();
        break;
      case 3:
        menuProduct();
        menu();
        break;
      case 4:
        break;
      default:
        Misc.showMessage("¡Numero invalido!");
        menu();
    }

  }

  public static void menuClient() {
    ClientView clientView = new ClientView();
    int optionClients = Misc.getInteger("CRUD de clientes: " + "\n1. Registrar cliente" + "\n2. Buscar cliente" + "\n3. Actualizar cliente" + "\n4. Listar clientes" + "\n5. Eliminar cliente" + "\n6. Regresar al menu principal");
    switch (optionClients) {
      case 1:
        clientView.register();
        menuClient();
        break;
      case 2:
        clientView.search();
        menuClient();
        break;
      case 3:
        clientView.update();
        menuClient();
        break;
      case 4:
        clientView.list();
        menuClient();
        break;
      case 5:
        clientView.delete();
        menuClient();
        break;
      case 6:
        break;
      default:
        Misc.showMessage("¡Numero invalido!");
        menuClient();
    }
  }

  public static void menuProvider() {
    ProviderView providerView = new ProviderView();
    int optionProviders = Misc.getInteger("CRUD de proveedores: " + "\n1. Registrar proveedor" + "\n2. Buscar proveedor" + "\n3. Actualizar proveedor" + "\n4. Listar proveedores" + "\n5. Eliminar proveedor" + "\n6. Regresar al menu principal");
    switch (optionProviders) {
      case 1:
        providerView.register();
        menuProvider();
        break;
      case 2:
        providerView.search();
        menuProvider();
        break;
      case 3:
        providerView.update();
        menuProvider();
        break;
      case 4:
        providerView.list();
        menuProvider();
        break;
      case 5:
        providerView.delete();
        menuProvider();
        break;
      case 6:
        break;
      default:
        Misc.showMessage("¡Numero invalido!");
        menuClient();
    }
  }

  public static void menuProduct() {
    ProductView productView = new ProductView();
    int optionProducts = Misc.getInteger("CRUD de productos: " + "\n1. Registrar producto" + "\n2. Buscar producto" + "\n3. Actualizar producto" + "\n4. Listar productos" + "\n5. Eliminar producto" + "\n6. Regresar al menu principal");
    switch (optionProducts) {
      case 1:
        productView.register();
        menuProduct();
        break;
      case 2:
        productView.search();
        menuProduct();
        break;
      case 3:
        productView.update();
        menuProduct();
        break;
      case 4:
        productView.list();
        menuProduct();
        break;
      case 5:
        productView.delete();
        menuProduct();
        break;
      case 6:
        break;
      default:
        Misc.showMessage("¡Numero invalido!");
        menuClient();
    }
  }

}