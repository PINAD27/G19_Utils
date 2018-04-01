public class LinkedList<E> implements List<E>, Iterable<E>{

  private class LinkedListIterator implements java.util.Iterator<E>{

  }

  public java.util.Iterator<T> iterator(){ //iterable method
    return new LinkedListIterator();
  }

  public static void main(String[] args) {
    LinkedList<Integer> l = new LinkedList<>();
    for(int i: l){ //for loop using an iterable
      i++;
    }
  }

  private int size(Node<E> node){
    if(node == null){
      return 0;
    }
    return (1 + size(node.next));
  }

  public int size(){
    return size(head);
  }

  public E findMax(Node<E> p){
    if()

    return head.value > findMax(head);
  }

  public E findMax(){

  }

}
