package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
   private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // Para ser adicionado na ordem de inscrição
    private Set<Conteudo> ConteudosConcluido = new LinkedHashSet<>(); // Polimorfismo

    // Criar os metodos

    public void inscreverBootcamp (Bootcamp bootcamp) {}

    public void progressoBootcamp () {}

    public void calcularTotalXp () {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluido() {
        return ConteudosConcluido;
    }

    public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
        ConteudosConcluido = conteudosConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(ConteudosConcluido, dev.ConteudosConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, ConteudosConcluido);
    }
}
