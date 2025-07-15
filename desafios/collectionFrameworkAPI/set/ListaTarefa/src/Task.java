public class Task {
    private String name;
    private String description;
    private boolean task;

    public Task(String name,String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getdescription() {
        return description;
    }

    public boolean isTask() {
        return task;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTask(boolean task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Task " + "name='" + name + '\'' + ", descricao='" + description + '\'' + ", task=" + task ;
    }
}


