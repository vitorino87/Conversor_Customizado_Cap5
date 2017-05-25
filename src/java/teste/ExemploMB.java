/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class ExemploMB {

    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
    }
    private Estado selecionado;
    private List<Estado> listaEstados;
    @PostConstruct
    public void init(){
        //busca todos os estados
        listaEstados = Estado.buscarTodos();
    }

    public Estado getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(Estado selecionado) {
        this.selecionado = selecionado;
    }

    public List<Estado> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }
    
}
