import br.com.exercicios.Calculadora;
import br.com.exercicios.Emprestimo;
import br.com.exercicios.Mensagem;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Calculadora
        System.out.println("☺ Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("🤓 Mensagem de boas-vindas");
        Mensagem.horaCerta();
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(22);

        // Calcular Parcela
        System.out.println("🤠 Calculando empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
