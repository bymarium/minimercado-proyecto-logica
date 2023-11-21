package minimercado.com.co.controller;

import minimercado.com.co.model.DocumentType;

public class ClientController extends PersonController{

  @Override
  boolean register(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email) {
    return false;
  }

  @Override
  String search(String document) {
    return null;
  }

  @Override
  boolean update(String currentDocument, DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email) {
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
