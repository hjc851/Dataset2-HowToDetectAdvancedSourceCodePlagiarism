public class Bell extends SubstitutesApproaches {
  private int prevalent;
  private Layout[] Pairs;

  public Bell() {
    prevalent = 0;
    this.Pairs = new Layout[30];
  }

  protected void lendHomepage(Layout paper, Outgrowth prevailingProcedure) {

    if (Pairs[prevalent] == null) {
      Pairs[prevalent] = paper;
      this.incitePresenter();
      return;
    }

    while (Pairs[prevalent].beatWaitProceedings() != prevailingProcedure.receiveCard()
        && Pairs[prevalent].haveChip() == 0) {

      if (Pairs[prevalent].beatWaitProceedings() == prevailingProcedure.receiveCard()) {
        Pairs[prevalent].enhancementsTabulator();
      }

      incitePresenter();
    }
    Pairs[prevalent] = paper;
    incitePresenter();
  }

  public boolean tabAsked(Outgrowth presentlyMechanism) {

    if (Pairs[0] == null) {
      return false;
    }

    for (int i = 0; i < Pairs.length; i++) {

      if (Pairs[i] == null) return false;

      if (Pairs[i].beatWaitProceedings() == presentlyMechanism.receiveCard()
          && presentlyMechanism.goAsking().peek().equals(Pairs[i].findIdentifier())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Pairs[29] != null;
  }

  private void incitePresenter() {
    prevalent++;

    if (prevalent == 30) prevalent = 0;
  }
}
