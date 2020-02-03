/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Nicolas
 */
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Default JAX-RS application listening on /mvc
 */
@ApplicationPath("/mvc")
public class App extends Application {
}
