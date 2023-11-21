package minimercado.com.co.model;

public class Client extends Person {
  private boolean isFrecuent;

  public Client(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email, boolean isFrecuent) {
    super(documentType, document, name, lastName, phone, cellPhone, email);
    this.isFrecuent = isFrecuent;
  }

  public Client() {
  }

  public boolean getIsFrecuent() {
    return isFrecuent;
  }

  public void setIsFrecuent(boolean frecuent) {
    isFrecuent = frecuent;
  }
}
