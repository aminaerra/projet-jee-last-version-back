package  ma.zs.budgetInstitut.dao.specification.core.commun;

import ma.zs.budgetInstitut.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.budgetInstitut.bean.core.commun.Employe;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class EmployeSpecification extends  AbstractSpecification<EmployeCriteria, Employe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicateFk("entiteAdmin","id", criteria.getEntiteAdmin()==null?null:criteria.getEntiteAdmin().getId());
        addPredicateFk("entiteAdmin","id", criteria.getEntiteAdmins());
    }

    public EmployeSpecification(EmployeCriteria criteria) {
        super(criteria);
    }

    public EmployeSpecification(EmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
