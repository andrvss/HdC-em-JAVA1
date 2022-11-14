/* Exercício 1
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
      
    String Planeta;
    Planeta = "Plutão";
    System.out.println("O Planeta virou "+ Planeta);
    
	}
} */

/* Exercício 2
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
      
    String nome;
    System.out.println("Por favor, digite seu nome: ");
    nome = sc.nextLine();
    System.out.println("Olá," + nome);

	}
} */

/* Exercício 3
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
      
    String nome;
    int idade;
    
    System.out.println("Qual seu nome? ");
    
    nome = sc.nextLine();
    System.out.println("Qual sua idade?");
    idade = sc.nextInt();
    
    System.out.println("Olá "+ nome + " sua idade é "+ idade);
   
	}
} */

/* Exercício 4
- Círculo:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor do raio do circulo: ");
    double raio = ler.nextDouble();
    System.out.println("O valor da área do circulo é: " + 3.14*(raio*2));
    ler.close();

    }
}

- Losango:
import java.util.Scanner;

public class Main {
public static void main (String[] args) {

    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor do diagonal maior: ");
    int diagonalmaior = ler.nextInt();
    System.out.println("Digite o valor do diagonal menor: ");
    int diagonalmenor = ler.nextInt();
    System.out.println("O valor da área é: " + (diagonalmaior*diagonalmenor/2) );

    }
}

- Paralelograma:
import java.util.Scanner;

public class Main {
public static void main (String[] args) {

    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor da base: ");
    int base = ler.nextInt();
    System.out.println("Digite o valor da altura: ");
    int altura = ler.nextInt();
    System.out.println ("Area: " + (base*altura));

    }
}

- Quadrado:
import java.util.Scanner;

public class Main {
public static void main (String[] args) {

    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o valor do primeiro lado: ");
    int primeiro = ler.nextInt();
    System.out.println("Informe o valor do segundo lado: ");
    int segundo = ler.nextInt();
    System.out.println("O resultado da área é: " + (primeiro*segundo) );

    }
}

- Retângulo:
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe a base: ");
    int base = ler.nextInt();
    System.out.println("Informe a altura: ");
    int altura = ler.nextInt();
    System.out.println("Area: " + (base*altura));

    }
}

- Trapézio:
import java.util.Scanner;

public class Main {
public static void main (String[] args) {

    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor da base maior: ");
    int maior = ler.nextInt();
    System.out.println("Digite o valor da base menor: ");
    int menor = ler.nextInt();
    System.out.println("Digite o valor da altura: ");
    int altura = ler.nextInt();
    System.out.println("O valor da área do trapézio é: " + (maior+menor)*altura/2);

    }
}

- Triângulo:
import java.util.Scanner;

public class Main {
public static void main (String[] args) {

    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor da base: ");
    int base = ler.nextInt();
    System.out.println("Digite o valor da altura: ");
    int altura = ler.nextInt();
    System.out.println ("Area: " + (base*altura/2));

    }
} */

/* Exercício 5 
import java.util.Scanner;

public class Main {
public static void main (String[] args) {

    Scanner ler = new Scanner (System.in);
    System.out.println("Informe um número: ");
    int valor = ler.nextInt();
    if (valor > 0) {
    System.out.print("O número é positivo");
    } else if (valor == 0) {
    System.out.print("Número neutro");
    } else if (valor < 0) {
    System.out.print("O número é negativo");

    } 
  }
} */

/* Exercício 6 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe três números:");
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("O número maior é: " + a );
        }
        else if (b > a && b > c) {
            System.out.println("O número maior é: " + b);
        }
        else if (c > a && c > b) {
            System.out.println("O número maior é: " + c);

        }
    }
} */

/* Exercício 7 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o primeiro número: ");
    int a = sc.nextInt();
    System.out.println("Informe o segundo número: ");
    int b = sc.nextInt();
    System.out.println("Informe o terceiro número: ");
    int c = sc.nextInt();

    int minimo = Math.min(a, Math.min(b,c));

System.out.println("A soma dos dois maiores é: " + (a+b+c-minimo));

    }
} */

/* Exercício 8
import java.util.Locale;
import java.util.Scanner;

    public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
		System.out.println("Informe um valor:");
	   
	    int v1 = sc.nextInt();
	    int v2 = sc.nextInt();
	    int soma;
	    if (v2 <= 0) {
		    System.out.println("Por favor informe um numero acima de 0:");
	   }
	   		
	    else {
		   soma = v1 / v2;
		   System.out.println("O resultado é " + soma);
           
	   }
	}
} */

/* Exercício 9 
import java.util.Scanner;

    public static void main(String[] args) {

         Scanner ler = new Scanner(System.in);
         System.out.println("Qual o valor da base?");
         int base = ler.nextInt();
           System.out.println("Qual o valor da altura?");
           int altura = ler.nextInt();
           int conta = (base * altura) /2;
           System.out.println(conta);

    }
} */

/* Exercício 10
import java.util.Scanner;

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double pi = 3.14;
         System.out.println("Qual o valor da area?");
          int area = ler.nextInt();
          double areas = Math.pow(area,2);
          double conta = (pi * areas);
          System.out.println(conta);
          
    }
} */

/* Exercício 11 
import java.util.Scanner;

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha um valor");
        double valor = ler.nextDouble();
        if (valor > 0) {
            System.out.println("Seu número é maior que 0");
        } else if ( valor < 0) {
            System.out.println("Seu número é menor que 0");
        } else {
            System.out.println("Seu número é 0");

        }
    }
} */

/* Exercício 12
import java.util.Scanner;

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha o primeiro valor?");
        int primeiro = ler.nextInt();
        System.out.println("Escolha o segundo valor?");
        int segundo = ler.nextInt();
        System.out.println("Escolha o terceiro valor?");
        int terceiro = ler.nextInt();
        double resultado = Math.max(primeiro, Math.max(segundo, terceiro));

        System.out.println("O maior numero e " +  resultado);

    }
} */

/* Exercício 13 
import java.util.Scanner;

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o primeiro valor?");
        double um = ler.nextInt();
        System.out.println("Qual o segundo valor?");
        double dois = ler.nextInt();
        System.out.println("Qual o terceiro valor?");
        double tres = ler.nextInt();

       double conta = Math.min(um, Math.min(dois, tres));

        System.out.println("O resultado é de " + (um + dois + tres - conta));

    }
} */

/* Exercício 14 
import java.util.Scanner;

    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o primeiro valor?");
        int um = ler.nextInt();
        System.out.println("Qual o segundo valor");
        int dois = ler.nextInt();
        while (dois <= 0) {
            System.out.println("O valor nao pode ser menor ou igual a 0, tente outro;");
            dois += ler.nextInt();  
        }

        System.out.println("O resultado e de = " + (um / dois));

    }
} */