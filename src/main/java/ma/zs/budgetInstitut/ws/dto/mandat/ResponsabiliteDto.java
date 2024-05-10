package  ma.zs.budgetInstitut.ws.dto.mandat;

import ma.zs.budgetInstitut.zynerator.audit.Log;
import ma.zs.budgetInstitut.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponsabiliteDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;




    public ResponsabiliteDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }








}
