public class Main {
    public static void main(String[] args) {


        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        //Declaração de variáveis =)
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento:"+anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;

        int valor =  10;

        double nota = (8.0+9.5+10.0)/3;
        System.out.println(nota);


        String nome = "Kilson";
        System.out.println(nome);


        //Text Block
        String sinopse;
        sinopse = """
                Kilson Alves 
                Iram junior
                Lucas Moura
                """;
        System.out.println(sinopse);

      //Casting Conversão de variáveis
      //int x = 10;
      //double y = x;

        //.out.println(x);


//Conversão de Celsius para Fahrenheit com casting para int


                double temperatureCelsius = 28.0;
                int fahrenheintConvert = (int) (temperatureCelsius * 1.8) + 32;
                System.out.println(String.format("A conversão de %.0f graus Celsius em Fahrenheit é %d", temperatureCelsius,fahrenheintConvert));

























    }
    }
