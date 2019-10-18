class FindFac {
    public static void main(String args[]) {
        for(int i=2; i<=20; i++) {
            System.out.print("Del " + i + ": ");
            for(int j=2; j<i; j++) {
                if ((i%j) == 0) System.out.print(j + " ");

            }
        }
    }
}

class tochka {
    public static void main(String args[]) {
        char choice, ignore;
        int i;
        for (;;) {
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
             while (ignore != '\n');
            while (choice != '.') ; }
            if (choice == '.') break;
            System.out.println("\n");
        }
    }
}