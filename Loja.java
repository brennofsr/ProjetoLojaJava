package projetopoo1;

import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Loja {
    private Produto[] produtos;
    private List<Cliente> clientes;
    private List<Venda> vendas;

    public Loja (int quantidadeProdutos) {
    this.produtos = new Produto[quantidadeProdutos];
        for (int i = 0; i < quantidadeProdutos; i++) {
        this.produtos[i] = new Produto(); 
        }
    this.clientes = new ArrayList<>();
    this.vendas = new ArrayList<>(); 
    
    }
        
    public void listarProdutos(){
        for(int j = 0; j < this.produtos.length ; j++){
                if(this.produtos[j].getNome() != null){
                    System.out.print("Produto #" +this.produtos[j].getCodigo()); 
                    System.out.println(" = " +this.produtos[j].getNome());
            }
        }   
    }

    public void cadastrarClientesLoop(){
        System.out.println("-       Cadastro de clientes        -");
        System.out.println("- Para parar de cadastrar, digite $ -");
        boolean bool = true;
        while(bool){
            bool = cadastrarClientes();
        }
    }
    
    public boolean cadastrarClientes(){
        Scanner in = new Scanner( System.in );
        System.out.println("Digite o nome do cliente: ");
        String entrada = new String();
        entrada = in.nextLine();
        if("$".equals(entrada)){
            return false;
        }
        Cliente c = new Cliente();
        c.setNome(entrada);
        c.setCodigo(this.clientes.size()+1110);
        clientes.add(c);
        System.out.println("Cadastro realizado com sucesso!");
        return true;
    }
    
    public void listarClientes(){
        for(int j = 0; j < this.clientes.size() ; j++){
                if(this.clientes.get(j).getNome() != null){
                    System.out.print("Cliente #" +this.clientes.get(j).getCodigo()); 
                    System.out.println(" = " +this.clientes.get(j).getNome());
            }
        }   
    }
    
   public void listarProdutosDisponiveis(){
        int i = 0;
        for(int j = 0; j < this.produtos.length ; j++){
                if(this.produtos[i].getQuantidade() != 0){
                    System.out.print("Produto #" +this.produtos[j].getCodigo()); 
                    System.out.println(" = " +this.produtos[j].getNome());
                    System.out.println("Quantidade em estoque = "
                                       +this.produtos[j].getQuantidade());
            }
        i++;
        }   
    }
   
   public void listarProdutosIndisponiveis(){
        int i = 0;
        for(int j = 0; j < this.produtos.length ; j++){
                if(this.produtos[j].getQuantidade() == 0 &&
                   this.produtos[j].getNome() != null){
                    System.out.print("Produto #" +this.produtos[j].getCodigo()); 
                    System.out.println(" = " +this.produtos[j].getNome());
                    System.out.println("Quantidade em estoque = "
                                       +this.produtos[j].getQuantidade());
            }
        }   
    }
    
   public boolean verificarValidadeVenda(int codigoCliente, int codigoProduto, int quantidade){
       for(int i = 0 ; i < this.clientes.size() ; i++){
           if(this.clientes.get(i).getCodigo() == codigoCliente){
               if(quantidade <= this.produtos[codigoProduto-1].getQuantidade()){
                   System.out.println("Venda Possível");
                   return true;
               } else{
                   return false;
               }
           }
       }
       return false;
   }
   
    public void realizarVenda(int codigoCliente, int codigoProduto, int quantidade){
       if(verificarValidadeVenda(codigoCliente, codigoProduto, quantidade)){
            Venda v = new Venda();
            v.setCliente(this.clientes.get(codigoCliente-1110).getNome());
            v.setCodigoVenda(codigoCliente+codigoProduto);
            v.setProduto(this.produtos[codigoProduto-1].getNome());
            v.setQuantidade(quantidade);     
            this.produtos[codigoProduto-1].setQuantidade
            (this.produtos[codigoProduto-1].getQuantidade() - quantidade);
                    System.out.println("Venda Realizada com sucesso!");
                    vendas.add(v);
                } else {
                   System.out.println("Não foi possivel fazer a venda");
                }
    }
   
   public void listarVendas(){
        for(int j = 0; j < this.vendas.size() ; j++){
                if(this.vendas.get(j).getCliente() != null){
                    System.out.println("--------------------------------------");
                    System.out.println("Venda #" +(j+1));
                    System.out.println("Cliente = " +this.vendas.get(j).getCliente()); 
                    System.out.println("Código da venda = "
                                       +this.vendas.get(j).getCodigoVenda());
                    System.out.println("Produto comprado = " 
                                       +this.vendas.get(j).getProduto());
                    System.out.println("Quantidade comprada = " 
                                        +this.vendas.get(j).getQuantidade());
            }
        }   
    }
   
   public void listarVendasPorCliente(String cliente){
       for(int j = 0; j < this.vendas.size() ; j++){
                if(this.vendas.get(j).getCliente() == null ? 
                   cliente == null : this.vendas.get(j).getCliente().equals(cliente)){//sugestão da IDE
                    System.out.println("--------------------------------------");
                    System.out.println("Venda #" +(j+1));
                    System.out.println("Cliente = " +this.vendas.get(j).getCliente()); 
                    System.out.println("Código da venda = "
                                       +this.vendas.get(j).getCodigoVenda());
                    System.out.println("Produto comprado = " 
                                       +this.vendas.get(j).getProduto());
                    System.out.println("Quantidade comprada = " 
                                        +this.vendas.get(j).getQuantidade());
            }
        }   
   }
   
    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
}