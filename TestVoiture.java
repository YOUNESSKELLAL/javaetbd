public class TestVoiture {

  public static void main(String[] args) {
    Moteur moteur = new Moteur("V6", 200);

    List<Roue> roues = new ArrayList<>();
    roues.add(new Roue(15, 18));
    roues.add(new Roue(15, 18));
    roues.add(new Roue(15, 18));
    roues.add(new Roue(15, 18));

    Voiture voiture = new Voiture("Civic", "Honda", 120, moteur);
    voiture.associerRouesEtMoteur(roues);

    System.out.println(
      "Puissance du moteur associé à la voiture : " +
      voiture.deQuellePuissance()
    );
    voiture.demarre();
    voiture.accelere(5.0);

    Moteur nouveauMoteur = new Moteur("V8", 300);

    voiture.changerLeMoteur(nouveauMoteur);

    System.out.println(
      "Nouvelle puissance du moteur associé à la voiture : " +
      voiture.deQuellePuissance()
    );
  }
}
