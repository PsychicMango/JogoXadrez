package tabuleiro;

public class Posicao {

	private Integer linhas;
	private Integer colunas;
	
	public Posicao(Integer linhas, Integer colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
	}

	public Integer getLinhas() {
		return linhas;
	}

	public void setLinhas(Integer linhas) {
		this.linhas = linhas;
	}

	public Integer getColunas() {
		return colunas;
	}

	public void setColunas(Integer colunas) {
		this.colunas = colunas;
	}
	
	@Override
	public String toString() {
		return linhas + " , " + colunas;
	}
	
}
