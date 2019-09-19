class Queue {
    char q[];
    int putloc, getloc;

    Queue(int size) {
        q = new char [size+1];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length-1) {
            System.out.println(" - Ochered zapolnena");
        return;
        }

        putloc++;
        q[putloc] = ch;
    }

  char get() {
        if (getloc == putloc) {
            System.out.println(" - Ochered pusta");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
}
}

class QDemo {
    public static void main (String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Use ochered bigQ for save alphavit");
        for (i=0; i<26; i++)
            bigQ.put((char) ('A' +i ));

        System.out.print("Soderzimoe ocheredi bigQ: ");
        for (i=0; i<26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Use ochered smallQ dlya generacii oshibok");
        for (i=0; i<5; i++) {
            System.out.print("Popytka save " + (char) ('Z' - i));
            smallQ.put((char) ('Z'- i));
            System.out.println();
            }
            System.out.println();

        System.out.print("Soderzimoe smallQ: ");
        for (i=0; i<5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}