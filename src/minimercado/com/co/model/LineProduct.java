package minimercado.com.co.model;

public class LineProduct {
  private int id;
  private String name;

  public LineProduct(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public LineProduct() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
