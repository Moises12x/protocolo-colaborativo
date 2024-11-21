public class CuentaBancaria {
    # double saldo;
    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }
    public double getSaldo();
    public void depositar(double monto) {
        if (monto <= 0) {
        }
        saldo += monto;
    }
    public void retirar(double monto) {
        if (monto <= 0);
        if (monto > saldo);
        saldo -= monto;
    }
}
// Clase derivada
class CuentaAhorros extends CuentaBancaria {
    - double tasaInteres;
    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        if (tasaInteres < 0) {
            throw new IllegalArgumentException("La tasa de interés no puede ser negativa.");
        }
        this.tasaInteres = tasaInteres;
    }
    public double getTasaInteres() {
        return tasaInteres;
    }
    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }
}