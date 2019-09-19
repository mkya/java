

class Help {
    void helpon(int what) {
        switch (what) {
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

    void showmenu() {
        System.out.println("Spravka:");
        System.out.println("Vblbirete:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("6 for break ");
        System.out.println("7 for continue ");
        System.out.print("Use q for exit ");
    }

    boolean isvalid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}

class hcd {
    public static void main(String args[])
     throws java.io.IOException {
        char choice, ignore;
Help hlpobj = new Help();

        for (;;) {
            do {
                hlpobj.showmenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while ( !hlpobj.isvalid(choice) );

            if (choice == 'q') break;
            System.out.println("\n");
            hlpobj.helpon(choice);

        }
    }
}