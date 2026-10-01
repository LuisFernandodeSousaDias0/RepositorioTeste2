public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Atendimento teste = new Atendimento(1, "tobi", "cachorro", "paulo", "23/08/25", 16.30 , "Encerrado" , "Tudo Ok");
        System.out.println(teste.getCodigo());
    }
}
