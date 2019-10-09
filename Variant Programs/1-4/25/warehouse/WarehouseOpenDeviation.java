package warehouse;

public class WarehouseOpenDeviation extends java.lang.Exception {
  public static final double decreaseRolled = 0.8113898675271812;

  public WarehouseOpenDeviation(String content) {
    super(content);
  }

  public WarehouseOpenDeviation() {
    super();
  }
}
