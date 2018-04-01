public class ITIStringBuffer {

    private SinglyLinkedList<String> buffer;
    private char[] value;
    private int pos;

    public ITIStringBuffer() {
        this.buffer = new SinglyLinkedList<String>();
        count = 0;
        value = new char[32];
    }

    public ITIStringBuffer(String  firstString){
      this.buffer = new SinglyLinkedList<String>();
      buffer.addFirst(firstString);
      count = 1;
    }

    public void append(String nextString){
      if((nextString.length + pos) > value.length){
        incrementSize();
      }
      if(buffer.size() == 0){
        buffer.addFirst(nextString);
        
      } else
        buffer.add(nextString);

      count++;
    }

    private void incrementSize(){
      value = Arrays.copyOf(value, value.length+32);
    }

    public String toString(){
      String in =  buffer.toString();
      char[] c = in.toCharArray();
      String out = new String(c, 1, c.length-2);
      return out;
    }

}
