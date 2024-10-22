import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho
        System.out.println("Faculdade ALFREDO NASCER");
        System.out.println("Aluno: FERNANDO CAIK DE MELLO DA SILVA");
        System.out.println("Professor: BRENNO PIMENTA");
        System.out.println("Bem-vindo ao quiz sobre programação em Java! Você responderá 15 perguntas de múltipla escolha.");

        // Criar perguntas
        Questao[] questoes = new Questao[15];

        questoes[0] = new Questao("Qual é o tipo de dado que armazena um número inteiro em Java?",
                new String[]{"int", "float", "double", "char", "String"}, 0);
        questoes[1] = new Questao("Qual é a palavra-chave usada para declarar uma classe em Java?",
                new String[]{"class", "object", "method", "function", "type"}, 0);
        questoes[2] = new Questao("O que é um construtor em Java?",
                new String[]{"Método especial para criar objetos", "Um tipo de variável", "Um loop", "Um operador", "Um pacote"}, 0);
        questoes[3] = new Questao("Qual é a estrutura de controle usada para tomar decisões?",
                new String[]{"if", "for", "while", "switch", "A e C"}, 4);
        questoes[4] = new Questao("O que significa a sigla OOP?",
                new String[]{"Programação Orientada a Objetos", "Operações de Objetos Públicos", "Organização de Objetos Práticos", "Ordenação de Objetos de Programa"}, 0);
        questoes[5] = new Questao("Qual é a maneira correta de declarar um array em Java?",
                new String[]{"int[] arr;", "array int arr;", "int arr[];", "ambos A e C", "nenhum dos anteriores"}, 3);
        questoes[6] = new Questao("O que é um método estático?",
                new String[]{"Método que pertence à classe e não a uma instância", "Método que não retorna valores", "Método que é privado", "Método que pode ser chamado somente uma vez", "Método que não pode ser sobrescrito"}, 0);
        questoes[7] = new Questao("Como se chama o mecanismo que permite a criação de subclasses em Java?",
                new String[]{"Herança", "Polimorfismo", "Encapsulamento", "Abstração", "Interface"}, 0);
        questoes[8] = new Questao("Qual é a palavra-chave usada para criar uma interface em Java?",
                new String[]{"interface", "abstract", "class", "implements", "extends"}, 0);
        questoes[9] = new Questao("Qual é o operador utilizado para comparar dois valores?",
                new String[]{"==", "=", "!=", "<>", "==="}, 0);
        questoes[10] = new Questao("O que faz a palavra-chave 'this' em Java?",
                new String[]{"Referência à instância atual da classe", "Cria um novo objeto", "Chama um método estático", "Declara uma variável", "Nenhuma das anteriores"}, 0);
        questoes[11] = new Questao("Qual é a estrutura de repetição que executa um bloco de código enquanto a condição for verdadeira?",
                new String[]{"for", "do while", "while", "switch", "break"}, 2);
        questoes[12] = new Questao("O que é um package em Java?",
                new String[]{"Um agrupamento de classes", "Uma classe especial", "Um tipo de dado", "Um método", "Um construtor"}, 0);
        questoes[13] = new Questao("O que é exceção em Java?",
                new String[]{"Erro que ocorre durante a execução do programa", "Um tipo de variável", "Uma classe", "Uma estrutura de controle", "Um pacote"}, 0);
        questoes[14] = new Questao("Qual é o resultado da operação 5 / 2 em Java?",
                new String[]{"2", "2.5", "2.0", "1.5", "Erro"}, 0);

        // Variáveis para contagem de acertos e erros
        int acertos = 0;
        int erros = 0;

        // Loop pelas questões
        for (Questao questao : questoes) {
            System.out.println("\n" + questao.getPergunta());
            String[] alternativas = questao.getAlternativas();
            for (int i = 0; i < alternativas.length; i++) {
                System.out.println((i + 1) + ". " + alternativas[i]);
            }

            // Ler resposta do usuário
            System.out.print("Digite o número da sua resposta: ");
            int resposta = scanner.nextInt() - 1;

            // Verificar resposta
            if (questao.verificarResposta(resposta)) {
                acertos++;
                System.out.println("Resposta correta!");
            } else {
                erros++;
                System.out.println("Resposta incorreta.");
            }
        }

        // Resultados finais
        System.out.println("\nVocê acertou " + acertos + " questões e errou " + erros + " questões.");
        double porcentagem = (acertos / 15.0) * 100;
        System.out.printf("Sua porcentagem de acertos é: %.2f%%\n", porcentagem);

        scanner.close();
    }
}
