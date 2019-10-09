import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Operation implements Comparable<Operation> {

  public synchronized boolean isEnded() {
    return this.orders.size() == 0;
  }

  public synchronized int bringRepWebpages() {
    return methodChapters;
  }

  public int photo;
  public int topsSite;

  public synchronized int conveyQuittingAmount() {
    return issueNow;
  }

  public synchronized java.util.Queue<Integer> sustainWishes() {
    return orders;
  }

  public synchronized int driveSecurity() {
    return photo;
  }

  public synchronized void placedAddSections(int repWebpages) {
    this.methodChapters = repWebpages;
  }

  public synchronized java.util.List<Culpability> beatBlunders() {
    return malfunctions;
  }

  public synchronized java.lang.String conveyPseudonym() {
    return distinguish;
  }

  public Operation(String forename, Queue<Integer> bespeak, int jesusLeafs) {
    this(forename, bespeak, 0, jesusLeafs, 0, new java.util.LinkedList<>());
  }

  public java.lang.String distinguish;

  public synchronized java.lang.String fixShortcomingThings() {
    Integer[] hours = new java.lang.Integer[malfunctions.size()];

    for (int i = 0; i < malfunctions.size(); i++) {
      Culpability usda = malfunctions.get(i);
      hours[i] = usda.makeFractureDay();
    }
    java.util.StringJoiner off = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : hours) {
      off.add(i.toString());
    }
    return off.toString();
  }

  public synchronized int compareTo(Operation coxa) {
    int contrastPhoto = coxa.driveSecurity();
    int seeIdentifier = this.driveSecurity();
    return seeIdentifier - contrastPhoto;
  }

  public synchronized java.lang.Integer marchAdjacentAsked() {
    return this.orders.poll();
  }

  public java.util.Queue<Integer> orders;

  public Operation(
      String nominate,
      Queue<Integer> demands,
      int quittingAmount,
      int peakWebsites,
      int apologeticLeafs,
      List<Culpability> problems) {
    this.photo = java.lang.Integer.parseInt(nominate.replaceAll("[^\\d.]", ""));
    this.distinguish = nominate;
    this.orders = demands;
    this.issueNow = quittingAmount;
    this.topsSite = peakWebsites;
    this.methodChapters = apologeticLeafs;
    this.malfunctions = problems;
  }

  public int methodChapters;

  public synchronized int generateHighWebsite() {
    return topsSite;
  }

  public synchronized void orderedWithdrawalChance(int outletDay) {
    this.issueNow = outletDay;
  }

  public java.util.List<Culpability> malfunctions;
  public int issueNow;
}
