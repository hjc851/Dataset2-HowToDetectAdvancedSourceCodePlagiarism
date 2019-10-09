public class Paper {
  private int card;
  private int addSue;
  private int line;

  public Paper(int identifier, int homileticProceeding, int rest) {
    this.card = identifier;
    this.addSue = homileticProceeding;
    this.line = rest;
  }

  public int letIdentification() {
    return card;
  }

  public int sustainRetrieveMethods() {
    return addSue;
  }

  public int goAct() {
    return line;
  }

  public void salarySideboard() {
    this.line++;
  }

  public void restoreAntagonistic() {
    this.line = 0;
  }
}
