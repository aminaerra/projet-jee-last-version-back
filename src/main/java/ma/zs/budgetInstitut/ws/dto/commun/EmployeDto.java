package  ma.zs.budgetInstitut.ws.dto.commun;

import ma.zs.budgetInstitut.zynerator.audit.Log;
import ma.zs.budgetInstitut.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeDto  extends AuditBaseDto {

    private String nom  ;
    private String prenom  ;

    private EntiteAdminDto entiteAdmin ;



    public EmployeDto(){
        super();
    }



    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }


    public EntiteAdminDto getEntiteAdmin(){
        return this.entiteAdmin;
    }

    public void setEntiteAdmin(EntiteAdminDto entiteAdmin){
        this.entiteAdmin = entiteAdmin;
    }






}
