package minimercado.com.co.model;

public class Product {
  private String code;
  private String name;
  private String description;
  private float price;
  private int quantity;
  private LineProduct line;

  public Product(String code, String name, String description, float price, int quantity, LineProduct line) {
    this.code = code;
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.line = line;
  }

  public Product() {
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public LineProduct getLine() {
    return line;
  }

  public void setLine(LineProduct line) {
    this.line = line;
  }
}
