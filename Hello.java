class Hello {

    public int xorOperation(int n, int start) {
        int x = 0;

        for (int i = 0; i < n; i++) {
            int k = start + 2 * i;
            x ^= k;
        }

        return x;
    }

    public static void main(String[] args) {
        Hello obj = new Hello();

        int n = 5;
        int start = 0;

        int result = obj.xorOperation(n, start);

        System.out.println("XOR Operation Result: " + result);
    }
}