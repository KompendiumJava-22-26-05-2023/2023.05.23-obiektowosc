package pl.comarch.szkolenia.obiektowosc.enkapsulacja;

public class Square {
    private int bok;
    private int obw;
    private int pole;

    public Square(int bok) {
        this.setBok(bok);
    }

    public int getBok() {
        return bok;
    }

    public int getObw() {
        return obw;
    }

    public int getPole() {
        return pole;
    }

    public void setBok(int bok) {
        this.bok = bok;
        this.obw = bok *4;
        this.pole = bok * bok;
    }

    private void cos() {
        ///????
    }

    public void zrobCos() {
        ////????
        cos();
        //?????
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Square)) {
            return false;
        }
        Square square = (Square) obj;
        return this.bok == square.bok;
    }
}
