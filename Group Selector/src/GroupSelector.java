import java.util.*;
import java.io.*;
public class GroupSelector
	{
	static int k;
	static int groupNumber;
	static ArrayList <Group> group;
	static ArrayList<BuildRoster> roster = new ArrayList<BuildRoster>();
	public static void main(String[] args) throws IOException
		{
		makeRoster();
		makeGroups();
		
		//sortGroupsAlphabetically();
		//printGroups();
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
		Collections.sort(roster, new ScoreSorter());
		}
	
	private static void makeGroups()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello how many groups would you like?");
		groupNumber = userInput.nextInt();
		for (k = 1; k <= groupNumber; k++)
			{
			fillGroups();
			}
		}

	private static void fillGroups()
		{
		int groupFinder = k - 1;
		group = new ArrayList<Group>();
		String first = roster.get(groupFinder).getFirstName();
		String last = roster.get(groupFinder).getLastName();
		if (groupFinder < roster.size())
			{
			group.add(new Group (first, last));
			groupFinder += groupNumber;
			fillGroups();
			}
		else 
			{
			System.out.println("Group " + k);
			System.out.println("");
			for (int i = 0; i < group.size(); i++)
				{
				System.out.println(group.get(i).getFirstNameGroup() + " " + group.get(i).getLastNameGroup());
				}
			}
		}
	
	private static void sortGroupsAlphabetically()
		{
		for(int i = 0; i < groups.size(); i++)
			{
				groups.get(i).getLastName()
				
				
				Collections.sort(groups.get(i));
			}
		}

	private static void printGroups()
		{
		// TODO Auto-generated method stub
		
		}

	}
