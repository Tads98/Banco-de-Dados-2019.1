/*package sys.campeonato;

import java.util.Scanner;

import campeonato.Time;
import dao.TimeDAO;
import dao.TimeImpl;
import campeonato.Jogador;
import dao.JogadorDAO;
import dao.JogadorImpl;
import campeonato.Jogo;
import dao.JogoDAO;
import dao.JogoImpl;

public class InserindoDadosCampeonato {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner dados = new Scanner(System.in);
		TimeDAO timedao = new TimeImpl();
		JogadorDAO jogadordao = new JogadorImpl();
		JogoDAO jogodao = new JogoImpl();
		
		int opcao = -1;

		while(opcao != 0){
			System.out.println("-------MENU---------");
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Listar");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("1 - Time");
				System.out.println("2 - Jogador");
				System.out.println("3 - Jogo");
				int opcao2 = sc.nextInt();
				switch(opcao2) {
				case 1:
					System.out.print("Código do time: ");
					int codTime = dados.nextInt();
					dados = new Scanner(System.in);
					System.out.print("Nome do time: ");
					String nomeTime = dados.nextLine();
					System.out.print("Data de fundação do time: ");
					String datafundacao = dados.nextLine();
					Time t = new Time(codTime,nomeTime, datafundacao);
					timedao.salvarTime(t);
					System.out.println("Time adicionado");
					break;
				case 2:
					System.out.print("Código do jogador: ");
					int codJogador = dados.nextInt();
					System.out.print("Nome do jogador: ");
					String nomeJogador = dados.nextLine();
					System.out.print("Idade do jogador: ");
					int idade = dados.nextInt();
					System.out.print("Código do time: ");
					int timecod = dados.nextInt();
					Jogador jogador = new Jogador(codJogador, nomeJogador, idade, timecod);
					jogadordao.salvarJogador(jogador);
					System.out.println("Jogador adicionado");
					break;
				case 3:
					System.out.println("Código do jogo: ");
					int codJogo = dados.nextInt();
					System.out.println("Resultado do jogo: ");
					String resultado = dados.nextLine();
					System.out.println("Time A: ");
					int timea = dados.nextInt();
					System.out.println("Time B: ");
					int timeb = dados.nextInt();
					Jogo jogo = new Jogo(codJogo, resultado, timea, timeb);
					jogodao.salvarJogo(jogo);
					break;
				}
			case 2:
				System.out.println("1 - Time");
				System.out.println("2 - Jogador");
				System.out.println("3 - Jogo");
				int opcao3 = sc.nextInt();
				switch(opcao3) {
				case 1:
					// Time
					timedao.listarTodosTimes();
					break;
				case 2:
					// Jogador
					jogadordao.listarTodosJogadores();
					break;
				case 3:
					// Jogo
					jogodao.listarTodosJogos();
					break;
				}
			}
		}
	}
}*/
