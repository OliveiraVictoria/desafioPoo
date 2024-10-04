import br.com.poo.desafio.dominio.Bootcamp;
import br.com.poo.desafio.dominio.Curso;
import br.com.poo.desafio.dominio.Dev;
import br.com.poo.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Titulo");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVictoria = new Dev();
        devVictoria.setNome("Victoria");
        devVictoria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devVictoria.getConteudosInscrito());
        devVictoria.progredir();
        devVictoria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Victoria: " + devVictoria.getConteudosConcluido());
        System.out.println("Conteudos Inscritos" + devVictoria.getConteudosInscrito());
        System.out.println("XP" + devVictoria.calcularTotalXp());



        System.out.println("---------------");



        Dev devWallace = new Dev();
        devWallace.setNome("Wallace");
        devWallace.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devWallace.getConteudosInscrito());
        devWallace.progredir();
        devWallace.progredir();
        devWallace.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Wallace: " + devWallace.getConteudosConcluido());
        System.out.println("Conteudos Inscritos" + devWallace.getConteudosInscrito());
        System.out.println("XP" + devWallace.calcularTotalXp());
    }
}