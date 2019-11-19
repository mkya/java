//2. Написать метод, который возвращает последовательность рандомных целых чисел (ПbН-код) по количеству регистров, подающихся на вход метода. Например, «7 регистров». Результат: «5412409».

class test2_2 {
    public static void main(String args[]) {
        String arg = "HtestIngvseVokrugdASvidanYA";
        registr(arg);
    }

    private static boolean registr(String arg) {
        for (int i = 0; i < arg.length(); i++) {
            char charAtZero = arg.charAt(i);
            String s = String.valueOf(charAtZero);
            String k = s;
            k = k.replace(s,s.toLowerCase());
            if (!s.contains(k))
                System.out.print(s);
        }
        return true;
    }
}