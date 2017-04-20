
import java.util.Scanner;



public class CifraDeCesar {
   
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String palavraLida = "";
        
        System.out.println("Digite a palavra que você quer criptografar:");
        while(scanner.hasNextLine()){
            palavraLida = scanner.nextLine();
        }
        System.out.println("Digite a chave para o processo (1 - 26)");
        int chaveString = scanner.nextInt();
        
        char palavraLidaCaracteres[];
        palavraLidaCaracteres = palavraLida.toCharArray();
        
        char palavraGerada[];
        palavraGerada = null;
        
        int index = 0;
        
        if (chaveString >= 1 && chaveString <= 26) {
            for (int i = 0; i < palavraLida.length(); i++) {
                if (palavraLidaCaracteres[i] == ' ') {
                    palavraGerada[i] = ' ';
                }else{
                   if((i + chaveString) > 26){
                       index = ((i + chaveString) - 26) % 26;
                   }else{
                       index = (i + chaveString) % 26;
                   }
                }
            }
        }else{
            System.out.println("Chave inválida.");
        }
        
        String palavraFinal = new String(palavraGerada);
        
        System.out.println(palavraFinal);
    }
}
