package it.woodchuck.solution;

/**
 * Created by Catramos on 09/02/2016.
 */
public interface Solution<T> {

    public T parseInput(String input);

    public String ProcessInput(T input);

}
