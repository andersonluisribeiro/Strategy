/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Anderson
 */
public class ImpressaoEmHtml implements ComportamentoDeImpressao{

    static{
        System.out.println("Inicializando bloco...");
    }
    
    @Override
    public void imprimir(String conteudo) {
        System.out.println("<html><head></head><body>" + conteudo + "</body></html>");
    }
    
}
