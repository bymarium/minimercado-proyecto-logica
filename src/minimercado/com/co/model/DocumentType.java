package minimercado.com.co.model;

public class DocumentType {
  private int id;
  private String name;

  public DocumentType(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public DocumentType() {
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
