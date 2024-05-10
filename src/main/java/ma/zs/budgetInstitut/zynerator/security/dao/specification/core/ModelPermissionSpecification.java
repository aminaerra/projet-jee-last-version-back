package ma.zs.budgetInstitut.zynerator.security.dao.specification.core;

import ma.zs.budgetInstitut.zynerator.security.bean.ModelPermission;
import ma.zs.budgetInstitut.zynerator.security.dao.criteria.core.ModelPermissionCriteria;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class ModelPermissionSpecification extends  AbstractSpecification<ModelPermissionCriteria, ModelPermission>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public ModelPermissionSpecification(ModelPermissionCriteria criteria) {
        super(criteria);
    }

    public ModelPermissionSpecification(ModelPermissionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
