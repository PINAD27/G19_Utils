
import java.util.*;
public class ITIStringBuffer {

    private SinglyLinkedList<String> buffer;
    private char[] cAr;
    private int cnt;

    public ITIStringBuffer() {
        this.buffer = new SinglyLinkedList<String>();
        cnt = 0;
        cAr = new char[32];
    }

    public ITIStringBuffer(String firstString){
      this.buffer = new SinglyLinkedList<String>();
      buffer.addFirst(firstString);
      cAr= new char[firstString.length()+2];
      cnt+= firstString.length();
      firstString.getChars(0, firstString.length(), cAr, cnt);
    }

    public void append(String nextString){
      cnt += nextString.length();
      while((nextString.length() + cnt) >= cAr.length){
        incrementSize();
      }
      if(buffer.size() == 0){
        buffer.addFirst(nextString);

      } else
        buffer.add(nextString);


      nextString.getChars(0, nextString.length(), cAr, cnt);
      }

    private void incrementSize(){
      cAr = Arrays.copyOf(cAr, cAr.length*2);
    }

    public String toString(){
      // String in =  buffer.toString();
      // char[] c = in.toCharArray();
      // String out = new String(c, 1, c.length-2);
      String out = new String (cAr);
      return out;
    }

}
