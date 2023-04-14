public class Main {
    public static void main(String[] args) {
        Letra letraA = new LetraA();

        Escritor escritor = new Escritor();
        escritor.escrever(letraA.desenhar());
    }
}