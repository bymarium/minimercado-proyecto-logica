package minimercado.com.co.model;

import java.util.ArrayList;

public class Provider extends Person {
  private String address;
  private String city;
  private ArrayList<LineProduct> lineSale;

  public Provider(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, String address, String city, ArrayList<LineProduct> lineSale) {
    super(documentType, document, name, lastName, phone, cellPhone, email);
    this.address = address;
    this.city = city;
    this.lineSale = lineSale;
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

  public ArrayList<LineProduct> getLineSale() {
    return lineSale;
  }

  public void setLineSale(ArrayList<LineProduct> lineSale) {
    this.lineSale = lineSale;
  }
}
