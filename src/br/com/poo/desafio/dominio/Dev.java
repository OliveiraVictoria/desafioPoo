package br.com.poo.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();
    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluido.add(conteudo.get());
            this.conteudosInscrito.remove(conteudo.get());
        }else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }
    public double calcularTotalXp() {
        return this.conteudosConcluido
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }








    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosConcluido() {
        return conteudosConcluido;
    }

    public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
        this.conteudosConcluido = conteudosConcluido;
    }

    public Set<Conteudo> getConteudosInscrito() {
        return conteudosInscrito;
    }

    public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
        this.conteudosInscrito = conteudosInscrito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosConcluido, dev.conteudosConcluido) && Objects.equals(conteudosInscrito, dev.conteudosInscrito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosConcluido, conteudosInscrito);
    }
}
