public class BathRoom extends RoomWithPlumbing
{
  private boolean hasShower;

  public BathRoom(double size, boolean hasShower)
  {
    super("Bathroom", size, true);
    this.hasShower = hasShower;
  }
}
