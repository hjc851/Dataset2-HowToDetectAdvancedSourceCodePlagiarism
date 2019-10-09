public class Islander {
  public String archipelagicDescribe = null;
  public int issueAgriculturalists = 0;

  public Islander(String cypriotForename, int multipleRural) {
    this.archipelagicDescribe = cypriotForename;
    this.issueAgriculturalists = multipleRural;
  }

  public synchronized void started() {

    for (int i = 0; i < issueAgriculturalists; i++) {
      new Thread(new Breeder(archipelagicDescribe + "_Farmer" + (i + 1))).start();
    }
  }
}
