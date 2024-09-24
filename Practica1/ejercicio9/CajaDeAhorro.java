package ar.edu.unlp.info.oo1.Ejercicio9;

public class CajaDeAhorro extends Cuenta {
    double comision = 0.02;
    
    @Override
    public boolean extraer(double monto) {
        if( puedeExtraer(monto * comision)) {
        	super.extraer(monto);
        	this.saldo -= monto * comision;
        	return true;
        }
    	return false; 
    }
    
    @Override
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
    	if( puedeExtraer(monto * comision)) {
    		super.transferirACuenta(monto, cuentaDestino);
    		this.saldo -= monto * comision;
    		return true;
    	}
    	return false;
    }
    
    @Override
    public void depositar ( double monto) {
    	super.depositar(monto - (monto * comision));
    }
    
    public boolean puedeExtraer(double monto) {
        return (this.getSaldo() - monto > 0);
    }
}