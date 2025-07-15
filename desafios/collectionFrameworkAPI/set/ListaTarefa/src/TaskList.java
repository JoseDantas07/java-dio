import java.util.HashSet;
import java.util.Set;

public class TaskList {
    Set<Task> taskSet;

    public TaskList() {
        this.taskSet = new HashSet<>();
    }

    public void addTask(String name,String description){
        taskSet.add(new Task(name,description));
    }

    public void removeTask(String description){
        Task taskremoved = null;
        for (Task t : taskSet){
            if (t.getdescription().equalsIgnoreCase(description)){
                taskremoved = t;
                break;
            }
        }
        taskSet.remove(taskremoved);
    }

    public void displayTask(){
        System.out.println(taskSet);
    }

    public void countTasks(){
        System.out.println(taskSet.size());
    }

    public void markTaskCompleted(String description){
        for (Task t : taskSet){
            if (t.getdescription().equalsIgnoreCase(description)){
                t.setTask(true);
                break;
            }
        }
    }

    public void markPendingTask(String description){
        for (Task t : taskSet){
            if (t.getdescription().equalsIgnoreCase(description)){
                t.setTask(false);
            }
        }
    }

    public void clearTaskList(){
        taskSet.removeAll(taskSet);
    }

    public Set<Task> getCompletedTasks(){
        Set<Task> tasksCompleted = new HashSet<>();
        for (Task t : taskSet){
            if (t.isTask()){
                tasksCompleted.add(t);
            }
        }
        return tasksCompleted;
    }

    public Set<Task> getPendingTasks(){
        Set<Task> tasksPending = new HashSet<>();
        for (Task t: taskSet){
            if (!t.isTask()){
                tasksPending.add(t);
            }
        }
        return tasksPending;
    }
}
