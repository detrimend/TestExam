import java.util.ArrayList;

public class SiteCollection
{
  private int size;
  private static int MAX_SITES =25;
  private ArrayList<Website> websites;

  public SiteCollection()
  {
    websites = new ArrayList<Website>(websites);
  }

  public void addSite(website site)
  {
    websites.add(site)
  }

  public boolean contains(Website site)
  {
    for(i=0, i<size,i++)
    {
      if (websites.get(i).equals(site))
      {
        return true;
      }

    }
    return false;
  }
}
