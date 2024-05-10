package ma.zs.budgetInstitut.bean.core.commun;

import java.util.Objects;





import ma.zs.budgetInstitut.bean.core.commun.Employe;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.budgetInstitut.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "entite_admin")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="entite_admin_seq",sequenceName="entite_admin_seq",allocationSize=1, initialValue = 1)
public class EntiteAdmin   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;

    private Employe chef ;


    public EntiteAdmin(){
        super();
    }

    public EntiteAdmin(Long id){
        this.id = id;
    }

    public EntiteAdmin(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }
    public EntiteAdmin(String libelle){
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="entite_admin_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chef")
    public Employe getChef(){
        return this.chef;
    }
    public void setChef(Employe chef){
        this.chef = chef;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntiteAdmin entiteAdmin = (EntiteAdmin) o;
        return id != null && id.equals(entiteAdmin.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

