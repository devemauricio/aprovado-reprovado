import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int notaAluno = scanner.nextInt();

        String resultado = notaAluno >= 7 ? "Aprovado" : notaAluno >= 5 && notaAluno < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
