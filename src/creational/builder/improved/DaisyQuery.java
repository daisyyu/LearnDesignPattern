package creational.builder.improved;

/**
 * Created by fuxinyu on 1/29/16.
 */
public class DaisyQuery implements Query {
    private String from;

    private String where;

    /** this is in addition to all other query has */
    private String to;

    @Override
    public void execute() {
        System.out.println("Executing Daisy Query from: " + from + " where " + where + " to " + to);
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
