import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private int idade;


    public void cadastroPessoa(){
        //INSTANCIANDO CLASSE SCANNER
        Scanner input = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        //CADASTRANDO NOME E SOBRENOME
        System.out.println("Digite seu nome: ");
        String nome1 = input.nextLine();
        setNome(nome1);

        System.out.println("Digite seu sobrenome: ");
        String sobrenome1 = input.nextLine();
        setSobrenome(sobrenome1);

        //CADASTRANDO DATA DE NASCIMENTO
        System.out.println("Digite seu dia de nascimento: ");
        int dia = inputInt.nextInt();
        setDia(dia);

        System.out.println("Digite seu mes de nascimento: ");
        int mes = inputInt.nextInt();
        setMes(mes);

        System.out.println("Digite seu ano de nascimento: ");
        int ano = inputInt.nextInt();
        setAno(ano);

        //CALCULANDO IDADE
        LocalDate hoje = LocalDate.now(); //ATRIBUI A VARIAVEL HOJE A DATA DE HOJE
        LocalDate dataNascimento = LocalDate.of(getAno(), getMes(), getDia());
        setIdade(Period.between(dataNascimento, hoje).getYears());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "DADOS DE CADASTRO{" +
                "nome='" + getNome() + '\'' +
                ", sobrenome='" + getSobrenome() + '\'' +
                ", idade=" + idade +
                '}';
    }
    public String nomeCompleto(){
        return getNome() +" "+getSobrenome();
    }
}
