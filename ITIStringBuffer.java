
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
      cAr= new char[firstString.length()];
      cnt+= firstString.length();
      System.out.println(cnt);
      firstString.getChars(0, firstString.length(), cAr, cnt);
    }

    public void append(String nextString){
      if((nextString.length() + cnt> cAr.length)){
        while((nextString.length() + cnt) >= cAr.length){
          incrementSize();
      }
    }

      if(buffer.size() == 0){
        buffer.addFirst(nextString);

      } else{
        buffer.add(nextString);
      }


      nextString.getChars(0, nextString.length(), cAr, cnt);
      cnt += nextString.length();
    }

    private void incrementSize(){
      cAr = Arrays.copyOf(cAr, cAr.length*2);
    }

    public String toString(){
      String out = new String (cAr,0,cnt);
      return out;
    }

}
