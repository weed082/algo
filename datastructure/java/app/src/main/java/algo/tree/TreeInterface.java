package algo.tree;

public interface TreeInterface<T> {
  boolean isEmpty();

  int size();

  boolean add(T elem); // if exist return false

  boolean remove(T elem);

  boolean contains(T elem);

  int height();
}
