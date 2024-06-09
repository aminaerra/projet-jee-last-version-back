package ma.zs.budgetInstitut.bean.core.produit;

import java.util.Objects;





import ma.zs.budgetInstitut.bean.core.produit.CategorieProduit;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.budgetInstitut.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "produit")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="produit_seq",sequenceName="produit_seq",allocationSize=1, initialValue = 1)
public class Produit   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Column(length = 500)
    private double prix;
    private CategorieProduit categorieProduit ;


    public Produit(){
        super();
    }

    public Produit(Long id){
        this.id = id;
    }

    public Produit(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }
    public Produit(String libelle){
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="produit_seq")
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
    @JoinColumn(name = "categorie_produit")
    public CategorieProduit getCategorieProduit(){
        return this.categorieProduit;
    }
    public void setCategorieProduit(CategorieProduit categorieProduit){
        this.categorieProduit = categorieProduit;
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
        Produit produit = (Produit) o;
        return id != null && id.equals(produit.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

