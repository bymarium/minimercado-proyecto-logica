package minimercado.com.co.controller;

import minimercado.com.co.model.DocumentType;
import minimercado.com.co.model.LineProduct;

import java.util.ArrayList;

public class ProviderController extends PersonController{

  boolean register(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, String address, String city, ArrayList<LineProduct> lineSale) {
    return false;
  }

  @Override
  String search(String document) {
    return null;
  }

  boolean update(String currentDocument, DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, String address, String city, ArrayList<LineProduct> lineSale) {
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
