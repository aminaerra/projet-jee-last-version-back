package  ma.zs.budgetInstitut.ws.dto.commun;

import ma.zs.budgetInstitut.zynerator.audit.Log;
import ma.zs.budgetInstitut.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntiteAdminDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;

    private EmployeDto chef ;



    public EntiteAdminDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }


    public EmployeDto getChef(){
        return this.chef;
    }

    public void setChef(EmployeDto chef){
        this.chef = chef;
    }






}
