package minimercado.com.co.controller;

import minimercado.com.co.model.DocumentType;
import minimercado.com.co.model.LineProduct;
import minimercado.com.co.model.Provider;

import java.util.ArrayList;
import java.util.Iterator;

public class ProviderController extends PersonController{
  private ArrayList<Provider> providers = new ArrayList<Provider>();
  private Provider provider;
  public boolean register(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, String address, String city, LineProduct lineProduct) {
    try {
      provider = new Provider(documentType, document, name, lastName, phone, cellPhone, email, address, city, lineProduct);
      this.providers.add(provider);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  @Override
  public String search(String document) {
    String result = "¡No hay registro de proveedores!";

    for (Provider value : this.providers) {
      if (value.getDocument().equals(document)) {
        result = "Datos del proveedor consultado: " +
                "\nTipo documento: " + value.getDocumentType().getName() +
                "\nDocumento: " + value.getDocument() +
                "\nNombre: " + value.getName() +
                "\nApellido: " + value.getLastName() +
                "\nTelefono: " + value.getPhone() +
                "\nCelular: " + value.getCellPhone() +
                "\nCorreo: " + value.getEmail() +
                "\nDireccion: " + value.getAddress() +
                "\nCiudad: " + value.getCity() +
                "\nLinea de productos: " + value.getLineProduct().getName();
        break;
      } else {
        result = "¡Proveedor no encontrado, el numero de documento ingresado no coincide con los datos guardados!";
      }
    }
    return result;
  }

  public Provider getByDocument(String document) {
    Provider provider = null;

    for (Provider value : this.providers) {
      if (value.getDocument().equals(document)) {
        provider = value;
        break;
      }
    }
    return provider;
  }

  public boolean update(String currentDocument, DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, String address, String city, LineProduct lineProduct) {
    boolean result;

    try {
      for (Provider provider : this.providers) {
        if (provider.getDocument().equals(currentDocument)) {
          provider.setDocumentType(documentType);
          provider.setDocument(document);
          provider.setName(name);
          provider.setLastName(lastName);
          provider.setPhone(phone);
          provider.setCellPhone(cellPhone);
          provider.setEmail(email);
          provider.setAddress(address);
          provider.setCity(city);
          provider.setLineProduct(lineProduct);

          break;
        }
      }
      result = true;
    } catch (Exception e) {
      result = false;
    }
    return result;
  }

  @Override
  public String list() {
    String listProviders = "¡No hay proveedores para listar!";

    if (!this.providers.isEmpty()) {
      listProviders = "Listado de proveedores: ";
      for (Provider provider : this.providers) {
        listProviders += "\nTipo documento: " + provider.getDocumentType().getName() +
                "\nDocumento: " + provider.getDocument() +
                "\nNombre: " + provider.getName() +
                "\nApellido: " + provider.getLastName() +
                "\nTelefono: " + provider.getPhone() +
                "\nCelular: " + provider.getCellPhone() +
                "\nCorreo: " + provider.getEmail() +
                "\nDireccion: " + provider.getAddress() +
                "\nCiudad: " + provider.getCity() +
                "\nLinea de productos: " + provider.getLineProduct().getName() + "\n";
      }
    }
    return listProviders;
  }

  @Override
  public boolean delete(String document) {
    boolean result = false;

    Iterator<Provider> iterator = this.providers.iterator();
    while (iterator.hasNext()) {
        Provider provider = iterator.next();

      if (provider.getDocument().equals(document)) {
        iterator.remove();
        result = true;
        break;
      }
    }
    return result;
  }
}
