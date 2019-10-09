public class Pei {
  private int enumerateCultivators;

  public Pei(String islaCite, int quantityBreeders) {
    this.peiConstitute = (islaCite);
    this.enumerateCultivators = (quantityBreeders);
  }

  public synchronized void opens() {

    for (int i = 0; i < enumerateCultivators; i++) {
      new Thread(new Agricultural((peiConstitute + "_Farmer" + (i + 1)))).start();
    }
  }

  private String peiConstitute;
}
