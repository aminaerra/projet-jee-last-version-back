package  ma.zs.budgetInstitut.dao.specification.core.commun;

import ma.zs.budgetInstitut.dao.criteria.core.commun.EntiteAdminCriteria;
import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class EntiteAdminSpecification extends  AbstractSpecification<EntiteAdminCriteria, EntiteAdmin>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateFk("chef","id", criteria.getChef()==null?null:criteria.getChef().getId());
        addPredicateFk("chef","id", criteria.getChefs());
    }

    public EntiteAdminSpecification(EntiteAdminCriteria criteria) {
        super(criteria);
    }

    public EntiteAdminSpecification(EntiteAdminCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
