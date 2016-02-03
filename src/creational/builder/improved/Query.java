package creational.builder.improved;

/**
 * Because of the intermidiate layer of QueryBuilder
 * concreate Query implementations don't expose to client.
 * Client only have to know execute, which is all clients care about
 */
public interface Query {

	void execute();
	
}
