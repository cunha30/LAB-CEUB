public class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(String numeroConta, String dataAbertura) {
        super(numeroConta, dataAbertura);
    }

    @Override
    public void depositarConta(double valor) {
        System.out.println("Operação não disponível em Conta Investimento.");
    }

    @Override
    public void sacarConta(double valor) {
        System.out.println("Operação não disponível em Conta Investimento.");
    }

    @Override
    public void depositarPoupanca(double valor) {
        System.out.println("Operação não disponível em Conta Investimento.");
    }

    @Override
    public void sacarPoupanca(double valor) {
        System.out.println("Operação não disponível em Conta Investimento.");
    }

    @Override
    public void aplicarInvestimento(double valor) {
        saldoInvestimento += valor;
        System.out.println("Aplicação realizada. Novo saldo em investimentos: " + saldoInvestimento);
    }

    @Override
    public void retirarAplicacao(double valor) {
        if (saldoInvestimento >= valor) {
            saldoInvestimento -= valor;
            System.out.println("Retirada de investimento realizada. Novo saldo: " + saldoInvestimento);
        } else {
            System.out.println("Saldo insuficiente em investimentos.");
        }
    }
}
