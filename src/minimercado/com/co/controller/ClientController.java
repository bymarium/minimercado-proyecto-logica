package minimercado.com.co.controller;

import minimercado.com.co.model.DocumentType;

import java.util.Date;

public class ClientController extends PersonController{

  boolean register(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, Date birthdate, boolean isFrecuency) {
    return false;
  }

  @Override
  String search(String document) {
    return null;
  }

  boolean update(String currentDocument, DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, Date birthdate, boolean isFrecuency) {
    return false;
  }

  @Override
  String list() {
    return null;
  }

  @Override
  boolean delete(String document) {
    return false;
  }
}
