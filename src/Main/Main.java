package src.Main;

import src.Model.Product;
import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {

    // Instalação, usando metodos construtores, de tres objetos de classe de produto
    // do pacote model
    Product ObjectProduct1 = new Product(1, "Cerveja Longneck Budweiser 330ml", "Fardo com 6 unidades", 25.0, 60);
    Product ObjectProduct2 = new Product(2, "Cerveja Caixa Heineken 350ml", "Caixa com 12 unidades", 30.0, 40);
    Product ObjectProduct3 = new Product(0, null, null, 0, 0);

    // Uso dos metodos GET
    JOptionPane.showMessageDialog(null, "\n\n------ TESTE 1 ---- Nada em Produto 3 ------\n\n");
    JOptionPane.showMessageDialog(null, "id: " + ObjectProduct1.getId() + "\n nome: \n" + ObjectProduct1.getName());
    JOptionPane.showMessageDialog(null, "id: " + ObjectProduct2.getId() + "\n nome: \n" + ObjectProduct2.getName());
    JOptionPane.showMessageDialog(null, "id: " + ObjectProduct3.getId() + "\n nome: \n" + ObjectProduct3.getName());

    // Uso dos metodos SET
    ObjectProduct3.setId(3);
    ObjectProduct3.setName("Refrigerante Pureza 2 Litros");
    ObjectProduct3.setDescription("1 unidade");
    ObjectProduct3.setPrice(4.0);
    ObjectProduct3.setStock(100);

    // Teste dos metodos GET e SET
    JOptionPane.showMessageDialog(null, "\n\n------ TESTE 2 ---- Produto 3 foi criado ------\n\n");
    JOptionPane.showMessageDialog(null, "id: " + ObjectProduct1.getId() + "\n nome: \n" + ObjectProduct1.getName());
    JOptionPane.showMessageDialog(null, "id: " + ObjectProduct2.getId() + "\n nome: \n" + ObjectProduct2.getName());
    JOptionPane.showMessageDialog(null, "id: " + ObjectProduct3.getId() + "\n nome: \n" + ObjectProduct3.getName());

    // Exemplo de todos os dados
    JOptionPane.showMessageDialog(null, "\n\n------ TESTE 3 ---- Produto 3 todos os dados ------\n\n");
    JOptionPane.showMessageDialog(null,
        "id: " + ObjectProduct3.getId() + "\n nome: " + ObjectProduct3.getName() + "\n descrição: "
            + ObjectProduct3.getDescription() + "\n preco: R$" + ObjectProduct3.getPrice() + "\n estoque: "
            + ObjectProduct3.getStock());

    // Modificando o preco do produto 3 de R$4,00 para R$5,00
    ObjectProduct3.setPrice(5.0);
    JOptionPane.showMessageDialog(null, "\n\n------ TESTE 4 ---- Produto 3 alteracao de preco ------\n\n");
    JOptionPane.showMessageDialog(null,
        "id: " + ObjectProduct3.getId() + "\n nome: " + ObjectProduct3.getName() + "\n descrição: "
            + ObjectProduct3.getDescription() + "\n preco: R$" + ObjectProduct3.getPrice() + "\n estoque: "
            + ObjectProduct3.getStock());
  }
}