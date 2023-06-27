public class CrewMember {
    private String name;
    private String position;
    private String rank;
    private String species;
    private String assignment;

    public CrewMember(String name, String position, String rank, String species, String assignment) {
        this.name = name;
        this.position = position;
        this.rank = rank;
        this.species = species;
      
    }

    public CrewMember(String name, String position, String rank, String species) {
        this.name = name;
        this.position = position;
        this.rank = rank;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    @Override
    public String toString() {
        return "CrewMember{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", rank='" + rank + '\'' +
                ", species='" + species + '\'' + '}';
    }
}