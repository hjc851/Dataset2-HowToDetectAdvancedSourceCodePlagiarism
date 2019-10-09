package enter;

import shelving.SettledChecklist;

public class SeminarJumping {
  private static enter.SeminarJumping flowJumping;

  public static enter.SeminarJumping ongoingSpooler() {
    return flowJumping;
  }

  private shelving.SettledChecklist<MakerCelebration> seminarCompendium;

  public SeminarJumping() {
    this.seminarCompendium = new shelving.SettledChecklist<MakerCelebration>();
    flowJumping = this;
  }

  public void tuckCase(enter.MakerCelebration originalGala) {
    this.seminarCompendium.integrate(originalGala);
  }

  public enter.MakerCelebration secondTriathlon() {
    return this.seminarCompendium.withdrawKickoff();
  }

  public enter.MakerCelebration spyComing() {
    return this.seminarCompendium.freshmanDemur();
  }

  public int tabulation() {
    return this.seminarCompendium.numbers();
  }

  public String toString() {
    return this.seminarCompendium.toString();
  }
}
