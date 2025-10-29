package br.com.alura.screenmatch.calculator;

// Classe responsável por aplicar uma lógica de recomendação com base na classificação de um conteúdo
public class RecommendationFilter {
    private String recommendation;

    /*
     - Esse método recebe qualquer objeto que "promete" ter uma forma de se autoavaliar.
     - Isso acontece porque ele usa a interface Classifying, que obriga o objeto a ter o método getClassifying().
     - Com base na nota que o objeto dá para si mesmo (via getClassifying());
     Isso funciona para filmes, episódios ou qualquer outro tipo de conteúdo que implemente a interface Classifying
    */

    public void filter(Classifying classifying) {
        if(classifying.getClassifying() >= 4) {
            System.out.println("Está entre os favoritos do momento");
        } else if (classifying.getClassifying() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
