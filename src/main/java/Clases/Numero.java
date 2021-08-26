package Clases;

public class Numero {
    private int numeroUno;
    private int numeroDos;
    private int numeroTres;
    private int numeroCuatro;

    public Numero() {
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getNumeroTres() {
        return numeroTres;
    }

    public void setNumeroTres(int numeroTres) {
        this.numeroTres = numeroTres;
    }

    public int getNumeroCuatro() {
        return numeroCuatro;
    }

    public void setNumeroCuatro(int numeroCuatro) {
        this.numeroCuatro = numeroCuatro;
    }
    
    public Integer sumar(){
        return numeroUno+numeroDos+numeroTres+numeroCuatro;
    }
    
}
