package dio.digitalinnovation.bootcamp;

/**
 * Exemplos de boas práticas para a criação de variáveis
 * - Sempre começar com letra minúscula
 * - Nomes expressivos;
 * - Notação camelo;
 * - Quando constate(final), tudo maiúsculo e separado por "_"
 **/


public class main {

    public static void main(String[] args) {

        int i;
        //int i; - repetida
        //int 1a; - incorreta
        int I;
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;


        final int j = 10;
        // j = 15; - a variável é constante
        int asrn2064;
        // int asrn244 nd; - contém um espaço
        int asrn2541$41_md = 10;
        //int asrm25$49%9_md = 10; - contém caractere especial/palavra reservada.

        asrn2064 = 100;
        asrn2541$41_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; - mal definida
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; - mal definida com boas práticas para o final
        int QUANTIDADE_OPCOES = 25; // mal definida por não seguir uma boa prática
        // int qtdProd; - mal definida por falta de expressividade

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn2064);
        System.out.println(asrn2541$41_md);


        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);


    }
}