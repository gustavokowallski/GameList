package project.games.personal.dto;

public class ReplacementDTO {
    private Integer sourceIndex;
    private Integer destinationIndex;

    public ReplacementDTO(){

    }

    public ReplacementDTO(Integer sourceIndex, Integer destinationIndex) {
        this.sourceIndex = sourceIndex;
        this.destinationIndex = destinationIndex;
    }

    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

}
