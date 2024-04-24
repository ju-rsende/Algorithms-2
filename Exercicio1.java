class Log {
    public static void main(String[] args) throws Exception {
        contar();
    }

    public static void contar() {

        int[] n = {90, 180, 360, 720, 1440, 2880};
        int count = 0;
        int b = 1;
        long start, end;
        for (int k = 0; k < n.length; k++) {
            count = 0;
            start = System.nanoTime();
            for (int i = 0; i <= n[k]; i += 2) {
                count++;
                b *= 3;
            }
            end = System.nanoTime();
            System.out.println("Para n= " + n[k] + "\noperações:" + count + "\ntempo:" + (end - start));
        }
    }
}
