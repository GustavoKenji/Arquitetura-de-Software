
import java.util.Scanner;


public class Main {
    public BancoSecomp banco = new BancoSecomp();
    
    public static void main(String[] args) {
        /*BancoSecomp banco = new BancoSecomp(); // Instanciação da classe Banco
        //Secomp
        String x = new String(); // Variável para armazenar leitura da opção no
        // menu.*///declaração fora do metodo main
        
        //menu movido para método
        //while(true){//primeira vez entra sempre usando "do while"
        /*do{
            System.out.println("1 - Incluir um nome");
            System.out.println("2 - Listar nomes\n");
            Scanner leitor = new Scanner(System.in); 
            x = leitor.nextLine();

            switch(x){
                
                case "1":
                    String nome;            *Nome já é recebido dentro da função
                    nome = banco.leitura();
                    banco.cadastro(nome);
                    break;
                
                case "2":
                    banco.imprimirLista();
                    break;
                
                default:
                    System.out.println("Valor inválido");
                    break;
            }     
        }while(true);*/
    }

    public static void mostrarMenu(){
            System.out.println("1 - Incluir um nome");
            System.out.println("2 - Listar nomes\n");
            System.out.println("3 - Sair\n");
    }

    public static void criarMenu(){
        String x = new String();
        boolean menu;
        do {
            mostrarMenu();
            Scanner leitor = new Scanner(System.in);
            x = leitor.nextLine();

            switch (x) {

                case "1":
                    banco.cadastro();
                    break;
                case "2":
                    banco.imprimirLista();
                    break;
                case "3":
                    menu = false;
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (menu);
    }
}