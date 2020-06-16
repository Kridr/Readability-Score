class Problem {
    public static void main(String[] args) {
        boolean isTest = false;

        for (int i = 0; i < args.length && !isTest; i++) {
            if ("test".equals(args[i])) {
                System.out.println(i);
                isTest = true;
            }
        }

        if (!isTest) {
            System.out.println(-1);
        }
    }
}