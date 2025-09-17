package project.games.personal.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ReplacementDTO {
    @NotNull(message = "Cannot be null")
    @Positive(message = "Cannot be negative")
    private Integer sourceIndex;
    @Positive(message = "Cannot be negative")
    @NotNull(message = "Cannot be null")
    private Integer destinationIndex;

    public ReplacementDTO(){
    }

    public ReplacementDTO(Integer sourceIndex, Integer destinationIndex) {
        this.sourceIndex = sourceIndex;
        this.destinationIndex = destinationIndex;
    }

    public int getSourceIndex() {
        return sourceIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

}
