/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiago.lucas
 */
public class Estado {
    private String sigla;
    private String nome;
    public Estado(){
        
    }
    public Estado(String s, String n){
        this.sigla=s;
        this.nome = n;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean equals(Object e){
        return (this.sigla.equalsIgnoreCase(
                ((Estado)e).getSigla()));
    }
    public int hashCode(){
        return this.sigla.hashCode();
    }
    //simulando uma busca no banco de dados
    public static Estado buscar(String sigla){
        if(sigla.equals("PR"))
            return new Estado("PR","Paraná");
        if(sigla.equals("SC"))
            return new Estado("SC", "Santa Catarina");
        if(sigla.equals("RS"))
            return new Estado("RS", "Rio Grande do Sul");
        if(sigla.equals("MG"))
            return new Estado("MG", "Minas Gerais");
        return null;
    }
    //simulando uma busca no banco de dados
    public static List<Estado> buscarTodos(){
        List<Estado> listaEstados = new ArrayList<Estado>();
        Estado e = new Estado();
        e.setSigla("PR");
        e.setNome("Paraná");
        listaEstados.add(e);
        
        e=new Estado();
        e.setSigla("SC");
        e.setNome("Santa Catarina");
        listaEstados.add(e);
        
        return listaEstados;
    }
}
