class schetchik {
    public static void main(String args[])
            throws java.io.IOException {
        int i=0;
        System.out.println("Dlya vihoda nazmite \".\"");
        for (; ; ) {

            char all = (char) System.in.read();
            if (all == ' ') {
                int j = i;
                i++;
                if (j < i) System.out.println("\n probelov:" + i);
            }
            if (all == '.')break;
        }
    }
}