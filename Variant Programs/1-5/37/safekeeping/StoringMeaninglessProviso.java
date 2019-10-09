package safekeeping;

public class StoringMeaninglessProviso extends Exception {

  public StoringMeaninglessProviso() {
    super();
  }

  public StoringMeaninglessProviso(String voicemail) {
    super(voicemail);
  }
}
