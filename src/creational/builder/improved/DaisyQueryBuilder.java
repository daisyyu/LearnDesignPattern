package creational.builder.improved;

/**
 * Created by fuxinyu on 1/29/16.
 */
public class DaisyQueryBuilder {
    DaisyQuery query = new DaisyQuery();

    Query getQuery() {
        return query;
    }

    DaisyQueryBuilder from(String from) {
        query.setFrom(from);
        return this;
    }

    DaisyQueryBuilder where(String where) {
        query.setWhere(where);
        return this;
    }
    DaisyQueryBuilder to(String to){
        query.setTo(to);
        return this;
    }
}
