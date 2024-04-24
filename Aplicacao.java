public class Aplicacao {

    public static Cliente setar(Cliente c){
        c.setNome("Joaquim");
        return c;
    }

    public static void main(String[] args) throws InterruptedException {
        Cliente c1 = null, c2 = null, c3 = null, c4 = null;

        System.out.println("Endereço de memória de c1: " + c1);

        c1 = new Cliente ("Jorge");
        c2 = new Cliente("Carla");

        System.out.println("Clientes");
        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());

        c3=c2;

        System.out.println("c3: " + c3.toString());

        c3.setNome("Maria Cristina");

        System.out.println("Clientes após alteração de nome em c3");
        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        System.out.println("c3: " + c3.toString());

        c2=null;
        System.out.println("Refêrencia nula para c2");
        System.gc();
        Thread.sleep(10);

        System.out.println("Alterando referência de c3");
        c3=c1;
        System.gc();
        Thread.sleep(10);

        c4 = setar(c1);
        System.out.println("Clientes");
        System.out.println("c1: " + c1.toString());
        System.out.println("c4: " + c4.toString());

    }
}
