public class Room
{
  private String name;
  private double size;

  public Room(String name, double size)
  {
    this.name = name;
    this.size = size;
  }

  public Room copy()
  {
    return new Room(name, size);
  }




}
