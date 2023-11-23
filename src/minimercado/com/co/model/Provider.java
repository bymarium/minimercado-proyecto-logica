package minimercado.com.co.model;

public class Provider extends Person {
  private String address;
  private String city;
  private LineProduct lineProduct;

  public Provider(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, String address, String city, LineProduct lineProduct) {
    super(documentType, document, name, lastName, phone, cellPhone, email);
    this.address = address;
    this.city = city;
    this.lineProduct = lineProduct;
  }

  public Provider() {

  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public LineProduct getLineProduct() {
    return lineProduct;
  }

  public void setLineProduct(LineProduct lineProduct) {
    this.lineProduct = lineProduct;
  }
}
