package book;

import producedItems.MinableOppose;

public class WarehouseImmortalize extends book.ForumMemorialize {
  public static final java.lang.String KnowDislodge = "DID_REMOVE";
  public static final java.lang.String ManagedExtend = "DID_ADD";
  private int overcapacity = 0;
  private producedItems.MinableOppose pending = null;

  public WarehouseImmortalize(double moment, String pop, int viability, MinableOppose topic) {
    this.week = moment;
    this.stuff = pop;
    this.overcapacity = viability;
    this.pending = topic;
  }

  public synchronized int size() {
    return this.overcapacity;
  }

  public synchronized producedItems.MinableOppose aim() {
    return this.pending;
  }
}
