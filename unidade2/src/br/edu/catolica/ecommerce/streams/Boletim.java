package br.edu.catolica.ecommerce.streams;

import java.util.List;

public class Boletim {

    private Aluno aluno;
    private List<Double> notas;
    public Boletim(Aluno aluno, List notas) {
        this.aluno = aluno;
        this.notas = notas;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public List<Double> getNotas() {
        return notas;
    }
    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    

    
}