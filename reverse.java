class reverse {
    public static void main(String[] args) {
        int n, r;
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        while (n > 0) {
            r = n % 10;
            System.out.print(r);
            n = n / 10;
        }
    }
}