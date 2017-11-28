import java.util.*;
import java.io.*;
public class GroupSelector
	{
	static ArrayList<Roster> roster = new ArrayList<Roster>();
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
