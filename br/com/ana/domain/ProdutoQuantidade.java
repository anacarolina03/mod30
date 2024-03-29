/**
 * 
 */
package br.com.ana.domain;

import java.math.BigDecimal;

import br.com.anotacao.Tabela;
import br.com.anotacao.ColunaTabela;

/**
 * @author rodrigo.pires
 *
 */
@Tabela("TB_PRODUTO_QUANTIDADE")
public class ProdutoQuantidade {
	
	@ColunaTabela(dbName = "id", setJavaName = "setId")
	private Long id;

	//@ColunaTabela(dbName = "id", setJavaName = "setId")

	private Produto produto;
	
	@ColunaTabela(dbName = "quantidade", setJavaName = "setQuantidade")
	private Integer quantidade;
	
	@ColunaTabela(dbName = "valor_total", setJavaName = "setValorTotal")
	private BigDecimal valorTotal;

	@ColunaTabela(dbName = "peso_total", setJavaName = "setPesoTotal")
	private BigDecimal pesoTotal = BigDecimal.valueOf(0);

	public BigDecimal getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(BigDecimal pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public ProdutoQuantidade() {
		this.quantidade = 0;
		this.valorTotal = BigDecimal.ZERO;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	

	public Long getId() {
		return id;
	}
	private BigDecimal aux1 = BigDecimal.valueOf(0);

	public void setId(Long id) {
		this.id = id;
	}

	public void adicionar(Integer quantidade) {
		this.quantidade += quantidade;
		BigDecimal novoValor = this.produto.getValor().multiply(BigDecimal.valueOf(quantidade));
		BigDecimal novoTotal = this.valorTotal.add(novoValor);
		this.valorTotal = novoTotal;

		BigDecimal novoPesoTotal = this.produto.getPeso().multiply(BigDecimal.valueOf(this.quantidade));
		BigDecimal aux = this.pesoTotal.add(novoPesoTotal);
		this.pesoTotal = aux;
	}
	
	public void remover(Integer quantidade) {
		this.quantidade -= quantidade;
		BigDecimal novoValor = this.produto.getValor().multiply(BigDecimal.valueOf(quantidade));
		this.valorTotal = this.valorTotal.subtract(novoValor);

		BigDecimal novoPesoTotal = this.produto.getPeso().multiply(BigDecimal.valueOf(this.quantidade));
		BigDecimal aux = this.pesoTotal.subtract(novoPesoTotal);
		this.pesoTotal = aux;
	}
}
