package projetopoo1;
import java.util.*;
import java.text.*;
public class Venda {
    private int codigoVenda;
    private String cliente;
    private String produto;
    private int quantidade;

    public Venda(int codigoVenda, String cliente, String produto, int quantidade) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Venda() {
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    
}
