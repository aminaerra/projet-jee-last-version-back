package  ma.zs.budgetInstitut.dao.specification.core.budget;

import ma.zs.budgetInstitut.dao.criteria.core.budget.BudgetCriteria;
import ma.zs.budgetInstitut.bean.core.budget.Budget;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class BudgetSpecification extends  AbstractSpecification<BudgetCriteria, Budget>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("dateBudget", criteria.getDateBudget(), criteria.getDateBudgetFrom(), criteria.getDateBudgetTo());
        addPredicateBigDecimal("montant", criteria.getMontant(), criteria.getMontantMin(), criteria.getMontantMax());
        addPredicateBigDecimal("montantInvestissement", criteria.getMontantInvestissement(), criteria.getMontantInvestissementMin(), criteria.getMontantInvestissementMax());
        addPredicateBigDecimal("montantFonction", criteria.getMontantFonction(), criteria.getMontantFonctionMin(), criteria.getMontantFonctionMax());
    }

    public BudgetSpecification(BudgetCriteria criteria) {
        super(criteria);
    }

    public BudgetSpecification(BudgetCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
