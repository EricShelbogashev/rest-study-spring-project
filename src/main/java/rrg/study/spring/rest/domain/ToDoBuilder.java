package rrg.study.spring.rest.domain;

public class ToDoBuilder {
    private static ToDoBuilder instance = new ToDoBuilder();
    private String id = null;
    private ToDo.ImportanceLevel level = null;
    private String description = "";

    private ToDoBuilder() {}

    public static ToDoBuilder getInstance() {
        return instance;
    }

    public ToDoBuilder withDescription(String description) {
        this.description = description;
        return instance;
    }
    public ToDoBuilder withId(String id) {
        this.id = id;
        return instance;
    }

    public ToDoBuilder withLevel(ToDo.ImportanceLevel id) {
        this.level = level;
        return instance;
    }

    public ToDo build() {
        ToDo result = new ToDo(this.description, level);
        if (id != null) {
            result.setId(id);
        }
        return result;
    }
}
