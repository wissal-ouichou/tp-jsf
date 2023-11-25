
package domaines;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginBean {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        // Ici, vous pouvez ajouter la logique d'authentification
        // Pour cet exemple, on suppose que l'authentification réussit toujours
        // Vous devrez adapter cette logique à votre cas d'utilisation réel

        // En cas de succès, rediriger vers une autre page
        return "welcome?faces-redirect=true";
        
        // En cas d'échec, vous pouvez afficher un message d'erreur
        // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erreur d'authentification", "Nom d'utilisateur ou mot de passe incorrect."));
        // return null;
    }
}
