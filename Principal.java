public class Principal {
    public static void main(String[] args) {
        Jogador j[] = new Jogador[4];
        j[0] = new Jogador("Carlos", "Brasileiro", "Profissional", 7500.00f, 50143);
        j[1] = new Jogador("Rubens", "Argentino", "Base", 1600.00f, 50240);
        j[2] = new Jogador("Lorenzo", "Uruguaio", "Base", 2200.00f, 50274);
        j[3] = new Jogador("Isabelo", "Italiano", "Profissional", 6200.00f, 50098);

        TimeFutebol T1 = new TimeFutebol("Pelotas", "Futebol", 8);
        T1.AdicionarJogador(j[0]);
        T1.AdicionarJogador(j[1]);
        T1.RelatorioGeral();
        T1.RelatorioFinanceiro();

        System.out.println("==========================");

        TimeFutebol T2 = new TimeFutebol("Atletico", "Futebol", 9);
        T2.AdicionarJogador(j[2]);
        T2.AdicionarJogador(j[3]);
        T2.RelatorioGeral();
        T2.RelatorioFinanceiro();

        System.out.println("==========================");

        Empresa Elias = new Empresa("Clube", 4270);
        Elias.AdicionarTime(T1);
        Elias.AdicionarTime(T2);
        Elias.ListaJogador();
        Elias.ConsultaJogador(50143);
        Elias.RelatorioFinanceiro();
    }
}