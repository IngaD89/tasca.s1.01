package org.example.n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Editor> editors = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        String answer = "";
        String name = "";
        String dni = "";
        int editorId = -1;
        int articleId = -1;
        String title = "";

        do {
            System.out.println("""
                    Tria una opciò:\s
                    1. Introduir redactor.\s
                    2. Eliminar redactor.\s
                    3. Introduir notícia a un redactor.\s
                    4. Eliminar notícia.\s
                    5. Mostrar totes les notícies per redactor.\s
                    6. Calcular puntuació de la notícia.\s
                    7. Calcular preu de la notícia.\s
                    8. Surtir del programa.\s
                    """
            );

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Introdueix el teu nom");
                    name = scanner.nextLine();
                    System.out.println("Introdueix el teu DNI");
                    dni = scanner.nextLine();

                    editorId = findEditor(dni);
                    answer = createEditor(editorId, name, dni);
                    break;

                case 2:
                    System.out.println("Introdueix el DNI del editor per esborrar");
                    dni = scanner.nextLine();

                    editorId = findEditor(dni);
                    answer = deleteEditor(editorId);
                    break;

                case 3:
                    System.out.println("Introdueix DNI del editor");
                    dni = scanner.nextLine();

                    editorId = findEditor(dni);
                    answer = createNewsForEditor(editorId);
                    break;

                case 4:
                    System.out.println("Introdueix DNI del editor");
                    dni = scanner.nextLine();
                    editorId = findEditor(dni);
                    System.out.println("Introdueix títol d'article");
                    title = scanner.nextLine();

                    articleId = findArticle(editorId, title);
                    answer = deleteArticle(editorId, articleId);
                    break;

                case 5:
                    System.out.println("Introdueix DNI del editor");
                    dni = scanner.nextLine();

                    editorId = findEditor(dni);
                    answer = getAllArticles(editorId);
                    break;

                case 6:
                    System.out.println("Introdueix DNI del editor");
                    dni = scanner.nextLine();
                    editorId = findEditor(dni);
                    System.out.println("Introdueix títol d'article");
                    title = scanner.nextLine();

                    articleId = findArticle(editorId, title);
                    answer = showNewsRate(editorId, articleId);
                    break;

                case 7:
                    System.out.println("Introdueix DNI del editor");
                    dni = scanner.nextLine();
                    editorId = findEditor(dni);
                    System.out.println("Introdueix títol d'article");
                    title = scanner.nextLine();

                    articleId = findArticle(editorId, title);
                    answer = showNewsPrice(editorId, articleId);
                    break;

                case 8:
                    answer = "Adeú";
                    break;
            }
            System.out.println(answer);
        } while (option != 8);
    }

    public static String createEditor(int editorId, String name, String dni) {
        String answer = "";

        if (editorId == -1) {
            Editor editor = new Editor(name, dni);
            editors.add(editor);
            answer = "Editor amb el nom " + name + " y amb el DNI " + dni + " creat satisfactoriament";
        } else {
            answer = "Editor am el DNI " + dni + " ya existeix";
        }
        return answer;
    }


    public static String deleteEditor(int editorId) {
        String answer = "";

        if (editorId == -1) {
            answer = "Editor not found";
        } else {
            editors.remove(editorId);
            answer = "Editor eliminado satsfactoriamente";
        }
        return answer;
    }

    public static String createNewsForEditor(int editorId) {
        String answer = "";
        String title = "";
        String competition = "";
        String club = "";
        String player = "";
        String racingTeam = "";
        String team = "";
        int newsOption = 0;

        if (editorId == -1) {
            answer = "Editor not foud";
        } else {
            System.out.println("""
                    Tria tipus de noticia:\s
                    1. Football\s
                    2. Basket\s
                    3. F1\s
                    4. Tennis\s
                    5. Moto\s
                    """
            );
            newsOption = scanner.nextInt();
            scanner.nextLine();

            switch (newsOption) {

                case 1:
                    System.out.println("Introdueix títol del article");
                    title = scanner.nextLine();
                    System.out.println("Introdueix competition");
                    competition = scanner.nextLine();
                    System.out.println("Introdueix club");
                    club = scanner.nextLine();
                    System.out.println("Introdueix jugador");
                    player = scanner.nextLine();

                    News footballNews = new FootballNews(title, competition, club, player);
                    editors.get(editorId).setNews(footballNews);
                    answer = "Noticia '" + title + "' creat satisfactoriament";
                    break;

                case 2:
                    System.out.println("Introdueix títol del article");
                    title = scanner.nextLine();
                    System.out.println("Introdueix competition");
                    competition = scanner.nextLine();
                    System.out.println("Introdueix club");
                    club = scanner.nextLine();

                    News basketNews = new BasketNews(title, competition, club);
                    editors.get(editorId).setNews(basketNews);
                    answer = "Noticia '" + title + "' creat satisfactoriament";
                    break;

                case 3:
                    System.out.println("Introdueix títol del article");
                    title = scanner.nextLine();
                    System.out.println("Introdueix escuderia");
                    racingTeam = scanner.nextLine();

                    News formulaNews = new FormulaNews(title, racingTeam);
                    editors.get(editorId).setNews(formulaNews);
                    answer = "Noticia '" + title + "' creat satisfactoriament";
                    break;

                case 4:
                    System.out.println("Introdueix títol del article");
                    title = scanner.nextLine();
                    System.out.println("Introdueix competition");
                    competition = scanner.nextLine();
                    System.out.println("Introdueix jugador");
                    player = scanner.nextLine();

                    News tennisNews = new TennisNews(title, competition, player);
                    editors.get(editorId).setNews(tennisNews);
                    answer = "Noticia '" + title + "' creat satisfactoriament";
                    break;

                case 5:
                    System.out.println("Introdueix títol del article");
                    title = scanner.nextLine();
                    System.out.println("Introdueix escuderia");
                    team = scanner.nextLine();

                    News motoNews = new MotoNews(title, team);
                    editors.get(editorId).setNews(motoNews);
                    answer = "Noticia '" + title + "' creat satisfactoriament";
                    break;
            }
        }
        return answer;
    }

    public static String deleteArticle(int editorId, int articleId) {
        String answer = "";

        if (editorId == -1 || articleId == -1) {
            answer = "Redactor o article no s'ha trobat";
        } else {
            ArrayList<News> news = editors.get(editorId).getNews();
            news.remove(articleId);
            answer = "Article eliminat satisfactoriament";
        }

        return answer;
    }

    public static String getAllArticles(int editorId) {
        String answer = "";

        ArrayList<News> allNews = editors.get(editorId).getNews();
        for (News news : allNews) {
            answer = news.toString();
        }
        return answer;
    }

    public static String showNewsRate(int editorId, int articleId) {
        News news = editors.get(editorId).getNews().get(articleId);
        double newsRate = news.calculateNewsRate();

        return "Puntuaciò de la noticia es " + newsRate + " punts";
    }

    public static String showNewsPrice(int editorId, int articleId) {
        News news = editors.get(editorId).getNews().get(articleId);
        double newsPrice = news.calculateNewsPrice();

        return "El preu de la noticia es " + newsPrice + " euros";
    }

    public static int findEditor(String dni) {
        boolean found = false;
        int editorId = -1;
        int i = 0;

        while (i < editors.size() && !found) {
            if (editors.get(i).getDni().equals(dni)) {
                editorId = i;
                found = true;
            }
            i++;
        }
        return editorId;
    }

    public static int findArticle(int editorId, String title) {
        boolean found = false;
        int articleId = -1;
        int i = 0;


        ArrayList<News> news = editors.get(editorId).getNews();

        while (i < news.size() && !found) {
            if (news.get(i).getTitle().equalsIgnoreCase(title)) {
                articleId = i;
                found = true;
            }
            i++;
        }

        return articleId;
    }
}
