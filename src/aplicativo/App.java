package aplicativo;
import java.lang.reflect.Array;
import java.util.Scanner;


public class App {
	
	

	public static void main(String[] args) {
		
		Reserva[] reservas = new Reserva[20];
		int ciclo;
		ciclo = 0;
		Scanner fecha = new Scanner(System.in);	
		Scanner leitor = new Scanner(System.in);
		Scanner le = new Scanner(System.in);
		Scanner read = new Scanner(System.in);
		Scanner leiez = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		Scanner nombre = new Scanner(System.in);
		String pesq;
		int nconsulta;
		boolean validador = false;
		boolean validab = false;
		boolean encontrado;
		boolean encontradol;
		boolean negativo = false;
		boolean existe = false;
		boolean controle = false;
		boolean validac;
		boolean finda = false;
		boolean sem = false;
		int[] qaviao = new int[4];
		int[] qassento = new int[4];
		int reservada = 0;
		int k = 0;
		int f = 0;
		
		for (f = 0; f < 20; f++) {
			
			reservas[f] = new Reserva();
			reservas[f].naviao = 0;
			reservas[f].npassageiro = "";
			
		}
			
			while (ciclo != 6) {
				int i = 0;
				int j = 0;
				int m = 0;
				int n = 0;
				negativo = false;
				existe = false;
				finda = false;
				controle = false;
				boolean certifica = false;
				sem = false;
				
				System.out.println("Digite 1 para registrar o número de cada avião \n" + "Digite 2 para registrar o quantitativo de assentos disponíveis em cada aviao \n"
					      + "Digite 3 para reservar passagem aerea \n" + "Digite 4 para realizar consulta por aviao \n"
					      + "Digite 5 para realizar consulta por passageiro \n" + "Digite 6 para encerrar o programa. ");
				
				ciclo = fecha.nextInt();
				
				if (ciclo == 1) {
					
					
					
					for (i = 0; i <= 3; i ++) {
						System.out.println("Informe o número de cada aviao: ");
						System.out.println("Numero do aviao: ");
						
						qaviao[i] = leitor.nextInt();
						
					}
					
					System.out.println("Estão disponiveis os avioes de numeros: ");
					
					for (j = 0; j <= 3; j ++) {
						System.out.println("Aviao de numero " + qaviao[j] + "\n");
					}
					
					validador = true;
					
				}
				
				if (ciclo == 2) {
					if (validador == true) {
						
						for (i = 0; i <= 3; i ++) {
							System.out.println("Informe a quantidade de assentos disponíveis por aviao: ");
							System.out.println("Assentos disponíveis para o aviao " + qaviao[i]);
							
							qassento[i] = le.nextInt();
						}
						
						validab = true;
						
					} else {
						System.out.println("Informe antes os números dos avioes!\n");
					}
				}
				
				if (ciclo == 3) {
					if (validab == true) {
						System.out.println("Informe o numero do aviao que deseja consultar: ");
						
						nconsulta = read.nextInt();
						
						i = 0;
						
						while (i != 4) {
							
							
							
							for (i = 0; i <= 3; i++) {
								
								if (nconsulta == qaviao[i]) {
									
									System.out.println("Esse aviao existe!");
									
									existe = true;
									
									if (qassento[i] > 0 && reservada <= 20) {
										
										int naviao;
										String npassageiro;
										
										System.out.print("O aviao " + qaviao[i] + " tem " + qassento[i]);
										System.out.println(" assentos disponíveis.\n");
										
										System.out.println("\n Para fazer a reserva, informe o nome do passageiro: ");
										
										npassageiro = leiez.nextLine();
										
										naviao = nconsulta;
										
										qassento[i] = qassento[i] - 1;
										reservada = reservada + 1;
										
										reservas [k]= new Reserva(naviao, npassageiro);
										
										System.out.println("Reserva realizada com sucesso!");
										System.out.println(reservas[k]);
										
										k = k + 1;
										
										negativo = true;
										
											
									} if (negativo == false) {
										System.out.println("Não há assentos disponíveis para este avião!");
										
										negativo = true;
									}
								} if (existe == false) {
									
									System.out.println("Esse avião não existe!");
									
									existe = true;
									
								}
								
								
								
							} 
						} 
						
						
						
						
						
					} else {
						System.out.println("Por favor, insira antes a quantidade de assentos por aviao!");
					}
					
					i = 4;
					
				}
				
				if (ciclo == 4) {
					
					System.out.println("Informe o numero do aviao que deseja consultar: ");
					
					nconsulta = ler.nextInt();
					
					i = 0;
					
					controle = false;
					
					while (i != 4) {
						
						encontradol = false;
						
						for(i = 0; i < 3; i++) {
							
							if(nconsulta == qaviao[i]) {
								encontradol = true;
							}
						}
						
						if(encontradol == true) {
							System.out.println("Este aviao existe!");
							
							i = 0;
							validac = false;
							
							for (i = 0; i < 3; i ++) {
								if (nconsulta == qaviao[i]) {
									controle = true;
									j = i;
								}
							}
							
							if (controle == true) {
								for (m = 0; m < reservas.length; m++) {
									if (m < k && nconsulta == reservas[m].getnaviao()) {
										
										System.out.println("Temos a seguinte reserva: Numero do aviao: " + reservas[m].getnaviao() + " Nome do passageiro: " + reservas[m].getnpassageiro());
										
										finda = true;
									
									}
									
									if (m == k && finda == true) {
										System.out.println("Não há mais reservas!");
									}
									
									if (m == k && finda == false) {
										
										sem = true;
									}
									
								}
							} if (sem == true) {
								System.out.println("Não há reservas realizadas para este aviao!");
							}
							
							j = 0;
							
							
						}else {
							System.out.println("Esse aviao nao existe!");
						}
						i = 4;
						
					}
					
				}
				
				if (ciclo == 5) {
					
					System.out.println("Informe o nome do passageiro: ");
					
					pesq = nombre.nextLine();
					
					for (n = 0; n < reservas.length; n++) {
						
						if (n <= k && reservas[n].getnpassageiro().equals(pesq)) {
							System.out.println("Existe a reserva em nome de: " + reservas[n].getnpassageiro() + 
									" para o avião de número " + reservas[n].getnaviao());
							certifica = true;
							
						}
						
						
						
					} if (certifica == false) {
						System.out.println("Não há reservas realizadas para este passageiro!");
					}
					
					
				}
				
			}
			
			fecha.close();
			leitor.close();
			le.close();
			read.close();
			leiez.close();
			ler.close();
			nombre.close();
			System.out.println("Programa encerrado!");

	}

}
