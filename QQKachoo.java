//Team Hydration
//Roster: Zane Wang, Sophia Xia, Maggie Zhao
//APCS2 pd1
//L02 -- All Hands on Deque! (Not Schenectady; rather, synecdoche.)
//2018-04-18

import java.lang.Iterable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class QQKachoo<D> implements Deque<D>{

    //INSTANCE VARIABLES =============================================
    private DLLNode<D> _head, _tail;
    private int _size;

    //METHODS =========================================================

    //Constructor
    public void QQKachoo() {
	_head = new DLLNode(null,null,null);
	_tail = new DLLNode(null,null,null);
	_size = 0;
    }

    //Returns the number of elements in this deque.
    public int size(){
	return _size;
    }

    //Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque). Throws a NoSuchElementException if the deque is empty.
    // * Throw exception.
    public D element(){
	return _head.getCargo();
    }

    //Retrieves, but does not remove, the first element of this deque.
    public D getFirst(){
	return _head.getCargo();
    }

    //Retrieves, but does not remove, the last element of this deque.
    public D getLast(){
	return _tail.getCargo();
    }

    public D peek() {
	return peekFirst();
    }

    public D peekFirst() {
	if (_size == 0)
	    return null;
	return _head.getCargo();
    }

    public D peekLast() {
	if (_size == 0)
	    return null;
	return _tail.getCargo();
    }

    //Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to
    public boolean add(D d){
	addLast(d);
	return true;
    }

    //Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions
    public void addFirst(D d){
      	DLLNode<D> newNode= new DLLNode<D>(d, null, _head);
        if (size() == 0)
	    _head = _tail = newNode;
        else {
	    newNode.setNext(_head);
	    _head.setPrev(newNode);
	    _head = newNode;
        }
        _size ++;
    }

    //Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions.
    public void addLast(D d){
      	DLLNode<D> newNode = new DLLNode<D>(d, _tail, null);
        if (size() == 0)
	    _head = _tail = newNode;
        else {
	    _tail.setNext(newNode);
	    newNode.setPrev(_tail);
	    _tail = newNode;
	}
	_size++;
    }

    //Remove Methods
    public D remove(){
	return removeFirst();
    }

    // throws an exception if empty
    public D removeFirst(){
	if (_size == 0)
	    throw new NoSuchElementException();

    	D temp = _head.getCargo();
	if (_size > 1)
	    _head = _head.getNext();
    	_head.setPrev(null);
	_size--;
    	return temp;
    }

    // throws an exeption if empty
    public D removeLast(){
	if (_size == 0)
	    throw new NoSuchElementException();
    	D temp = _tail.getCargo();
    	_tail = _tail.getPrev();
    	_tail.setNext(null);
	_size--;
    	return temp;
    }

    /*
    public Iterator<D> iterator() {
        Iterator<D> it = new Iterator(_head);
	return it;
    }

    public Iterator<D> descendingIterator() {
	DLLNode<D> help = _tail;
	DLLNode<D> temp = new DLLNode(_tail.getCargo(),null,null);
	DLLNode<D> retItr = temp;
	for (int i = 0; i < _size - 1; i++) {
	    help = help.getPrev();
	    retItr.setNext(new DLLNode(help.getCargo(),retItr,null));
	    retItr = retItr.getNext();
	}
	Iterator<D> it = new Iterator(temp);
	return it;
    }
    */
    
    public static void main(String[] args){
	QQKachoo deck = new QQKachoo();
        deck.addFirst("boo");
        deck.addLast("hoo");
        deck.addFirst("who");
	System.out.println(deck.peekFirst());//who
        System.out.println(deck.removeFirst());//who
        System.out.println(deck.removeFirst());//boo
	System.out.println(deck.peekFirst());//hoo
        System.out.println(deck.removeFirst());//hoo
    }
}
