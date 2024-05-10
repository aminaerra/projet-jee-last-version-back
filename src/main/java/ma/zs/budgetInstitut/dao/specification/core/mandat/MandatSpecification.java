package  ma.zs.budgetInstitut.dao.specification.core.mandat;

import ma.zs.budgetInstitut.dao.criteria.core.mandat.MandatCriteria;
import ma.zs.budgetInstitut.bean.core.mandat.Mandat;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class MandatSpecification extends  AbstractSpecification<MandatCriteria, Mandat>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("dateDebut", criteria.getDateDebut(), criteria.getDateDebutFrom(), criteria.getDateDebutTo());
        addPredicate("dateFin", criteria.getDateFin(), criteria.getDateFinFrom(), criteria.getDateFinTo());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
        addPredicateFk("responsabilite","id", criteria.getResponsabilite()==null?null:criteria.getResponsabilite().getId());
        addPredicateFk("responsabilite","id", criteria.getResponsabilites());
        addPredicateFk("entiteAdmin","id", criteria.getEntiteAdmin()==null?null:criteria.getEntiteAdmin().getId());
        addPredicateFk("entiteAdmin","id", criteria.getEntiteAdmins());
    }

    public MandatSpecification(MandatCriteria criteria) {
        super(criteria);
    }

    public MandatSpecification(MandatCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
