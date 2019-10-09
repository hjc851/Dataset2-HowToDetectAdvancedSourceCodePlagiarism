package store;

public class EntrepotBrimmingOutlier extends Exception {

  public EntrepotBrimmingOutlier(String letters) {
    super(letters);
  }

  public EntrepotBrimmingOutlier() {
    super();
  }

  static final double upstreamBorder = 0.7242031618092498;
}
