public class Moteur {

  private String nom;
  private int puissance;

  public Moteur(String nom, int puissance) {
    this.nom = nom;
    this.puissance = puissance;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setPuissance(int puissance) {
    this.puissance = puissance;
  }

  public String getNom() {
    return nom;
  }

  public int getPuissance() {
    return puissance;
  }
}
