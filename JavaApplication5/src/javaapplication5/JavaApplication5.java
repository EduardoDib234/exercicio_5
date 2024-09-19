import java.util.Scanner;


public class Exercicio_5 {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada dos valors inteiros.
    int codigo = scanner.nextInt();
    int quantidade = scanner.nextInt();
    Double preco = 0.0;
    
    scanner.close();  
    
    switch (codigo) {
        case 1:
            preco = 4.00;
            break;
        case 2:
            preco = 4.50;
            break;
         case 3: 
            preco = 5.00;
             break;
         case 4:
             preco = 2.00;
              break;
          case 5:
             preco = 1.50;
              break;
      default:
      
      System.out.println("O codigo do item invalido");
      
      Double total = preco * quantidade;
      
      System.out.println("O total: R$ %.2f, total");
      
            
              
              
    }
    