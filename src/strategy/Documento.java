/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Anderson
 */
public abstract class Documento {
    
    protected String conteudo;
    protected ComportamentoDeImpressao comportamentoDeImpressao;

    public Documento(ComportamentoDeImpressao comportamentoDeImpressao) {
        this.comportamentoDeImpressao = comportamentoDeImpressao;
    }
    
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    public void imprimir(){
        this.comportamentoDeImpressao.imprimir(conteudo);
    }
    
}
