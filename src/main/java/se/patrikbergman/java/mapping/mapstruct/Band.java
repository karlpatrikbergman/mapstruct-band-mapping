package se.patrikbergman.java.mapping.mapstruct;

public class Band {
    private String name;
    private String description;
    private int rockFactor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRockFactor() {
        return rockFactor;
    }

    public void setRockFactor(int rockFactor) {
        this.rockFactor = rockFactor;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rockFactor=" + rockFactor +
                '}';
    }
}
