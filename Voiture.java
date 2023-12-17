public class Voiture {

  private String model;
  private String marque;
  private double vitesse;
  private Moteur moteur;
  private List<Roue> roues = new ArrayList<>();

  public Voiture(String model, String marque, double vitesse, Moteur moteur) {
    this.model = model;
    this.marque = marque;
    this.vitesse = vitesse;
    this.moteur = moteur;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getMarque() {
    return marque;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  public double getVitesse() {
    return vitesse;
  }

  public void setVitesse(double vitesse) {
    this.vitesse = vitesse;
  }

  public Moteur getMoteur() {
    return moteur;
  }

  public void associerRouesEtMoteur(List<Roue> roues) {
    if (roues.size() >= 4 && roues.size() <= 5) {
      this.roues = roues.subList(0, 4);
    } else {
      System.out.println("Erreur : Nombre de roues incorrect");
    }
  }

  public int deQuellePuissance() {
    return moteur.getPuissance();
  }

  public void demarre() {
    System.out.println("La voiture démarre.");
  }

  public void accelere(double acceleration) {
    System.out.println("La voiture accélère de " + acceleration + " m/s^2.");
  }

  public void changerLeMoteur(Moteur nouveauMoteur) {
    System.out.println("Changement du moteur...");
    this.moteur = nouveauMoteur;
  }
}
