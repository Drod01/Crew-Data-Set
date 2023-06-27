import java.util.ArrayList;

public class Starship {
    private String name;
    private String registry;
    private String starshipClass;
    private ArrayList<CrewMember> crewMembers;

    public Starship(String name, String registry, String starshipClass) {
        this.name = name;
        this.registry = registry;
        this.starshipClass = starshipClass;
        this.crewMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getStarshipClass() {
        return starshipClass;
    }

    public void setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
    }

    public void addCrewMember(CrewMember crewMember) {
        crewMembers.add(crewMember);
    }

    public int getNumberOfPersonnel() {
        return crewMembers.size();
    }

    @Override
    public String toString() {
        return "Starship{" +
                "name='" + name + '\'' +
                ", registry='" + registry + '\'' +
                ", starshipClass='" + starshipClass + '\'' +
                ", crewMembers=" + crewMembers +
                '}';
    }
}