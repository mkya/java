class bubble {
    public static void main (String args[]) {
        int nums[] = {100, 125, -12521, -1, 112512, -12552, 12312, 2, 77, 10};
        int a,b,t;
        int size=10;

        System.out.print("START:");

        for (int i=0; i<size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        for (a=1; a<size; a++)
            for (b=size-1; b>=a; b--) {
                if(nums[b-1] > nums[b]) {

                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }

            System.out.print("massiv done:");
            for(int i=0; i<size; i++)
                System.out.print(" " + nums[i]);
            System.out.println();
    }
}