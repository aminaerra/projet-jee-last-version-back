package  ma.zs.budgetInstitut.dao.criteria.core.commun;



import ma.zs.budgetInstitut.zynerator.criteria.BaseCriteria;
import java.util.List;

public class EntiteAdminCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;

    private EmployeCriteria chef ;
    private List<EmployeCriteria> chefs ;


    public EntiteAdminCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }


    public EmployeCriteria getChef(){
        return this.chef;
    }

    public void setChef(EmployeCriteria chef){
        this.chef = chef;
    }
    public List<EmployeCriteria> getChefs(){
        return this.chefs;
    }

    public void setChefs(List<EmployeCriteria> chefs){
        this.chefs = chefs;
    }
}
