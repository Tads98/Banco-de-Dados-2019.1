package sys.ControleFila;
import java.util.*;

import ControleFila.Cliente;
import ControleFila.Estabelecimento;
import ControleFila.Fila;
import ControleFila.Servico;
import dao.ClienteDAO;
import dao.ClienteImpl;
import dao.EstabelecimentoDAO;
import dao.EstabelecimentoImpl;
import dao.FilaDAO;
import dao.FilaImpl;
import dao.ServicoDAO;
import dao.ServicoImpl;


public class InserindoDadosControleFila {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner dados = new Scanner(System.in);
		ClienteDAO clientedao = new ClienteImpl();
		EstabelecimentoDAO estabelecimentodao = new EstabelecimentoImpl();
		FilaDAO filadao = new FilaImpl();
		ServicoDAO servicodao = new ServicoImpl();
		List<Estabelecimento> estabelecimentos = estabelecimentodao.listarTodosEstabelecimento();
		List<Cliente> clientes = clientedao.listarTodosCliente();
		List<Fila> filas = filadao.listarTodosFila();
		List<Servico> servicos = servicodao.listarTodosServico();
		Estabelecimento estabelecimento = new Estabelecimento();
		Cliente cliente = new Cliente();
		Fila fila = new Fila();
		Servico servico = new Servico();
		EstabelecimentoImpl estabelecimentoImpl = new EstabelecimentoImpl();
		ClienteImpl clienteImpl = new ClienteImpl();
		FilaImpl filaImpl = new FilaImpl();
		ServicoImpl servicoImpl = new ServicoImpl();

		int opcao = -1;
		int opcao1=-1;
		int opcao2=-1;
		int opcao3=-1;
		int opcao4=-1;
		int opcao5=-1;
		int opcao6=-1;
		int opcao7=-1;

		do {
			System.out.println("-------MENU---------");
			System.out.println("0- Finalizar Ações");
			System.out.println("1- Salvar Informações");
			System.out.println("2- Listar Informações");
			System.out.println("3- Atualizar Informações");
			System.out.println("4- Excluir Informações");
			System.out.println("5- Visualizar ClienteExp");
			System.out.print("Digite a opção desejada: ");
			opcao = sc.nextInt();
			if (opcao == 1) {
				do{
					System.out.println("Inserir");
					System.out.println("0 - Sair");
					System.out.println("1 - Cliente");
					System.out.println("2 - Estabelecimento");
					System.out.println("3 - Fila");
					System.out.println("4 - Servico");		
					opcao1 = sc.nextInt();
					switch(opcao1){
					/*case 0:
					break;*/
					case 1:
						System.out.print("ID Cliente: ");
						int id = dados.nextInt();
						dados = new Scanner(System.in);
						System.out.print("Nome do cliente: ");
						String nome = dados.nextLine();
						System.out.print("Idade do Cliente: ");
						int idadeCliente = dados.nextInt();
						System.out.print("Telefone do Cliente: ");
						int telefone = dados.nextInt();
						System.out.print("Horário do Cliente: ");
						String horario = dados.next();
						System.out.print("dia do Cliente: ");
						String dia = dados.next();
						Cliente c = new Cliente(id,nome,telefone,idadeCliente,horario,dia);
						clientedao.salvarCliente(c);
						System.out.println("Cliente adicionado");
						break;
					case 2:
						System.out.print("ID Estabelecimento: ");
						int idEstabelecimento = dados.nextInt();
						dados = new Scanner(System.in);
						System.out.print("Nome do Estabelecimento: ");
						String nomeEstabelecimento = dados.next();
						System.out.print("CNPJ do Estabelecimento: ");
						String cnpj = dados.next();
						System.out.print("Inicio do Expediente: ");
						String ini = dados.next();
						System.out.print("Fim do Expediente: ");
						String fin = dados.next();
						Estabelecimento e = new Estabelecimento(idEstabelecimento,nomeEstabelecimento,cnpj,ini,fin);
						estabelecimentodao.salvarEstabelecimento(e);
						System.out.print("Estabelecimento adicionado");
						break;
					case 3:
						System.out.println("Id da Fila:");
						int idFila = dados.nextInt();
						dados = new Scanner(System.in);
						System.out.println("Nome da fila:");
						String nomeFila = dados.next();
						System.out.println("Dia da fila:");
						String diaFila = dados.next();
						System.out.println("Horario da fila:");
						String horaFila = dados.next();					
						Fila f = new Fila(idFila,nomeFila,diaFila,horaFila);
						filadao.salvarFila(f);
						System.out.println("Fila adicionado");
						break;
					case 4:
						System.out.println("Id do Servico");
						int idServico = dados.nextInt();
						dados = new Scanner(System.in);
						System.out.println("Nome do Servico");
						String nomeServico = dados.next();
						System.out.println("Tempo de duração do serviço");
						String tempoServico =dados.next();
						System.out.println("Dia do serviço");
						String diaServico =dados.next();
						System.out.println("Profissional do servico");
						String profissionalServico =dados.next();
						Servico s = new Servico(idServico,nomeServico,tempoServico,diaServico,profissionalServico);
						servicodao.salvarServico(s);
						System.out.println("Servico adicionado");
						break;					
					default:
							System.out.println("Opcao Invalida, digite novamente!!!");
						break;
					}
				}while(opcao1 != 0);
			}

			if (opcao == 2) {
				do{
					System.out.println(" Listar ");	
					System.out.println("0 - Sair");	
					System.out.println("1 - Cliente");
					System.out.println("2 - Estabelecimento");
					System.out.println("3 - Fila");
					System.out.println("4 - Servico");
					System.out.print("Digite uma opcao:");
					opcao2 = sc.nextInt();
						switch(opcao2) {
						case 0:
						break;
						case 1:
							// Cliente
							Cliente clienteO; 					
							for (int i=0; i<clientes.size(); i++) {
								clienteO = clientes.get(i);
								System.out.println("Id:"+clienteO.getId()+" Nome:"+clienteO.getNome()+" Idade"+clienteO.getIdadeCliente()+"  Telefone:"+clienteO.getTelefone()+" "+clienteO.getHorario()+" "+clienteO.getDia());								
								System.out.println("-------------------------------------------");
							}
							break;
						case 2:
							Estabelecimento estabelecimentoO; 					
							for (int i=0; i<estabelecimentos.size(); i++) {
								estabelecimentoO = estabelecimentos.get(i);
								System.out.println(" Id:"+estabelecimentoO.getIdEstabelecimento()+" Nome:"+estabelecimentoO.getNomeEstabelecimento()+" Cnpj:"+estabelecimentoO.getCnpj()+" Iinicio:"+estabelecimentoO.getIni()+" Fim:"+estabelecimentoO.getFin());								
								System.out.println("-------------------------------------------");
							}
							break;
						case 3:
							// Fila
							Fila filaO; 					
							for (int i=0; i<filas.size(); i++) {
								filaO = filas.get(i);
								System.out.println(" Id:"+filaO.getIdFila()+" Nome:"+filaO.getNomeFila()+" Dia:"+filaO.getDiaFila()+" Inicio:"+filaO.getHoraFila());								
								System.out.println("-------------------------------------------");
							}
							break;
						case 4:
							Servico servicoO; 					
							for (int i=0; i<servicos.size(); i++) {
								servicoO = servicos.get(i);
								System.out.println(" Id:"+servicoO.getIdServico()+" Nome:"+servicoO.getNomeServico()+" Tempo:"+servicoO.getTempoServico()+" Dia:"+servicoO.getDiaServico()+" Profissional:"+servicoO.getProfissionalServico());								
								System.out.println("-------------------------------------------");
							}								
							break;
						default:
							System.out.println("Opcao Invalida, digite novamente!!!");
						break;
					}
				}while(opcao2 != 0);
			}

			if (opcao == 3) {
				do{
				System.out.println("Atualizar");
				System.out.println("0 - Sair");
				System.out.println("1 - Cliente");
				System.out.println("2 - Estabelecimento");
				System.out.println("3 - Fila");
				System.out.println("4 - Servico");
				opcao3 = sc.nextInt();
					switch(opcao3) {
					case 0:
					break;
					case 1:
						// Cliente
						Scanner read1 = new Scanner(System.in);
						System.out.print("Digite  ID de um cliente: ");							
						int entradaIDC = read1.nextInt();
						System.out.print("Digite um novo nome: ");
						String nomec = read1.next();
						System.out.print("Digite uma nova idade: ");
						int idade = read1.nextInt();
						System.out.print("Digite um novo telefone: ");
						int tel = read1.nextInt();
						System.out.print("Digite o horario: ");
						String hora = read1.next();
						System.out.print("Digite um novo dia: ");
						String dia = read1.next();
						System.out.println("Cliente Atualizado");
						clienteImpl.atualizarCliente(entradaIDC,nomec,idade,tel, hora, dia);
						break;
					case 2:
						// Estabelecimento
						Scanner read2 = new Scanner(System.in);
						System.out.print("Digite o ID de um estabelecimento: ");							
						int entradaIDE = read2.nextInt();
						System.out.print("Digite um novo nome: ");
						String nomee = read2.next();
						System.out.print("Digite um novo Cnpj: ");
						String cnpje = read2.next();
						System.out.print("Digite um novo Inicio de Expediente: ");
						String inie = read2.next();
						System.out.print("Digite um novo Fimde Expediente: ");
						String fine = read2.next();
						System.out.println("Estabelecimento Atualizado");
						estabelecimentoImpl.atualizarEstabelecimento(entradaIDE,nomee,cnpje,inie,fine);
						break;
					case 3:
						// Fila
						Scanner read3 = new Scanner(System.in);
						System.out.print("Digite o ID de uma fila: ");							
						int entradaIDF = read3.nextInt();
						System.out.print("Digite um novo nome: ");
						String nomef = read3.next();
						System.out.print("Digite um novo dia: ");
						String diaf = read3.next();	
						System.out.print("Digite uma nova hora: ");
						String horaf = read3.next();
						System.out.println("fila Atualizada");
						filaImpl.atualizarFila(entradaIDF,nomef,diaf,horaf);
						break;
					case 4:
						// Serviço
						Scanner read4 = new Scanner(System.in);
						System.out.print("Digite o ID de um servico: ");							
						int entradaIDS = read4.nextInt();
						System.out.print("Digite um novo nome: ");
						String nomes = read4.next();
						System.out.print("Digite um novo tempo: ");
						String tempos = read4.next();
						System.out.print("Digite um novo dia: ");
						String dias = read4.next();
						System.out.print("Digite um novo Profissional: ");
						String profis = read4.next();
						System.out.println("Servico Atualizado");
						servicoImpl.atualizarServico(entradaIDS,nomes,tempos,dias,profis);
						break;					
					default:
							System.out.println("Opcao Invalida, digite novamente!!!");
						break;
					}
				}while(opcao3 != 0);
			}

			if (opcao == 4) {
				do{
					System.out.println(" Excluir ");
					System.out.println("0 - Sair");
					System.out.println("1 - Cliente");
					System.out.println("2 - Estabelecimento");
					System.out.println("3 - Fila");
					System.out.println("4 - Servico");
					opcao4 = sc.nextInt();
						switch(opcao4) {
						case 0:
						break;
						case 1:
							// Cliente
							System.out.println("Digite o id do Cliente: ");
							Scanner read1 = new Scanner(System.in);
							
							int idret1 = read1.nextInt();
							
							cliente = null;
							
							for(int i=0;i<clientes.size();i++) {
								if(clientes.get(i).getId() == idret1) {
									//System.out.println("Achou");
									cliente = clientes.get(i);
									break;
								}
							}
							
							if (cliente!=null) {
								System.out.println(cliente.getNome());
								clienteImpl.deletarCliente(cliente);
								System.out.println("Cliente excluído");
							} else {
								System.out.println("Cliente não existente");
							}
							
							/*clienteImpl.deletarCliente(cliente);*/
							break;
							
						case 2:
							System.out.println("Digite o id do estabelecimento: ");
							Scanner read2 = new Scanner(System.in);

							int idret2 = read2.nextInt();
							
							estabelecimento = null;
							
							for(int i=0;i<estabelecimentos.size();i++) {
								if(estabelecimentos.get(i).getIdEstabelecimento() == idret2) {
									//System.out.println("Achou");
									estabelecimento = estabelecimentos.get(i);
									break;
								}
							}
							
							if (estabelecimento!=null) {
								System.out.println(estabelecimento.getNomeEstabelecimento());
								estabelecimentoImpl.deletarEstabelecimento(estabelecimento);
								System.out.println("Estabelecimento excluído");
							} else {
								System.out.println("Estabelecimento não existente");
							}
							break;
							
						case 3:
							// Fila
							System.out.println("Digite o id da fila: ");
							Scanner read3 = new Scanner(System.in);

							int idret3 = read3.nextInt();
							
							fila = null;
							
							for(int i=0;i<filas.size();i++) {
								if(filas.get(i).getIdFila() == idret3) {
									//System.out.println("Achou");
									fila = filas.get(i);
									break;
								}
							}
							
							if (fila!=null) {
								System.out.println(fila.getNomeFila());
								filaImpl.deletarFila(fila);
								System.out.println("Fila excluída");
							} else {
								System.out.println("Fila não existente");
							}
							break;
							
						case 4:
							// Serviço
							System.out.println("Digite o id do servico: ");
							Scanner read4 = new Scanner(System.in);

							int idret4 = read4.nextInt();
							
							servico = null;
							
							for(int i=0;i<servicos.size();i++) {
								if(servicos.get(i).getIdServico() == idret4) {
									//System.out.println("Achou");
									servico = servicos.get(i);
									break;
								}
							}
							
							if (servico!=null) {
								System.out.println(servico.getNomeServico());
								servicoImpl.deletarServico(servico);
								System.out.println("Servico excluído");
							} else {
								System.out.println("Servico não existente");
							}
						break;					
					default:
							System.out.println("Opcao Invalida, digite novamente!!!");
						break;
					}
				}while(opcao4 != 0);
			}
			if (opcao == 5) {
				do{
					System.out.println(" Visualizar ClienteExp");
					System.out.println("0 - Sair");
					System.out.println("1 - Cliente");
					System.out.println("2 - Estabelecimento");
					System.out.println("3 - Fila");
					System.out.println("4 - Servico");
					opcao7 = sc.nextInt();
						switch(opcao7) {
						case 0:
						break;
						case 1:
							// Cliente
							System.out.println("Digite o id do Cliente: ");
							Scanner read1 = new Scanner(System.in);
							
							int idret1 = read1.nextInt();
							
							cliente = null;
							
							for(int i=0;i<clientes.size();i++) {
								if(clientes.get(i).getId() == idret1) {
									//System.out.println("Achou");
									cliente = clientes.get(i);
									break;
								}
							}
							
							if (cliente!=null) {
								System.out.println("Nome:"+cliente.getNome()+" Idade:"+ cliente.getIdadeCliente()+" Telefone:"+cliente.getTelefone()+" Horário:"+cliente.getHorario()+" Dia:"+cliente.getDia());
							} else {
								System.out.println("Cliente não existente");
							}
							break;
							
						case 2:
							System.out.println("Digite o id do estabelecimento: ");
							Scanner read2 = new Scanner(System.in);

							int idret2 = read2.nextInt();
							
							estabelecimento = null;
							
							for(int i=0;i<estabelecimentos.size();i++) {
								if(estabelecimentos.get(i).getIdEstabelecimento() == idret2) {
									//System.out.println("Achou");
									estabelecimento = estabelecimentos.get(i);
									break;
								}
							}
							
							if (cliente!=null) {
								System.out.println("Nome:"+estabelecimento.getNomeEstabelecimento()+" Cnpj:"+ estabelecimento.getCnpj()+" Início Exp:"+estabelecimento.getIni()+" Fim Exp:"+estabelecimento.getFin());
							} else {
								System.out.println("Estabelecimento não existente");
							}
							break;
							
						case 3:
							// Fila
							System.out.println("Digite o id da fila: ");
							Scanner read3 = new Scanner(System.in);

							int idret3 = read3.nextInt();
							
							fila = null;
							
							for(int i=0;i<filas.size();i++) {
								if(filas.get(i).getIdFila() == idret3) {
									//System.out.println("Achou");
									fila = filas.get(i);
									break;
								}
							}
							
							if (fila!=null) {
								System.out.println("Nome:"+fila.getNomeFila()+" dia:"+ fila.getDiaFila()+" Horário:"+fila.getHoraFila());
							} else {
								System.out.println("Fila não existente");
							}
							break;
							
						case 4:
							// Serviço
							System.out.println("Digite o id do servico: ");
							Scanner read4 = new Scanner(System.in);

							int idret4 = read4.nextInt();
							
							servico = null;
							
							for(int i=0;i<servicos.size();i++) {
								if(servicos.get(i).getIdServico() == idret4) {
									//System.out.println("Achou");
									servico = servicos.get(i);
									break;
								}
							}
							
							if (servico!=null) {
								System.out.println("Nome:"+servico.getNomeServico()+" Tempo:"+ servico.getTempoServico()+" dia:"+servico.getDiaServico()+"Profissional:"+servico.getProfissionalServico());
							} else {
								System.out.println("Servico não existente");
							}
						break;					
					default:
							System.out.println("Opcao Invalida, digite novamente!!!");
						break;
					}
				}while(opcao7 != 0);
			}
		}while (opcao != 0);
			System.out.println("-----------------------------------------------------------");
			System.out.println("Obrigado por usar o nosso sistema ( ͡^ ͜ʖ ͡^) até a próxima!!!");	
	}	
}
