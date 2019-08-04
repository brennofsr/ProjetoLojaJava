package projetopoo1;

import java.util.Scanner;

public class ProjetoPOO1 {    
    public static void main(String[] args) {
        
        Loja loja = new Loja(8); //o parâmetro é a quantidade de produtos 
        //---------------------------------------------------------------------
        //Produtos
        //---------------------------------------------------------------------
        
        loja.getProdutos()[0].setQuantidade(22);
        loja.getProdutos()[0].setPrecoVenda(2.5f);
        loja.getProdutos()[0].setCodigo(1);
        loja.getProdutos()[0].setNome("Abacaxi");
        
        loja.getProdutos()[1].setQuantidade(17);
        loja.getProdutos()[1].setPrecoVenda(1.0f);
        loja.getProdutos()[1].setCodigo(2);
        loja.getProdutos()[1].setNome("Maçã");
        
        loja.getProdutos()[2].setQuantidade(0);
        loja.getProdutos()[2].setPrecoVenda(1.5f);
        loja.getProdutos()[2].setCodigo(3);
        loja.getProdutos()[2].setNome("Kiwi");
        
        loja.getProdutos()[3].setQuantidade(12);
        loja.getProdutos()[3].setPrecoVenda(1.2f);
        loja.getProdutos()[3].setCodigo(4);
        loja.getProdutos()[3].setNome("Manga");
        
        loja.getProdutos()[4].setQuantidade(45);
        loja.getProdutos()[4].setPrecoVenda(0.5f);
        loja.getProdutos()[4].setCodigo(5);
        loja.getProdutos()[4].setNome("Banana");
        
        loja.getProdutos()[5].setQuantidade(0);
        loja.getProdutos()[5].setPrecoVenda(1.7f);
        loja.getProdutos()[5].setCodigo(6);
        loja.getProdutos()[5].setNome("Pêra");
        
        loja.getProdutos()[6].setQuantidade(8);
        loja.getProdutos()[6].setPrecoVenda(4.5f);
        loja.getProdutos()[6].setCodigo(7);
        loja.getProdutos()[6].setNome("Uva");
        
        loja.getProdutos()[7].setQuantidade(22);
        loja.getProdutos()[7].setPrecoVenda(8.0f);
        loja.getProdutos()[7].setCodigo(8);
        loja.getProdutos()[7].setNome("Melancia");
        
        //---------------------------------------------------------------------
        
        int escolher;                   //opção do menu
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("\n=====================================");
            System.out.println("|              -MENU-               |");
            System.out.println("=====================================");
            System.out.println("|                                   |");
            System.out.println("|     - O que deseja fazer? -       |");
            System.out.println("|                                   |");
            System.out.println("|       1 - Listar Produtos         |");
            System.out.println("|      2 - Cadastrar Clientes       |");
            System.out.println("| 3 - Listar Produtos Disponíveis   |");
            System.out.println("| 4 - Listar Produtos Indisponíveis |");
            System.out.println("|        5 - Listar Vendas          |");
            System.out.println("|   6 - Listar Vendas por Cliente   |");
            System.out.println("|         7- Listar Clientes        |");
            System.out.println("|         8 - Realizar Vendas       |");
            System.out.println("|             0 - Sair              |");
            System.out.println("|                                   |");
            System.out.println("=====================================\n");
            escolher = entrada.nextInt();
            switch(escolher){
                case 1:
                    loja.listarProdutos();
                    break;
                case 2:
                    loja.cadastrarClientesLoop();
                    break;
                case 3:
                    loja.listarProdutosDisponiveis();
                    break;
                case 4:
                    loja.listarProdutosIndisponiveis();
                    break;
                case 5:
                    loja.listarVendas();
                    break;
                case 6:
                    Scanner entrada2 = new Scanner(System.in);
                    System.out.print("Digite o nome do cliente: ");
                    String nome = new String();
                    nome = entrada2.nextLine();
                    loja.listarVendasPorCliente(nome);
                    break;
                case 7:
                    loja.listarClientes();
                    break;
                case 8:
                    System.out.println("Digite o código do cliente: ");
                    int cod1 = entrada.nextInt();
                    System.out.println("Digite o código do produto: ");
                    int cod2 = entrada.nextInt();
                    System.out.println("Digite a quantidade desejada: ");
                    int cod3 = entrada.nextInt();
                    loja.realizarVenda(cod1, cod2, cod3);
                    break;
                case 0:
                    System.out.println("Fechando Menu...");
                    break;
            }
        }while(escolher != 0);
    }
    
}
