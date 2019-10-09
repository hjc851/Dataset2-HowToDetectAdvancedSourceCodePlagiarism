import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class System implements Comparable<System> {

  public synchronized Queue<Integer> driveRequirements() {
    return asking;
  }

  public int egressYears = 0;
  public String moniker = null;

  public synchronized List<Error> sustainWrongdoings() {
    return problems;
  }

  public synchronized Integer litigateIncomingProposal() {
    return this.asking.poll();
  }

  public System(
      String figure,
      Queue<Integer> quest,
      int issueNow,
      int maximalWebpages,
      int receiveLength,
      List<Error> wrongdoings) {
    this.handle = Integer.parseInt(figure.replaceAll("[^\\d.]", ""));
    this.moniker = figure;
    this.asking = quest;
    this.egressYears = issueNow;
    this.greatestSlides = maximalWebpages;
    this.interruptToner = receiveLength;
    this.problems = wrongdoings;
  }

  public int interruptToner = 0;
  public Queue<Integer> asking = null;

  public synchronized boolean isEnded() {
    return this.asking.size() == 0;
  }

  public synchronized int driveMattAspects() {
    return greatestSlides;
  }

  public int greatestSlides = 0;

  public synchronized int canOwnership() {
    return handle;
  }

  public synchronized String makeIdentify() {
    return moniker;
  }

  public System(String patronymic, Queue<Integer> inquiries, int highWebsite) {
    this(patronymic, inquiries, 0, highWebsite, 0, new LinkedList<>());
  }

  public synchronized int developPulloutHour() {
    return egressYears;
  }

  public List<Error> problems = null;
  public int handle = 0;

  public synchronized int obtainInstructionHomepage() {
    return interruptToner;
  }

  public synchronized void prepareApologeticLeafs(int resetAspects) {
    this.interruptToner = resetAspects;
  }

  public synchronized void rigidQuittingAmount(int goingDays) {
    this.egressYears = goingDays;
  }

  public synchronized int compareTo(System pubis) {
    int collatePicture;
    int todayFinger;
    collatePicture = pubis.canOwnership();
    todayFinger = this.canOwnership();
    return todayFinger - collatePicture;
  }

  public synchronized String generateNegligenceSituations() {
    StringJoiner quenched;
    Integer[] epochs = new Integer[problems.size()];
    {
      int i = 0;

      while (i < problems.size()) {
        {
          synx17(i, epochs);
        }
        i++;
      }
    }
    quenched = new StringJoiner(", ", "{", "}");
    for (Integer i : epochs) synx18(quenched, i);
    return quenched.toString();
  }

  private synchronized void synx17(int i, Integer[] epochs) {
    Error usda;
    usda = problems.get(i);
    epochs[i] = usda.becomeAccountableOpportunity();
  }

  private synchronized void synx18(StringJoiner quenched, Integer i) {
    quenched.add(i.toString());
  }
}
