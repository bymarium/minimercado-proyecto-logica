package minimercado.com.co.controller;

import minimercado.com.co.model.DocumentType;
import minimercado.com.co.model.LineProduct;

import java.util.ArrayList;
import java.util.Date;

abstract class PersonController {
  abstract String search(String document);
  abstract String list();
  abstract boolean delete(String document);
}
