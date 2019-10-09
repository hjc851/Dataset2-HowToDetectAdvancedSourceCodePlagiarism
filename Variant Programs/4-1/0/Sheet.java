public class Sheet {
  private int card;
  private int specialLitigate;
  private int tile;

  public Sheet(int identification, int instructionOutgrowth, int line) {
    this.card = identification;
    this.specialLitigate = instructionOutgrowth;
    this.tile = line;
  }

  public int letIdentification() {
    return card;
  }

  public int startMoveMechanism() {
    return specialLitigate;
  }

  public int receiveBarred() {
    return tile;
  }

  public void increasesBuffet() {
    this.tile++;
  }

  public void adjustBuffet() {
    this.tile = 0;
  }
}
