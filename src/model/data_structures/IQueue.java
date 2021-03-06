package model.data_structures;

public interface IQueue<T> {

	public void enqueue( T nodeInfo );
	
	public T dequeue();
	
	public int size();
	
	public boolean isEmpty();
	
	public T getFront();
	
}
