package creational.builder.improved;

public class Client {

    public static void main(String[] args) {

        // setup the director
        QueryBuildDirector director = new QueryBuildDirector();
        String from = "client table";
        String to = "another client table";
        String where = "client name = ...";

        // start building using a sql query
        QueryBuilder builder = new SqlQueryBuilder();
        Query query = director.buildQuery(from, where, builder);
        query.execute();

        // start building using mongoDB builder
        builder = new MongoDbQueryBuilder();
        query = director.buildQuery(from, where, builder);
        query.execute();

        // use Daisy chain to build
        // using Daisy chain avoids the needs of build engineer
        DaisyQueryBuilder daisyQueryBuilder = new DaisyQueryBuilder();
        query = daisyQueryBuilder.from(from).where(where).to(to).getQuery();
        query.execute();

    }

}
