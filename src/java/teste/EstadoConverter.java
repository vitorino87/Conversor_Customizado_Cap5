/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author tiago.lucas
 */
@FacesConverter(value="estadoConverter", forClass=Estado.class)
public class EstadoConverter implements Converter{
    public Object getAsObject(FacesContext context, UIComponent component, String value){
        return Estado.buscar(value);
    }
    public String getAsString(FacesContext context, UIComponent component, Object value){
        return ((Estado) value).getSigla();
    }
}
