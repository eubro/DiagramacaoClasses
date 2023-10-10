/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagramacao.classes;

/**
 *
 * @author Gamer
 */
public class DiagramacaoClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();

        // Chame os métodos das interfaces a partir do objeto meuIPhone
        meuIPhone.tocarMusica();
        meuIPhone.fazerLigacao("123456789");
        meuIPhone.abrirPaginaWeb("https://www.exemplo.com");
    }
    
}
