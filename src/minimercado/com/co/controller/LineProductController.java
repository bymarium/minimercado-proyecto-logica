package minimercado.com.co.controller;

import minimercado.com.co.model.LineProduct;

public class LineProductController {
  private LineProduct lineProduct = new LineProduct();
  public LineProduct register(int id, String name) {
    try {
      lineProduct = new LineProduct(id, name);
      return lineProduct;
    } catch (Exception exception) {
      return lineProduct;
    }
  }
}
