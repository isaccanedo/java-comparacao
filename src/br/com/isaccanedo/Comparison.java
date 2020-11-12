package br.com.isaccanedo;

/**
 * @author Isac Canedo
 */

public class Comparison {

    private int i, j, k;

    public Comparison(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public static void main(String[] args) {

        Comparison
                a = new Comparison(1, 2, 3),
                b = new Comparison(1, 2, 3);
        
        // Executa as comparações
        System.out.println(a == a);
        System.out.println(b == b);
        System.out.println(a == b);
        System.out.println(b == a);
    }
}
