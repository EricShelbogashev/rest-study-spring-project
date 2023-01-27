package rrg.study.spring.rest.domain;


import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ToDo {

    enum ImportanceLevel {
        HIGHEST, NORMAL, LOWEST
    }
    @NonNull
    private String id;
    @NonNull
    @NotBlank
    private String description;
    private boolean completed;
    private LocalDateTime created;
    private LocalDateTime modified;
    @NonNull
    private ImportanceLevel level;

    public ToDo() {
        LocalDateTime date = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created = date;
        this.modified = date;
        this.level = ImportanceLevel.NORMAL;
    }

    public ToDo(String description, ImportanceLevel level) {
        this();
        this.description = description;
        this.level = level;
    }
}
