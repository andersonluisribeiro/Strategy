/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Anderson
 */
public class ImpressaoEmXml implements ComportamentoDeImpressao{

    @Override
    public void imprimir(String conteudo) {
        System.out.println("<xml>" + conteudo + "</xml>");
    }
    
}
