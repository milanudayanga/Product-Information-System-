/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pis;

import java.sql.SQLException;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import pis.model.SingleMaltQueries;
import pis.controller.SingleMaltController;
import pis.model.IModel;
import pis.model.SingleMaltModel;
import pis.view.SingleMaltView;

/**
 *
 * @author milan
 */
public class Products {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                try {
                    IModel imodelObj = new SingleMaltModel(new SingleMaltQueries());

                    SingleMaltController SingleMaltControllerObj = new SingleMaltController(imodelObj);
                    SingleMaltView SingleMaltViewObj = new SingleMaltView(SingleMaltControllerObj);
                    SingleMaltControllerObj.bind(SingleMaltViewObj);
                    ((SingleMaltModel) imodelObj).addObserver((Observer) SingleMaltViewObj);
                    SingleMaltViewObj.setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

    }

}
