package minimercado.com.co.model;

import java.util.Date;

public class Client extends Person {
  private Date birthdate;
  private boolean isFrecuent;

  public Client(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, Date birthdate, boolean isFrecuent) {
    super(documentType, document, name, lastName, phone, cellPhone, email);
    this.birthdate = birthdate;
    this.isFrecuent = isFrecuent;
  }

  public Client() {
  }

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  public boolean getIsFrecuent() {
    return isFrecuent;
  }

  public void setIsFrecuent(boolean frecuent) {
    isFrecuent = frecuent;
  }
}
