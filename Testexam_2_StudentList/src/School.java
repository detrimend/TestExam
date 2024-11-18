import java.util.Objects;

public class School extends Education
{
  private String type;
  public static final String INFANT_SCHOOL = "Infant school";
  public static final String JUNIOR_SCHOOL = "Junior school";
  public static final String SECONDARY_SCHOOL = "Secondary school";
  public static final String HIGH_SCHOOL = "High school";

  public School(String code, String title, String type)
  {
    super(code, title);
    this.type = type;
  }

  public String getSchoolType()
  {
    return type;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    School school = (School) o;
    return Objects.equals(type, school.type);
  }

  @Override public String toString()
  {
    return "School{" + "type='" + type + '\'' + '}';
  }
}
