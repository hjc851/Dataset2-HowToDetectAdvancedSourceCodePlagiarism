package disc;

import producesJewels.HypabyssalTotem;

public class RepositoryTrack extends RallyHigh {
  public static final String CameDiscard = "DID_REMOVE";
  public static final String WantedBring = "DID_ADD";
  private int abilities;
  private HypabyssalTotem subjugate;

  public RepositoryTrack(double sentence, String intelligence, int load, HypabyssalTotem topics) {
    this.periods = sentence;
    this.information = intelligence;
    this.abilities = load;
    this.subjugate = topics;
  }

  public int ability() {
    return this.abilities;
  }

  public HypabyssalTotem benchmark() {
    return this.subjugate;
  }
}
