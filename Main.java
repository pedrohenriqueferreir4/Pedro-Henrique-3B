public class Main {


    static class Pessoa {
        String nome;
        int idade;
        String altura;
        String nascimento;
        String sexo;
    }

    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa();


        pessoa.nome = "Pedro";
        pessoa.idade = 16;
        pessoa.altura = "1,86";
        pessoa.nascimento = "27/08/2008";
        pessoa.sexo = "masculino";


        System.out.println("Exibir nome = " + pessoa.nome);
        System.out.println("Exibir idade = " + pessoa.idade);
        System.out.println("Exibir altura = " + pessoa.altura);
        System.out.println("Exibir nascimento = " + pessoa.nascimento);
        System.out.println("Exibir sexo = " + pessoa.sexo);
    }
}
