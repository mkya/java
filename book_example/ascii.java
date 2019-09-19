class ascii {
    public static void main(String args[])
            throws java.io.IOException {
        char get;
        int count1 = 0, count2 = 0;
        do {
            get = (char) System.in.read();
            if (get >= 'a' & get <= 'z') {
                get -= 32;
                count1++;
                System.out.println(get);
            } else if (get >= 'A' & get <= 'Z') {
                get += 32;
                count2++;
                System.out.println(get);
            }
        } while (get !='.');
        System.out.println("kol-vo izmenenii = " + count1 + " and " + count2);
    }
}