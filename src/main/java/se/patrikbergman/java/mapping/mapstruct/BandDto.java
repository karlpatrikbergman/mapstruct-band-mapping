package se.patrikbergman.java.mapping.mapstruct;

public class BandDto {
    private String name;
    private String biography;
    private Long rockFactor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Long getRockFactor() {
        return rockFactor;
    }

    public void setRockFactor(Long rockFactor) {
        this.rockFactor = rockFactor;
    }

    @Override
    public String toString() {
        return "BandDto{" +
                "name='" + name + '\'' +
                ", biography='" + biography + '\'' +
                ", rockFactor=" + rockFactor +
                '}';
    }
}
