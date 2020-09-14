package fatura;

public class FaturaTeste {
    public static void main(String[] args) {

        Fatura fatura = new Fatura(args[0], args[1], Integer.parseInt(args[2]), Double.parseDouble(args[3]));

        System.out.println("Código: " + fatura.getCodigo());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.printf("Preço: %.2f\n", fatura.getPreco());
        System.out.printf("Total: %.2f\n", fatura.totalFaturado());
    }
}
