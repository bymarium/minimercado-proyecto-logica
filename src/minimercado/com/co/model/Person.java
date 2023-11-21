package minimercado.com.co.model;

abstract class Person {
  protected DocumentType documentType;
  protected String document;
  protected String name;
  protected String lastName;
  protected String phone;
  protected String cellPhone;
  protected String email;

  public Person(DocumentType documentType, String document, String name, String lastName, String phone, String cellPhone, String email) {
    this.documentType = documentType;
    this.document = document;
    this.name = name;
    this.lastName = lastName;
    this.phone = phone;
    this.cellPhone = cellPhone;
    this.email = email;
  }

  public Person() {
  }

  public DocumentType getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentType documentType) {
    this.documentType = documentType;
  }

  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
