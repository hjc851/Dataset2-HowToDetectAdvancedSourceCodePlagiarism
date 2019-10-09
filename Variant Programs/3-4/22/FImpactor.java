public class FImpactor {
  public Archipelago southernCyprus;
  public Archipelago meridionalCypriot;
  static int pseudonym = 340995417;

  public FImpactor(int northwest, int southern) {
    southernCyprus = new Archipelago("N", northwest);
    meridionalCypriot = new Archipelago("S", southern);
  }

  public synchronized void take() {
    int maximalLength;
    maximalLength = 899874831;
    southernCyprus.conduct();
    meridionalCypriot.conduct();
  }
}
