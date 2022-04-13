import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        int max = 10, r, n;
        Random random = new Random();
        try {
            for(int i = 0; i < max; i++) {
                r = Math.abs(random.nextInt() % max);
                p.push(r);
                System.out.println("Empilhou: " + r);
            }
            System.out.println("Tamanho da pilha: " + p.tamanho());
            for (int i = 0; i < max; i++) {
                n = (int) p.pop();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Tamanho da pilha: " + p.tamanho());
        }
    }
}
