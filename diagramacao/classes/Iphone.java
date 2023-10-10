/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramacao.classes;

/**
 *
 * @author Gamer
 */
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica() {
        
        System.out.println("Tocando música...");    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música...");    }

    @Override
    public void avancarMusica() {
    }

    @Override
    public void retrocederMusica() {
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para "+ numero);
    }

    @Override
    public void receberLigacao(String numero) {
    }

    @Override
    public void enviarMensagem(String texto, String numero) {
    }

    @Override
    public void receberMensagem(String texto, String numero) {
    }

    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Acessando " + url);
    }

    @Override
    public void fecharPaginaWeb() {
    }
    
}
