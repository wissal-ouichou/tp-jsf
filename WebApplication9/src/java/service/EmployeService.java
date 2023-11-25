
package service;

import entities.Employe;

/**
 *
 * @author WISSAL
 */
public class EmployeService extends AbstractFacade<Employe> {

    @Override
    protected Class<Employe> getEntityClass() {
        return Employe.class;
    }
    
}
