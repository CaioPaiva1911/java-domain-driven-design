package br.com.alura.escola.gameficacao.dominio.selo;

import br.com.alura.escola.academico.dominio.aluno.CPF;

public class Selo {

    private CPF cpfDoAluno;
    private String selo;

    public Selo(CPF cpfDoAluno, String selo) {
        this.cpfDoAluno = cpfDoAluno;
        this.selo = selo;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }

    public String getSelo() {
        return selo;
    }
}
