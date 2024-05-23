import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {		
		try {
			
            //chamando o método contendo a lógica de contagem
			contar();
		
		}
        catch (Exception e) {
            System.out.println("o segundo número deve ser maior");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar() throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		int contagem = parametroDois - parametroUm;

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        }
        else
            for(int x=1; x <= contagem && x != 0; x++){
            System.out.println("Imprime número " + x);
            }
        }
		//realizar o for para imprimir os números com base na variável contagem
	}

        
    
        
        
        
        
    