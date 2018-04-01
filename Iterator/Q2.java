public class Q2 {

    public static void main(String[] args) {

        StudentInfo.display();

        LinkedList<String> alphabet;
        alphabet = new LinkedList<String>();

        alphabet.add("alpha");
        alphabet.add("bravo");
        alphabet.add("charlie");
        alphabet.add("delta");
        alphabet.add("echo");

        Iterator<String> i;
        i = alphabet.iterator();
        // Iterator<String> k = alphabet.iterator(1);
        // Iterator<String> j = alphabet.iterator(k);
        while (i.hasNext()) {
            System.out.println(i.nextIndex());
            System.out.println(i.next());
        }
        System.out.println(i.nextIndex());
        // System.out.println("\nk: " + k.next() + "\nj: " + j.next());
        // while(k.hasNext()){
        //   System.out.println(k.nextIndex());
        //   System.out.println(k.next());
        // }


    }
}
