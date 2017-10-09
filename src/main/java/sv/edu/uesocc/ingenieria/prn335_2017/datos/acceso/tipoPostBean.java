/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.eclipse.persistence.jpa.jpql.parser.CollectionMemberDeclaration;
import org.eclipse.persistence.jpa.jpql.parser.Expression;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPost;
import sv.edu.uesocc.ingenieria.prn335_2017.web.controladores.TipoPostFacadeLocal;


/**
 *
 * @author carlos
 */

@Named
@ViewScoped
public class tipoPostBean implements Serializable{
    public tipoPostBean() {
    }   
    
    @EJB
    TipoPostFacadeLocal tipoPost;
    List<TipoPost> lista = new ArrayList<>();

    public TipoPostFacadeLocal getTipoPost() {
        return tipoPost;
    }

    public void setTipoPost(TipoPostFacadeLocal tipoPost) {
        this.tipoPost = tipoPost;
    }

    public List<TipoPost> getLista() {
        return lista;
    }

    public void setLista(List<TipoPost> lista) {
        this.lista = lista;
    }
    @PostConstruct
    public void llenar(){
        if(lista != null){
            this.lista=tipoPost.findAll();
        }else {
            this.lista=Collections.EMPTY_LIST;
        }
    }
    
    
}
