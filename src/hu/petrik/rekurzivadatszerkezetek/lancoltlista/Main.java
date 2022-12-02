package hu.petrik.rekurzivadatszerkezetek.lancoltlista;

public class Main {
    public static void main(String[] args) {
        LancoltLista<Integer> lista = new LancoltLista<>();
        int min = 0;
        int max = 20000;
        int elemszam = 100;
        for (int i = 0; i < elemszam; i++) {
            int ertek = ((int) (Math.random() * (max - min + 1))) + min;
            lista.hozzaAd(ertek);
        }
        System.out.println(lista);
    }
}
