import java.util.*;
import java.io.*;
public class GroupSelector
	{
	static int k;
	static int groupNumber;
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
		for (k = 0; k < groupNumber; k++)
			{
			ArrayList <Group> group = new ArrayList<Group>();
			for (int j = k; j < roster.size() - (roster.size() % groupNumber); j = j + groupNumber)
				{
				
				String first = roster.get(j).getFirstName();
				String last = roster.get(j).getLastName();
				group.add(new Group(first, last));
				}
			Collections.sort(roster, new NameSorter());
			for (int o = 0; o < group.size(); o++)
				{
				System.out.println(group.get(o).getFirstNameGroup() + " " + group.get(o).getLastNameGroup());
				}
			System.out.println(" ");
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
