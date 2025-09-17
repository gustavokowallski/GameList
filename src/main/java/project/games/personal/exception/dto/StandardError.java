package project.games.personal.exception.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public record StandardError(Instant timestamp, Integer status, String error, String message,
                            String path) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

}