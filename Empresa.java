import java.util.ArrayList;

public class Empresa {
    private String NomeEmpresa;
    private int IDEmpresa;
    private ArrayList<TimeFutebol> Conjunto = new ArrayList<TimeFutebol>();

    public Empresa(String NomeEmpresa, int IDEmpresa) {
        this.NomeEmpresa = NomeEmpresa;
        this.IDEmpresa = IDEmpresa;
    }

    public String getNomeEmpresa() {
        return this.NomeEmpresa;
    }

    public void setNomeEmpresa(String NomeEmpresa) {
        this.NomeEmpresa = NomeEmpresa;
    }

    public int getIDEmpresa() {
        return this.IDEmpresa;
    }

    public void setIDEmpresa(int IDEmpresa) {
        this.IDEmpresa = IDEmpresa;
    }

    public void AdicionarTime(TimeFutebol timeFutebol) {
        Conjunto.add(timeFutebol);
    }

    public void ConsultaJogador(int ID) {
        for (int i = 0; i < Conjunto.size(); i++) {
            for (int j = 0; j < Conjunto.get(i).getConjunto().size(); j++) {
                if (Conjunto.get(i).getConjunto().get(j).getID() == ID) {
                    System.out.println("Time: " + Conjunto.get(i).getNomeTime());
                    System.out.println("Nome: " + Conjunto.get(i).getConjunto().get(j).getNome());
                    System.out.println("Salario Bruto: " + Conjunto.get(i).getConjunto().get(j).getSalario());
                    System.out.println("Salario Liquido: " + Conjunto.get(i).getConjunto().get(j).getSalarioLiquido());
                }
            }
            System.out.println();
        }
    }

    public void ListaJogador() {
        for (int i = 0; i < Conjunto.size(); i++) {
            System.out.println("Time: " + i + "\n");
            System.out.println("Nome do Time: " + Conjunto.get(i).getNomeTime());
            for (int j = 0; j < Conjunto.get(i).getConjunto().size(); j++) {
                System.out.println("Nome: " + Conjunto.get(i).getConjunto().get(j).getNome());
            }
            System.out.println();
        }
    }

    public void RelatorioFinanceiro() {
        float SalarioTotal = 0.0f;
        float INSSTotal = 0.0f;
        float ImpostoTotal = 0.0f;
        for (int i = 0; i < Conjunto.size(); i++) {
            for (int j = 0; j < Conjunto.get(i).getConjunto().size(); j++) {
                SalarioTotal += Conjunto.get(i).getConjunto().get(j).getSalarioLiquido();
                INSSTotal += Conjunto.get(i).getConjunto().get(j).getINSS();
                ImpostoTotal += Conjunto.get(i).getConjunto().get(j).getImposto();
            }
        }
        System.out.println("Salario Total: " + SalarioTotal);
        System.out.println("INSS Total: " + INSSTotal);
        System.out.println("Imposto Total: " + ImpostoTotal);
    }
}
