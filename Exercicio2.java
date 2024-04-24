class Loga {
    public static void main(String[] args) throws Exception {
        contar();
    }

    public static void contar() {

        int[] n = {120, 240, 480, 960, 1920, 3840};
        int count = 0;
        int a = 1;
        long start, end;
        for (int k = 0; k < n.length; k++) {
            count = 0;
            start = System.nanoTime();
            for (int i = n[k] + 1; i > 0; i/=2) {
                count++;
                a *= 2;
            }
            end = System.nanoTime();
            System.out.println("Para n= " + n[k] + "\noperações:" + count + "\ntempo:" + (end - start));
        }
    }
}
