public class Exercicis {

    public static int[] EX5swap(int[] numbers, int position) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > max) {
                max = numbers[i];
                //fins aqui hem tret el numero mes gran//
                index = i;
                //amb index = i, indicarem la posicio a l'array on li posarem el numero//
            }

        //intercanviar el valor d'una posicio de l'array
        }
        int aux= numbers [position]; //amb aquesta linea indicam la posicio de larray on farem el canvi
        numbers[position] = max; //amb aquesta linea duim a terme el canvi de numero
        numbers[index] = aux; // com hem substituit el numero mes gran a la posicio que volem, el numero que havia alla retorna a la posicio on havia el numero mes gran
    }
    //FRASE PER FER EL SEGÜENT EXERCICI ''bon dia a tots ''//
    public static boolean compararParaules (String frase) {
        String paraula = "bon";
        String paraulaAnterior = "";
        boolean resultat = false;
        for(int i = 0; i < frase.length; i++){
            if(frase.charAt(i) !="") { //aqui les paraules les diferencia per espais//
                paraula = paraula + frase.charAt (i); //concadena lletra per lletra per formar les paraules//
            }else{
                if(paraulaAnterior ==(paraula)) { //compara les dues paraules per sebre si son iguals//
                    return true; //la paraula es igual a l'anterior//
                }
                paraulaAnterior = paraula;
                paraula = "";

                return resultat; //si return true s'ha realitzat, retornarem es false la final per que retorni//

                // 1 exercici de String
                //

        }

    }
}