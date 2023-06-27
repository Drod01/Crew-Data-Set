import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fleet {
    private String name;
    private ArrayList<Starship> starships;

    public Fleet(String name, ArrayList<Starship> starships) {
        this.name = name;
        this.starships = starships;
    }

    public Fleet(String name) {
        this.name = name;
        this.starships = new ArrayList<Starship>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Starship> getStarships() {
        return starships;
    }

    public void setStarships(ArrayList<Starship> starships) {
        this.starships = starships;
    }

    public int getSizeOfFleet() {
        return starships.size();
    }

    public void addStarship(Starship starship) {
        starships.add(starship);
    }

    public void loadStarships(String directoryName) throws FileNotFoundException {
        File directory = new File(directoryName);
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                Scanner scanner = new Scanner(file);
                String name = scanner.nextLine();
                String registry = scanner.nextLine();
                String shipClass = scanner.nextLine();
                Starship starship = new Starship(name, registry, shipClass);
                while (scanner.hasNextLine()) {
                    String crewMemberInfo = scanner.nextLine();
                    String[] crewMemberFields = crewMemberInfo.split(",");
                    String crewMemberName = crewMemberFields[0];
                    String crewMemberPosition = crewMemberFields[1];
                    String crewMemberRank = crewMemberFields[2];
                    String crewMemberSpecies = crewMemberFields[3];
                    CrewMember crewMember = new CrewMember(crewMemberName, crewMemberPosition, crewMemberRank, crewMemberSpecies);
                    starship.addCrewMember(crewMember);
                }
                starships.add(starship);
                scanner.close();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fleet name: " + name + "\n");
        for (Starship starship : starships) {
            sb.append(starship.toString() + "\n");
        }
        return sb.toString();
    }
}
