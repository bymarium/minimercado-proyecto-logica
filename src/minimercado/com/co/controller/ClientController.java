package minimercado.com.co.controller;

import minimercado.com.co.model.Client;
import minimercado.com.co.model.DocumentType;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ClientController extends PersonController {
  private ArrayList<Client> clients = new ArrayList<Client>();
  private Client client;

  public boolean register(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, Date birthdate, boolean isFrequent) {
    try {
      client = new Client(documentType, document, name, lastName, phone, cellPhone, email, birthdate, isFrequent);
      this.clients.add(client);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  @Override
  public String search(String document) {
    String result = "¡No hay registro de clientes!";

    for (Client value : this.clients) {
      if (value.getDocument().equals(document)) {
        result = "Datos del cliente consultado: " +
                "\nTipo documento: " + value.getDocumentType().getName() +
                "\nDocumento: " + value.getDocument() +
                "\nNombre: " + value.getName() +
                "\nApellido: " + value.getLastName() +
                "\nTelefono: " + value.getPhone() +
                "\nCelular: " + value.getCellPhone() +
                "\nCorreo: " + value.getEmail() +
                "\nFecha de nacimiento: " + value.getBirthdate() +
                "\n¿Es frecuente?: " + value.getIsFrequent();

        break;
      } else {
        result = "¡Cliente no encontrado, el numero de documento ingresado no coincide con los datos guardados!";
      }
    }
    return result;
  }

  public Client getByDocument(String document) {
    Client client = null;

    for (Client value : this.clients) {
      if (value.getDocument().equals(document)) {
        client = value;
        break;
      }
    }
    return client;
  }

  public boolean update(String currentDocument, DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, Date birthdate, boolean isFrequent) {
    boolean result;

    try {
      for (Client client : this.clients) {
        if (client.getDocument().equals(currentDocument)) {
          client.setDocumentType(documentType);
          client.setDocument(document);
          client.setName(name);
          client.setLastName(lastName);
          client.setPhone(phone);
          client.setCellPhone(cellPhone);
          client.setEmail(email);
          client.setBirthdate(birthdate);
          client.setIsFrequent(isFrequent);

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
    String listClients = "¡No hay clientes para listar!";

    if (!this.clients.isEmpty()) {
      listClients = "Listado de clientes: ";
      for (Client client : this.clients) {
        listClients += "\nTipo documento: " + client.getDocumentType().getName() +
                "\nDocumento: " + client.getDocument() +
                "\nNombre: " + client.getName() +
                "\nApellido: " + client.getLastName() +
                "\nTelefono: " + client.getPhone() +
                "\nCelular: " + client.getCellPhone() +
                "\nCorreo: " + client.getEmail() +
                "\nFecha de nacimiento: " + client.getBirthdate() +
                "\n¿Es frecuente?: " + client.getIsFrequent() + "\n";
      }
    }
    return listClients;
  }

  @Override
  public boolean delete(String document) {
    boolean result = false;

    Iterator<Client> iterator = this.clients.iterator();
    while (iterator.hasNext()) {
      Client client = iterator.next();

      if (client.getDocument().equals(document)) {
        iterator.remove();
        result = true;
        break;
      }
    }
    return result;
  }
}
