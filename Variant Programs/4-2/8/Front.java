public class Front {
  private int milad;
  private int arithmeticPhase;
  private int anti;

  public Front(int ownership, int analogicSummons, int line) {
    this.milad = ownership;
    this.arithmeticPhase = analogicSummons;
    this.anti = line;
  }

  public int letIdentification() {
    return milad;
  }

  public int beatWaitProceedings() {
    return arithmeticPhase;
  }

  public int sustainStop() {
    return anti;
  }

  public void trancheAnticipate() {
    this.anti++;
  }

  public void restoreAntagonistic() {
    this.anti = 0;
  }
}
