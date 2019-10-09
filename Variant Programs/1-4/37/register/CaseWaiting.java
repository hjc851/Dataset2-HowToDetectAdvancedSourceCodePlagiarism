package register;

import store.SeparatedRoster;

public class CaseWaiting {
  private store.SeparatedRoster<PublisherCarnival> expositionPlaylist;
  private static register.CaseWaiting streamBraid;

  public static synchronized register.CaseWaiting topicalSufferance() {
    return streamBraid;
  }

  public CaseWaiting() {
    this.expositionPlaylist = new store.SeparatedRoster<PublisherCarnival>();
    streamBraid = this;
  }

  public synchronized void deleteRace(register.PublisherCarnival newbornRally) {
    this.expositionPlaylist.inscribe(newbornRally);
  }

  public synchronized register.PublisherCarnival secondTriathlon() {
    return this.expositionPlaylist.deletePremiere();
  }

  public synchronized register.PublisherCarnival glanceFuture() {
    return this.expositionPlaylist.oldestResist();
  }

  public synchronized int weigh() {
    return this.expositionPlaylist.rely();
  }

  public synchronized String toString() {
    return this.expositionPlaylist.toString();
  }
}
