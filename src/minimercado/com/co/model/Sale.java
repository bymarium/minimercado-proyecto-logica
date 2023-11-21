package minimercado.com.co.model;

public class Sale {
  private int number;
  private Client client;

  public Sale(int number, Client client) {
    this.number = number;
    this.client = client;
  }

  public Sale() {
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
