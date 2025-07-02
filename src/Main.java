import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Spring Boot");
        curso2.setDescricao("descrição do curso de SpringBoot");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp boot1 = new Bootcamp();
        boot1.setNome("Bootcamp Java Developer");
        boot1.setDescricao("Descrição Bootcamp Java Developer");
        boot1.getConteudos().add(curso1);
        boot1.getConteudos().add(curso2);
        boot1.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(boot1);
        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(boot1);

        dev1.infoCursos();
        dev2.infoCursos();
        System.out.println("O Xp do(a) "+ dev1.getNome() + " é: " + dev1.calcularTotalXp());
        System.out.println("O Xp do(a) "+ dev2.getNome() + " é: " + dev2.calcularTotalXp());
        dev1.progredir();
        dev2.progredir();
        System.out.println("------------------");
        dev1.infoCursos();
        dev2.infoCursos();
        System.out.println("O Xp do(a) "+ dev1.getNome() + " é: " + dev1.calcularTotalXp());
        System.out.println("O Xp do(a) "+ dev2.getNome() + " é: " + dev2.calcularTotalXp());
    }
}