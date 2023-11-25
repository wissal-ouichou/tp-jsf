package domaines;
import domaines.ServiceBean;
import entities.Employe;
import entities.Service;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.EmployeService;
import service.ServiceService;
import service.AbstractFacade ;

/**
 *
 * @author WISSAL
 */
@ManagedBean
@RequestScoped
public class EmployeBean {
    private Employe employe;
    private List<Employe> employes;
    private EmployeService  es;
    private ServiceService  ss;
    private Service service ;
    /**
     * Creates a new instance of EmployeBean
     */
    public EmployeBean() {
        employe = new Employe();
        es = new EmployeService();
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    
    public void onCreateAction(){
        es.create(employe);
        employe = new Employe();
    }

    public List<Employe> getEmployes() {
        if(employes == null)
            employes = es.getAll();
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
    public String onDeleteAction() {
        es.delete(es.getById(employe.getId()));
        return null;
    }

    public List<Employe> serviceLoad() {
        for (Employe e : es.getAll()) {
            if (e.getService().equals(service)) {
                employes.add(e);
            }
        }
        return employes;
    }

    public void load() {
        System.out.println(service.getLibelle());
        service = ss.getById(service.getId());
        getEmployes();
    }

    
}

