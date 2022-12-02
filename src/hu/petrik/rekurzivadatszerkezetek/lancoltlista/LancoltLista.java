package hu.petrik.rekurzivadatszerkezetek.lancoltlista;

public class LancoltLista<T> {
    private Node elso;

    public void hozzaAd(T ertek){
        if (this.elso == null) {
            this.elso = new Node(ertek);
        } else {
            this.elso.hozzaAd(ertek);
        }
    }

    // TODO: benneVan(T ertek), torol(T ertek)

    @Override
    public String toString() {
        if (this.elso == null) {
            return "[]";
        }
        return "["+this.elso.toString() + "]";
    }

    private class Node {
        private T ertek;
        private Node kovetkezo;

        public Node(T ertek) {
            this.ertek = ertek;
        }

        public void hozzaAd(T ertek) {
            if (this.kovetkezo == null) {
                this.kovetkezo = new Node(ertek);
            } else {
                this.kovetkezo.hozzaAd(ertek);
            }
        }

        @Override
        public String toString() {
            String s = this.ertek.toString();
            if (this.kovetkezo != null) {
                s += ", " + this.kovetkezo.toString();
            }
            return s;
        }
    }
}
