package  ma.zs.budgetInstitut.dao.specification.core.achat;

import ma.zs.budgetInstitut.dao.criteria.core.achat.AchatMaterielCriteria;
import ma.zs.budgetInstitut.bean.core.achat.AchatMateriel;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class AchatMaterielSpecification extends  AbstractSpecification<AchatMaterielCriteria, AchatMateriel>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("montantTotal", criteria.getMontantTotal(), criteria.getMontantTotalMin(), criteria.getMontantTotalMax());
        addPredicate("dateAchat", criteria.getDateAchat(), criteria.getDateAchatFrom(), criteria.getDateAchatTo());
        addPredicateFk("budget","id", criteria.getBudget()==null?null:criteria.getBudget().getId());
        addPredicateFk("budget","id", criteria.getBudgets());
        addPredicateFk("typeAchatMateriel","id", criteria.getTypeAchatMateriel()==null?null:criteria.getTypeAchatMateriel().getId());
        addPredicateFk("typeAchatMateriel","id", criteria.getTypeAchatMateriels());
    }

    public AchatMaterielSpecification(AchatMaterielCriteria criteria) {
        super(criteria);
    }

    public AchatMaterielSpecification(AchatMaterielCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
