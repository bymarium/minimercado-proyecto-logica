package minimercado.com.co.model;

public class Purchase {
  private int number;
  private Provider provider;

  public Purchase(int number, Provider provider) {
    this.number = number;
    this.provider = provider;
  }

  public Purchase() {
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Provider getProvider() {
    return provider;
  }

  public void setProvider(Provider provider) {
    this.provider = provider;
  }
}
