// Arquivo: ContaBancaria.java
public abstract class ContaBancaria {
    private String numeroConta;
    private String dataAbertura;
    private boolean contaAtiva;
    private double saldoConta;
    private double saldoPoupanca;
    private double saldoInvestimento;

    public ContaBancaria(String numeroConta, String dataAbertura) {
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.contaAtiva = true;
        this.saldoConta = 0.0;
        this.saldoPoupanca = 0.0;
        this.saldoInvestimento = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public double getSaldoInvestimento() {
        return saldoInvestimento;
    }

    public abstract void depositarConta(double valor);
    public abstract void sacarConta(double valor);
}

// Arquivo: ContaCorrente.java
class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String numeroConta, String dataAbertura) {
        super(numeroConta, dataAbertura);
    }

    @Override
    public void depositarConta(double valor) {
        if (valor > 0) {
            System.out.println("Depositando R$" + valor + " na conta corrente.");
        }
    }

    @Override
    public void sacarConta(double valor) {
        System.out.println("Sacando R$" + valor + " da conta corrente.");
    }
}

// Arquivo: ContaPoupanca.java
class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String numeroConta, String dataAbertura) {
        super(numeroConta, dataAbertura);
    }

    @Override
    public void depositarConta(double valor) {
        System.out.println("Depositando R$" + valor + " na poupança.");
    }

    @Override
    public void sacarConta(double valor) {
        System.out.println("Sacando R$" + valor + " da poupança.");
    }
}

// Arquivo: ContaInvestimentos.java
class ContaInvestimentos extends ContaBancaria {
    public ContaInvestimentos(String numeroConta, String dataAbertura) {
        super(numeroConta, dataAbertura);
    }

    @Override
    public void depositarConta(double valor) {
        System.out.println("Depositando R$" + valor + " na conta de investimentos.");
    }

    @Override
    public void sacarConta(double valor) {
        System.out.println("Sacando R$" + valor + " da conta de investimentos.");
    }
}

// Arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345", "01/01/2023");
        contaCorrente.depositarConta(500);
        contaCorrente.sacarConta(200);

        ContaPoupanca contaPoupanca = new ContaPoupanca("67890", "02/01/2023");
        contaPoupanca.depositarConta(1000);
        contaPoupanca.sacarConta(300);

        ContaInvestimentos contaInvestimentos = new ContaInvestimentos("11223", "03/01/2023");
        contaInvestimentos.depositarConta(2000);
        contaInvestimentos.sacarConta(500);
    }
}
