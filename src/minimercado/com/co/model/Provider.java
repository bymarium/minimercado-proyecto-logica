package minimercado.com.co.model;

public class Provider extends Person {
  private String address;
  private String city;

  public Provider(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, String address, String city) {
    super(documentType, document, name, lastName, phone, cellPhone, email);
    this.address = address;
    this.city = city;
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
}
