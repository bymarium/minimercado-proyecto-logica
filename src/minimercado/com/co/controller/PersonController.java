package minimercado.com.co.controller;

import minimercado.com.co.model.DocumentType;

abstract class PersonController {
  abstract boolean register(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email);
  abstract String search(String document);
  abstract boolean update(String currentDocument, DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email);
  abstract String list();
  abstract boolean delete(String document);
}
