import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite Seu Nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite Seu CPF: ");
        Long cpf = sc.nextLong(11);
        System.out.println("Digite Sua Idade: ");
        int idade = sc.nextInt();

        System.out.println("Confirme para continuar (Continuar = 1, refazer = 0)");
        int confirmação = sc.nextInt();
        switch (confirmação) {
            case 1:
                System.out.println("Confirmado com sucesso");
                break;
        
            default:
                main(args);
                break;
        }

 
  

    }
}
