class bubble2 {


    public static void main(String args[]) {
        int k = 0;
        int r = 100;
        int a, b, t;
        int size = k + (int) (Math.random() * r);
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            int random_number1 = k + (int) (Math.random() * r);
            nums[i] = random_number1;
        }

        System.out.print("START:");

        for (int q = 0; q < size; q++) {
            for (a = 1; a < size; a++)
                for (b = size - 1; b >= a; b--) {
                    if (nums[b - 1] > nums[b]) {

                        t = nums[b - 1];
                        nums[b - 1] = nums[b];
                        nums[b] = t;
                    }
                }
        }
        System.out.print("massiv done:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}