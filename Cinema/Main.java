public class Main {
    public static void main(String[] args) {

        
        Cliente Roger = new Cliente("Roger", "138.829.999-26");
        Cliente Davi = new Cliente("Davi", "479.745.627-19");
        Cliente Alfredo = new Cliente("Alfredo", "111.222.333-44");
        Cliente Lucas = new Cliente("Lucas", "222.333.444-55");
        Cliente Matheus = new Cliente("Matheus", "333.444.555-66");
        Cliente Gabriel = new Cliente("Gabriel", "444.555.666-77");
        Cliente Pedro = new Cliente("Pedro", "555.666.777-88");
        Cliente Laura = new Cliente("Laura", "666.777.888-99");
        Cliente Mariana = new Cliente("Mariana", "777.888.999-00");
        Cliente Beatriz = new Cliente("Beatriz", "888.999.000-11");


        
        Filme filme_1 = new Filme(
                "Piratas do Caribe: No Fim do Mundo",
                "16 anos",
                "ação, aventura e fantasia"
        );

        Filme filme_2 = new Filme(
                "Rei Leão",
                "Livre",
                "Aventura"
        );

        Filme filme_3 = new Filme(
                "Batman: O Cavaleiro das Trevas",
                "12 anos",
                "Ação"
        );

        Filme filme_4 = new Filme(
                "Interestelar",
                "10 anos",
                "Ficção Científica"
        );

        Filme filme_5 = new Filme(
                "Top Gun",
                "12 anos",
                "Fantasia"
        );

        Filme filme_6 = new Filme(
                "Vingadores",
                "12 anos",
                "Aventura"
        );

        Filme filme_7 = new Filme(
                "Homem de Ferro",
                "12 anos",
                "Ação"
        );

        Filme filme_8 = new Filme(
                "Toy Story",
                "Livre",
                "Animação"
        );


        Sessao sessao_1 = new Sessao(filme_1.getTitulo(), 100, "14:00");
        Sessao sessao_2 = new Sessao(filme_2.getTitulo(), 80, "15:30");
        Sessao sessao_3 = new Sessao(filme_3.getTitulo(), 90, "17:00");
        Sessao sessao_4 = new Sessao(filme_4.getTitulo(), 100, "18:30");
        Sessao sessao_5 = new Sessao(filme_5.getTitulo(), 120, "19:30");
        Sessao sessao_6 = new Sessao(filme_6.getTitulo(), 100, "20:30");
        Sessao sessao_7 = new Sessao(filme_7.getTitulo(), 80, "21:30");
        Sessao sessao_8 = new Sessao(filme_8.getTitulo(), 60, "22:00");


        Ingresso ingresso_1 = new Ingresso(
                "R$ 30,00",
                 sessao_1,
                  "A10",
                   Roger
        );
        Ingresso ingresso_2 = new Ingresso(
                "R$ 30,00",
                 sessao_2,
                  "A11",
                   Davi
        );
        Ingresso ingresso_3 = new Ingresso(
                "R$ 35,00",
                 sessao_3,
                  "B05",
                   Alfredo
        );
        Ingresso ingresso_4 = new Ingresso(
                "R$ 30,00",
                 sessao_4,
                  "B06",
                   Lucas
        );
        Ingresso ingresso_5 = new Ingresso(
                "R$ 35,00",
                 sessao_5,
                  "C10",
                   Matheus
        );
        Ingresso ingresso_6 = new Ingresso(
                "R$ 30,00",
                 sessao_6,
                  "C11",
                   Gabriel
        );
        Ingresso ingresso_7 = new Ingresso(
                "R$ 30,00",
                 sessao_7,
                  "D05",
                   Pedro
        );
        Ingresso ingresso_8 = new Ingresso(
                "R$ 20,00",
                 sessao_8,
                  "D06",
                   Laura
        );
        Ingresso ingresso_9 = new Ingresso(
                "R$ 25,00",
                 sessao_1,
                  "E01",
                   Mariana
        );
        Ingresso ingresso_10 = new Ingresso(
                "R$ 25,00",
                 sessao_2,
                  "E02",
                   Beatriz
        
        );


        System.out.println("===== CLIENTES =====");

        Roger.exibirDados();
        System.out.println();

        Davi.exibirDados();
        System.out.println();

        Alfredo.exibirDados();
        System.out.println();

        Lucas.exibirDados();
        System.out.println();
        
        Matheus.exibirDados();
        System.out.println();

        Gabriel.exibirDados();
        System.out.println();

        Pedro.exibirDados();
        System.out.println();

        Laura.exibirDados();
        System.out.println();

        Mariana.exibirDados();
        System.out.println();

        Beatriz.exibirDados();
        System.out.println();

        
        System.out.println("\n===== FILMES =====");

        filme_1.exibirDados();
        System.out.println();

        filme_2.exibirDados();
        System.out.println();

        filme_3.exibirDados();
        System.out.println();

        filme_4.exibirDados();
        System.out.println();

        filme_5.exibirDados();
        System.out.println();

        filme_6.exibirDados();
        System.out.println();

        filme_7.exibirDados();
        System.out.println();

        filme_8.exibirDados();


        System.out.println("\n===== SESSÕES =====");

        sessao_1.exibirDados();
        System.out.println();

        sessao_2.exibirDados();
        System.out.println();

        sessao_3.exibirDados();
        System.out.println();

        sessao_4.exibirDados();
        System.out.println();

        sessao_5.exibirDados();
        System.out.println();

        sessao_6.exibirDados();
        System.out.println();

        sessao_7.exibirDados();
        System.out.println();

        sessao_8.exibirDados();
        System.out.println();


        System.out.println("\n===== INGRESSOS =====");

        ingresso_1.exibirDados();
        System.out.println();

        ingresso_2.exibirDados();
        System.out.println();

        ingresso_3.exibirDados();
        System.out.println();

        ingresso_4.exibirDados();
        System.out.println();

        ingresso_5.exibirDados();
        System.out.println();

        ingresso_6.exibirDados();
        System.out.println();

        ingresso_7.exibirDados();
        System.out.println();

        ingresso_8.exibirDados();
        System.out.println();

        ingresso_9.exibirDados();
        System.out.println();

        ingresso_10.exibirDados();
        System.out.println();
    }
}        
