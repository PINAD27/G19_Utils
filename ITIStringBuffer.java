
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
      try{
      this.buffer = new SinglyLinkedList<String>();
      buffer.addFirst(firstString);
      cAr= new char[firstString.length()];
      firstString.getChars(0, firstString.length(), cAr, cnt);
      cnt+= firstString.length();
    }catch (NullPointerException e){
      System.out.println("Null elements can not be added to ITIStringBuffer");
    }catch (Exception e){
      System.out.println("Error could not add element");
    }
    }

    public void append(String nextString){
      try{

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
      }catch (NullPointerException e){
        System.out.println("Null elements can not be added to ITIStringBuffer");
      }catch (Exception e){
        System.out.println("Error could not add element");
      }
    }

    private void incrementSize(){
      cAr = Arrays.copyOf(cAr, cAr.length*2);
    }

    public String toString(){
      String out = new String (cAr,0,cnt);
      return out;
    }

}
