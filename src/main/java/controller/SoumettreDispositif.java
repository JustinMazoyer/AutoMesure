/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Automesure.dao.CategorieFacade;
import Automesure.dao.DispositifFacade;
import javax.inject.Inject;
import javax.mvc.Models;

/**
 *
 * @author Justin
 */
public class SoumettreDispositif {

    @Inject
    DispositifFacade facadeP;
    @Inject
    CategorieFacade facadeC;
    @Inject
    Models models;

}
