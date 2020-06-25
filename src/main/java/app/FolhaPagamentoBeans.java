package app;

import domain.FolhaPagamentoRN;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Fabio Gomes Rocha
 */
@ManagedBean
@RequestScoped
public class FolhaPagamentoBeans {

    private double salarioLiquido, inss, salarioBruto, irrf;
    private FolhaPagamentoRN fprn;
    public FolhaPagamentoBeans() {
    }
    public void CalcularFolhaPagamento(){
         fprn = new FolhaPagamentoRN(this.salarioBruto);
         fprn.calcularInss();
         fprn.calcularIrrf();
         fprn.calcularSalarioLiquido();
         setInss(fprn.getInss());
         setIrrf(fprn.getIrrf());
         setSalarioLiquido(fprn.getSalarioLiquido());
    }
    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getIrrf() {
        return irrf;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }
    

    
    
    
}
