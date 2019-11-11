//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

class Queue {
    char[] q;
    int putloc;
    int getloc;

    Queue(int var1) {
        q = new char[var1 + 1];
        putloc = getloc = 0;
    }

    void put(char var2) {
        if (putloc == q.length - 1) {
            System.out.println(" - Ochered zapolnena");
        } else {
            ++putloc;
            q[putloc] = var2;
        }
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - Ochered pusta");
            return '\u0000';
        } else {
            ++getloc;
            return q[getloc];
        }
    }
}
