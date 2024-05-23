import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPhilippe = new Dev();
        devPhilippe.setNome("Philippe");
        devPhilippe.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Philippe " + devPhilippe.getConteudosInscritos());
        devPhilippe.progredir();
        devPhilippe.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos Philippe " + devPhilippe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Philippe" + devPhilippe.getConteudosConcluidos());
        System.out.println("XP: " + devPhilippe.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos João " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao .calcularTotalXp());


    }
}