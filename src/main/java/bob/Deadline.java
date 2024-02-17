package bob;

public class Deadline extends Task {

    protected String by;

    public Deadline(String description, String by, boolean isDone) {
        super(description, isDone);
        this.by = by;
    }

    public Deadline (String stringRepresentation) {
        super(stringRepresentation);
        String[] split = stringRepresentation.substring(6).split(" ");
        this.description = split[0];
        this.by = split[1];
    }



    @Override
    public String toString() {
        return "[D]" + super.getListItem() + " (by: " + by + ")";
    }
}