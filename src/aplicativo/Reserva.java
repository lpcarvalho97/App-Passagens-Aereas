package aplicativo;

public class Reserva {
	
	public int naviao;
	public String npassageiro;
	
	public Reserva() {
		
	}
	
	public Reserva(int naviao, String npassageiro) {
		this.naviao = naviao;
		this.npassageiro = npassageiro;
	}
	
	public int getnaviao() {
		return this.naviao;
	}
	
	public String getnpassageiro() {
		return this.npassageiro;
	}
	
	public void setnaviao(int naviao) {
		this.naviao = naviao;
	}
	
	public void setnpassageiro(String npassageiro) {
		this.npassageiro = npassageiro;
	}
	
	public String toString() {
		return "O número do aviao e " + this.naviao + " e o nome do passageiro é "
				+ this.npassageiro;
	}
	
	

}
