class help {
    public static void main(String args[])
        throws java.io.IOException {
        char choice, ignore;

        for (;;) {
            do {
                System.out.println("Spravka:");
                System.out.println("Vblbirete:");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("6 for break ");
                System.out.println("7 for continue ");
                System.out.print("Use q for exit ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;
            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("Operator if: \n");
                    System.out.println("if(uslovie) operator;");
                    System.out.println("else operator;");
                    break;
                case '2':
                    System.out.println("Operator switch:\n");
                    System.out.println("switch(virazenie) {");
                    System.out.println(" posledovatel'nost' operatorov");
                    System.out.println(" break;");
                    System.out.println(" // ... ");
                    System.out.println("}");
                    break;
                case '6':
                    System.out.println("you use BREAK");
                    break;
                case '7':
                    System.out.println("you use CONTINUE");
                    break;
            }
            System.out.println();
        }
    }
}