public class BuildRoster implements java.lang.Comparable<BuildRoster>
	{
	private String firstName;
	private String lastName;
	private double grade;
	
	public BuildRoster (String fn, String ln, double v)
		{
		firstName = fn;
		lastName = ln;
		grade = v;
		}

	public String getFirstName()
		{
		return firstName;
		}

	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}

	public String getLastName()
		{
		return lastName;
		}

	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}

	public double getGrade()
		{
		return grade;
		}

	public void setGrade(double grade)
		{
		this.grade = grade;
		}

	@Override
	public int compareTo(BuildRoster arg0)
		{
		// TODO Auto-generated method stub
		return 0;
		}	
	
	}
