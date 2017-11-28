import java.util.*;
import java.io.*;
public class GroupSelector
	{
	static ArrayList<BuildRoster> roster = new ArrayList<BuildRoster>();
	public static void main(String[] args) throws IOException
		{
		makeRoster();
		makeGroups();
		sortGroupsAlphabetically();
		printGroups();
		}

	private static void makeRoster() throws IOException
		{
		Scanner file = new Scanner( new File( "roster.txt" ) );
		while (file.hasNextLine())
			{
			String line = file.nextLine();
			String[] array = line.split(" ");
			double num = Double.parseDouble(array[2]);
			roster.add(new BuildRoster (array[0], array[1], num));
			}
		}

	private static void makeGroups()
		{
		// TODO Auto-generated method stub
		
		}

	private static void sortGroupsAlphabetically()
		{
		// TODO Auto-generated method stub
		
		}

	private static void printGroups()
		{
		// TODO Auto-generated method stub
		
		}

	}
