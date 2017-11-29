import java.util.Comparator;

public class ScoreSorter implements Comparator<BuildRoster>
		{
		public int compare (BuildRoster s1, BuildRoster s2)
		{
		if(s1.getGrade() < s2.getGrade())
		return 1;
		else
		return -1;
		}
		}