public class dojo {
    public static void main(String[] args) {
        System.out.println("Frase aqui dentro");
        double media = retornaMedia(5, 8);
        System.out.printf("A média é: %.2f \n", media);
        String nome = "Maykon Dyego";
        String sobrenome = "Granemann";
        String nc = nomeCompleto(nome, sobrenome);
        System.out.println(nc); 
        double respostaMedia = media(5.0, 30.1, 40.5, 55.6);
        System.out.printf("A resposta da média é:%.2f ", respostaMedia);
    }

    static double retornaMedia(int n1, int n2){
        double media = (n1+n2)/2.0;
        return media;
    }

    static String nomeCompleto(String nome, String sobrenome){
        String nome_completo = nome + " " + sobrenome; 
        return nome_completo;
    }
    static double media(double num1, double num2, double num3, double num4) {
        double soma = num1 + num2 + num3 + num4;
        double resultado = soma/4;
        return resultado;
    } 

}