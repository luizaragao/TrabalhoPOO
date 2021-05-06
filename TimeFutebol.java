import java.util.ArrayList;

public class TimeFutebol {
    private String NomeTime;
    private String CategoriaTime;
    private int IDTime;
    private ArrayList<Jogador> Conjunto = new ArrayList<Jogador>();

    public TimeFutebol(String not, String ct, int idt) {
        this.NomeTime = not;
        this.CategoriaTime = ct;
        this.IDTime = idt;
    }

    public String getNomeTime() {
        return this.NomeTime;
    }

    public void setNomeTime(String not) {
        this.NomeTime = not;
    }

    public String getCategoriaTime() {
        return this.CategoriaTime;
    }

    public void setCategoriaTime(String ct) {
        this.CategoriaTime = ct;
    }

    public int getIDTime() {
        return this.IDTime;
    }

    public void setIDTime(int idt) {
        this.IDTime = idt;
    }

    public void AdicionarJogador(Jogador jogador) {
        Conjunto.add(jogador);
    }

    public ArrayList<Jogador> getConjunto() {
        return this.Conjunto;
    }

    public void setConjunto(ArrayList<Jogador> Conjunto) {
        this.Conjunto = Conjunto;
    }

    public void RelatorioGeral() {
        for (int i = 0; i < Conjunto.size(); i++) {
            System.out.println("Jogador: " + i);
            System.out.println("Nome: " + Conjunto.get(i).getNome());
            System.out.println("Nacionalidade: " + Conjunto.get(i).getNacionaldade());
            System.out.println("Categoria: " + Conjunto.get(i).getCategoria());
            System.out.println("ID: " + Conjunto.get(i).getID() + "\n");
        }
    }

    public void RelatorioFinanceiro() {
        for (int i = 0; i < Conjunto.size(); i++) {
            System.out.println("Jogador: " + i);
            System.out.println("Nome: " + Conjunto.get(i).getNome());
            System.out.println("Salario Bruto: " + Conjunto.get(i).getSalario());
            System.out.println("Salario Liquido: " + Conjunto.get(i).getSalarioLiquido() + "\n");
        }
    }

    public void StatusTime() {
        System.out.println("\nNome do time: " + this.NomeTime);
        System.out.println("Categoria do time: " + this.CategoriaTime);
        System.out.println("ID do time: " + this.IDTime);
    }
}
