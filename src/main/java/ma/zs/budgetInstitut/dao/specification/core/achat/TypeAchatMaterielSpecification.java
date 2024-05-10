package  ma.zs.budgetInstitut.dao.specification.core.achat;

import ma.zs.budgetInstitut.dao.criteria.core.achat.TypeAchatMaterielCriteria;
import ma.zs.budgetInstitut.bean.core.achat.TypeAchatMateriel;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class TypeAchatMaterielSpecification extends  AbstractSpecification<TypeAchatMaterielCriteria, TypeAchatMateriel>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public TypeAchatMaterielSpecification(TypeAchatMaterielCriteria criteria) {
        super(criteria);
    }

    public TypeAchatMaterielSpecification(TypeAchatMaterielCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
