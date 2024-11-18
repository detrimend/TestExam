import java.util.Objects;

public class Education
{
  private String code;
  private String title;

  public Education(String code, String title)
  {
    this.code = code;
    this.title = title;
  }

  public String getCode()
  {
    return code;
  }

  public String getTitle()
  {
    return title;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    Education education = (Education) o;
    return Objects.equals(code, education.code) && Objects.equals(title,
        education.title);
  }

  @Override public String toString()
  {
    return "Education{" + "code='" + code + '\'' + ", title='" + title + '\''
        + '}';
  }
}
