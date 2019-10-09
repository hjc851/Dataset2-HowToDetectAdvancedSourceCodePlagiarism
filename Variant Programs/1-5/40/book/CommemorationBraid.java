package book;

import depository.ClassedDirectory;

public class CommemorationBraid {
  private static book.CommemorationBraid latestWait = null;

  public static synchronized book.CommemorationBraid streamBraid() {
    return latestWait;
  }

  private depository.ClassedDirectory<FabricatorCommemoration> spectacleRegistry = null;

  public CommemorationBraid() {
    this.spectacleRegistry = new depository.ClassedDirectory<FabricatorCommemoration>();
    latestWait = this;
  }

  public synchronized void appendForum(book.FabricatorCommemoration radicalForum) {
    this.spectacleRegistry.inclose(radicalForum);
  }

  public synchronized book.FabricatorCommemoration firstParade() {
    return this.spectacleRegistry.expelOriginal();
  }

  public synchronized book.FabricatorCommemoration seeLater() {
    return this.spectacleRegistry.foremostPreclude();
  }

  public synchronized int number() {
    return this.spectacleRegistry.rely();
  }

  public synchronized String toString() {
    return this.spectacleRegistry.toString();
  }
}
