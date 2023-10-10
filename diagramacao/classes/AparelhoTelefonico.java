/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package diagramacao.classes;

/**
 *
 * @author Gamer
 */
public interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void receberLigacao(String numero);
    void enviarMensagem(String texto, String numero);
    void receberMensagem(String texto, String numero);
    
}
