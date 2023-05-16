public class Wilder {

  private String firstName;
  private boolean aware;

  public Wilder(String firstName, boolean aware) {
      this.firstName = firstName;
      this.aware = aware;
  }

  public String getName() {
      return this.firstName;
  }

  public void setName(String name) {
      this.firstName = name;
  }

  public boolean isAware() {
      return aware;
  }

  public void setAware(boolean aware) {
      this.aware = aware;
  }

  public String whoAmI() {
      String myName = getName();
      if (isAware()) {
          return "Je m'appelle " + myName + " et je suis aware";
      } else {
          return "Je m'appelle " + myName + " et je ne suis pas aware";
      }
  }
}