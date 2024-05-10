package  ma.zs.budgetInstitut.dao.specification.core.mandat;

import ma.zs.budgetInstitut.dao.criteria.core.mandat.ResponsabiliteCriteria;
import ma.zs.budgetInstitut.bean.core.mandat.Responsabilite;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class ResponsabiliteSpecification extends  AbstractSpecification<ResponsabiliteCriteria, Responsabilite>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public ResponsabiliteSpecification(ResponsabiliteCriteria criteria) {
        super(criteria);
    }

    public ResponsabiliteSpecification(ResponsabiliteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
