package  ma.zs.budgetInstitut.dao.specification.core.produit;

import ma.zs.budgetInstitut.dao.criteria.core.produit.CategorieProduitCriteria;
import ma.zs.budgetInstitut.bean.core.produit.CategorieProduit;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class CategorieProduitSpecification extends  AbstractSpecification<CategorieProduitCriteria, CategorieProduit>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public CategorieProduitSpecification(CategorieProduitCriteria criteria) {
        super(criteria);
    }

    public CategorieProduitSpecification(CategorieProduitCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
