package ma.zs.budgetInstitut.ws.dto.produit;

import ma.zs.budgetInstitut.zynerator.audit.Log;
import ma.zs.budgetInstitut.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProduitDto extends AuditBaseDto {

    private String code;
    private String libelle;

    @Log
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    private double prix;

    private CategorieProduitDto categorieProduit;


    public ProduitDto() {
        super();
    }


    @Log
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Log
    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public CategorieProduitDto getCategorieProduit() {
        return this.categorieProduit;
    }

    public void setCategorieProduit(CategorieProduitDto categorieProduit) {
        this.categorieProduit = categorieProduit;
    }


}
