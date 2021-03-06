/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import automesure.dao.CategorieFacade;
import automesure.dao.DispositifFacade;
import com.mycompany.automesure1.Dispositif;
import form.DispositifForm;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Justin
 */
@Controller
@Path("SoumettreDispositif")
@View("SoumettreDispositif.jsp")
public class SoumettreDispositif {

    @Inject
    DispositifFacade facadeP;
    @Inject
    Models models;
    @Inject
    BindingResult formValidationErrors;

    @POST
    @ValidateOnExecution(type = ExecutableType.ALL)
    public void create(@Valid @BeanParam DispositifForm formData) {
        if (!formValidationErrors.isFailed()) { 
            Dispositif nouvelle = new Dispositif();
            nouvelle.setId(formData.getId());
            nouvelle.setDescription(formData.getDescription());


        }
        models.put("validationErrors", formValidationErrors);
        models.put("dispositif", facadeP.findAll());
    }
}

