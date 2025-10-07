import java.io.Serializable;
/**
 *
 * @author alexandrezamberlan
 */
public class Componente implements Serializable {
    public static final int FRUTA = 1, JOGADOR = 2, PLACAR = 3;
    public int x;
    public int y;
    public int largura;
    public int altura;
    public int tipo;
    public int pontuacao;
    public int idJogador;

    public Componente(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }
    
     public Componente(int tipo, int pontuacao, int idJogador) {
        this.tipo = tipo;
        this.pontuacao = pontuacao;
        this.idJogador = idJogador;
    }
}
