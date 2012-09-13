/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anderson
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Documento contrato = new ContratoOnline(new ImpressaoEmXml());
        Documento notaFiscal = new NotaFiscalEletronica(new ImpressaoEmHtml());
        Documento situacaoCpf = new SituacaoCadastralDeCpf(new ImpressaoEmHtml());
        
       
        contrato.setConteudo("Contrato de aluguel...");
        notaFiscal.setConteudo("Nota fiscal de serviços...");
        situacaoCpf.setConteudo("Cpf regular...");

        contrato.imprimir();
        notaFiscal.imprimir();
        situacaoCpf.imprimir();


    }
}
