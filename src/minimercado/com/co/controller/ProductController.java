package minimercado.com.co.controller;

import minimercado.com.co.model.LineProduct;
import minimercado.com.co.model.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductController {
  private ArrayList<Product> products = new ArrayList<Product>();
  private Product product;
  public boolean register(String code, String name, String description, float price, LineProduct lineProduct) {
    try {
      product = new Product(code, name, description, price, lineProduct);
      this.products.add(product);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  public String search(String code) {
    String result = "¡No hay registro de productos!";

    for (Product value : this.products) {
      if (value.getCode().equals(code)) {
        result = "Datos del producto consultado: " +
                "\nCodigo: " + value.getCode() +
                "\nNombre: " + value.getName() +
                "\nDescripcion: " + value.getDescription() +
                "\nPrecio: " + value.getPrice() +
                "\nLinea de producto: " + value.getLine().getName();

        break;
      } else {
        result = "¡Producto no encontrado, el numero de codigo ingresado no coincide con los datos guardados!";
      }
    }
    return result;
  }

  public Product getByCode(String code) {
    Product product = null;

    for (Product value : this.products) {
      if (value.getCode().equals(code)) {
        product = value;
        break;
      }
    }
    return product;
  }

  public boolean update(String currentCode, String code, String name, String description, float price, LineProduct lineProduct) {
    boolean result;

    try {
      for (Product product : this.products) {
        if (product.getCode().equals(currentCode)) {
          product.setCode(code);
          product.setName(name);
          product.setDescription(description);
          product.setPrice(price);
          product.setLine(lineProduct);

          break;
        }
      }
      result = true;
    } catch (Exception e) {
      result = false;
    }
    return result;
  }

  public String list() {
    String listProducts = "¡No hay clientes para listar!";

    if (!this.products.isEmpty()) {
      listProducts = "Listado de clientes: ";
      for (Product product : this.products) {
        listProducts += "\nCodigo: " + product.getCode() +
                "\nNombre: " + product.getName() +
                "\nDescripcion: " + product.getDescription() +
                "\nPrecio: " + product.getPrice() +
                "\nLinea de producto: " + product.getLine().getName() + "\n";
      }
    }
    return listProducts;
  }

  public boolean delete(String code) {
    boolean result = false;

    Iterator<Product> iterator = this.products.iterator();
    while (iterator.hasNext()) {
      Product product = iterator.next();

      if (product.getCode().equals(code)) {
        iterator.remove();
        result = true;
        break;
      }
    }
    return result;
  }
}
