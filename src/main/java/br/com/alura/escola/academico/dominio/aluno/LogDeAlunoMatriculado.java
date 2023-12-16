package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.academico.dominio.Ouvinte;
import br.com.alura.escola.academico.dominio.Evento;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {
    public void reageAo (Evento evento) {

        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd//MM//yyyy HH:mm"));

        System.out.printf("Aluno com CPF %s matriculado em: %s%n",
                ((AlunoMatriculado) evento).getCpfDoAluno(), momentoFormatado);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}