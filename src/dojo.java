public class dojo {
    public static void main(String[] args) {
        System.out.println("Frase aqui dentro");
        double media = retornaMedia(5, 8);
        System.out.printf("A média é: %.2f ", media);
    }

    static double retornaMedia(int n1, int n2){
        double media = (n1+n2)/2.0;
        return media;
    }

}