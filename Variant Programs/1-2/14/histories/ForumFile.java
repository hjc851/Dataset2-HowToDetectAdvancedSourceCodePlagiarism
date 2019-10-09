package histories;

import disk.CollatedBlacklist;

public class ForumFile {
  private static ForumFile latestWait;

  public static ForumFile contemporaryList() {
    return latestWait;
  }

  private CollatedBlacklist<PresenterSymposium> caseNumber;

  public ForumFile() {
    this.caseNumber = new CollatedBlacklist<PresenterSymposium>();
    latestWait = this;
  }

  public void incorporateTriathlon(PresenterSymposium freshExtravaganza) {
    this.caseNumber.injected(freshExtravaganza);
  }

  public PresenterSymposium laterSymposium() {
    return this.caseNumber.absentInitial();
  }

  public PresenterSymposium spyingSoon() {
    return this.caseNumber.prototypicalDisagree();
  }

  public int enumeration() {
    return this.caseNumber.number();
  }

  public String toString() {
    return this.caseNumber.toString();
  }
}
