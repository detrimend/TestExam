import java.util.ArrayList;

public class UserList
{
  private ArrayList<User> users;

  public UserList()
  {
    this.users = new ArrayList<>();
  }

  public User findAUserWithAccessTo(Website site)
  {
    for (int i=0; i<users.size(); i++)
    {
      SiteCollection accessibleSites = users.get(i).getAccessibleSites();
      if (accessibleSites.contains(site))
      {
        return users.get(i);
      }
    }
    return null;
  }

  public Administrator findFirstAdministrator()
  {
    for (int i=0; i<users.size(); i++)
    {
      if (users.get(i) instanceof Administrator)
      {
        return (Administrator) users.get(i);
      }
    }
    return null;
  }
}
