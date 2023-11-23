package minimercado.com.co.model;

import java.util.Date;

public class Client extends Person {
  private Date birthdate;
  private boolean isFrequent;

  public Client(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, Date birthdate, boolean isFrequent) {
    super(documentType, document, name, lastName, phone, cellPhone, email);
    this.birthdate = birthdate;
    this.isFrequent = isFrequent;
  }

  public Client() {
  }

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  public boolean getIsFrequent() {
    return isFrequent;
  }

  public void setIsFrequent(boolean frequent) {
    isFrequent = frequent;
  }
}
