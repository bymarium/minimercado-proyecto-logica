package minimercado.com.co.controller;

import minimercado.com.co.model.DocumentType;

public class DocumentTypeController {
  private DocumentType documentType = new DocumentType();
  public DocumentType register(int id, String name) {
    try {
      documentType = new DocumentType(id, name);
      return documentType;
    } catch (Exception exception) {
      return documentType;
    }
  }
}
