public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public String getDescription() {
        return description;
    }

    public String getListItem() {
        return "[" + getStatusIcon() + "] " + getDescription();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}