import java.util.Scanner;

class Combinador {
    
    public static String combinador(String str1, String str2) {
        StringBuilder resultado = new StringBuilder();
        int tamanhoMin = Math.min(str1.length(), str2.length());
        
        for (int i = 0; i < tamanhoMin; i++) {
            resultado.append(str1.charAt(i)).append(str2.charAt(i));
        }
        
        if (str1.length() > str2.length()) {
            resultado.append(str1.substring(tamanhoMin));
        } else if (str2.length() > str1.length()) {
            resultado.append(str2.substring(tamanhoMin));
        }
        
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linha;
        
        while (!(linha = scanner.nextLine()).equals("FIM")) {
            String[] palavras = linha.split(" ");
            String resultado = combinador(palavras[0], palavras[1]);
            System.out.println(resultado);
        }
        
        scanner.close();
    }
}

