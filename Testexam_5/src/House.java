public class House
{
  private Room[] rooms;

  public House(Room[] rooms)
  {
    this.rooms = new Room[rooms.length];
    for(int i = 0; i < rooms.length; i++)
    {
      this.rooms[i] = rooms[i].copy();
    }
  }

  public double getTotalSize()
  {
    double totalSize = 0;
    for(int i = 0; i < rooms.length; i++)
    {
      totalSize += rooms[i].getSize();
    }
    return totalSize;
  }

  public void rebuildRoom(int index, Room room)
  {
    rooms[index] = room.copy();
  }


}
