package  ma.zs.budgetInstitut.dao.specification.core.expressionbesoin;

import ma.zs.budgetInstitut.dao.criteria.core.expressionbesoin.ExpressionBesoinCriteria;
import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoin;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class ExpressionBesoinSpecification extends  AbstractSpecification<ExpressionBesoinCriteria, ExpressionBesoin>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("dateExpression", criteria.getDateExpression(), criteria.getDateExpressionFrom(), criteria.getDateExpressionTo());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
        addPredicateFk("entiteAdmin","id", criteria.getEntiteAdmin()==null?null:criteria.getEntiteAdmin().getId());
        addPredicateFk("entiteAdmin","id", criteria.getEntiteAdmins());
    }

    public ExpressionBesoinSpecification(ExpressionBesoinCriteria criteria) {
        super(criteria);
    }

    public ExpressionBesoinSpecification(ExpressionBesoinCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
