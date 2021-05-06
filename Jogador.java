public class Jogador {
    private String Nome;
    private String Nacionalidade;
    private String Categoria;
    private float Salario;
    private float SalarioLiquido;
    private float INSS;
    private float Imposto;
    private int ID;

    public Jogador(String no, String na, String c, float s, int id) {
        this.Nome = no;
        this.Nacionalidade = na;
        this.Categoria = c;
        this.Salario = s;
        this.ID = id;
        PagamentoSalario();
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String no) {
        this.Nome = no;
    }

    public String getNacionaldade() {
        return this.Nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.Nome = na;
    }

    public String getCategoria() {
        return this.Categoria;
    }

    public void setCategoria(String c) {
        this.Categoria = c;
    }

    public float getSalario() {
        return this.Salario;
    }

    public void setSalario(float s) {
        this.Salario = s;
    }

    public float getSalarioLiquido() {
        return this.SalarioLiquido;
    }

    public void setSalarioLiquido(float sl) {
        this.SalarioLiquido = sl;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public float getINSS() {
        return this.INSS;
    }

    public void setINSS(float INSS) {
        this.INSS = INSS;
    }

    public float getImposto() {
        return this.Imposto;
    }

    public void setImposto(float Imposto) {
        this.Imposto = Imposto;
    }

    public void PagamentoSalario() {
        System.out.print("Salario liquido do jogador: ");
        if (Salario <= 1100.00f) {
            SalarioLiquido = Salario - (Salario * 0.075f);
            INSS = Salario * 0.075f;
            Imposto = 0;
            System.out.println(Salario);
        } else if (Salario <= 2000.00f) {
            SalarioLiquido = Salario - (Salario * 0.09f) - (Salario * 0.075f);
            INSS = Salario * 0.09f;
            Imposto = Salario * 0.075f;
            System.out.println(Salario);
        } else if (Salario <= 3100.00f) {
            SalarioLiquido = Salario - (Salario * 0.12f) - (Salario * 0.15f);
            System.out.println(Salario);
            INSS = Salario * 0.12f;
            Imposto = Salario * 0.15f;
        } else if (Salario <= 4100.00f) {
            SalarioLiquido = Salario - (Salario * 0.14f) - (Salario * 0.22f);
            System.out.println(Salario);
            INSS = Salario * 0.14f;
            Imposto = Salario * 0.22f;
        } else if (Salario > 4100.00f) {
            SalarioLiquido = Salario - (Salario * 0.14f) - (Salario * 0.27f);
            INSS = Salario * 0.14f;
            Imposto = Salario * 0.27f;
            System.out.println(Salario);
        }
    }

    public void Status() {
        System.out.println("\nNome do jogador: " + this.Nome);
        System.out.println("Nacionalidade do jogador: " + this.Nacionalidade);
        System.out.println("Categoria do jogador: " + this.Categoria);
        System.out.println("Salario do jogador: " + this.Salario);
        System.out.println("ID do jogador: " + this.ID);
    }
}