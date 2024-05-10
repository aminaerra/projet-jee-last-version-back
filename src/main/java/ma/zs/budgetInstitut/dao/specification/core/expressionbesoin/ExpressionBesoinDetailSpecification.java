package  ma.zs.budgetInstitut.dao.specification.core.expressionbesoin;

import ma.zs.budgetInstitut.dao.criteria.core.expressionbesoin.ExpressionBesoinDetailCriteria;
import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoinDetail;
import ma.zs.budgetInstitut.zynerator.specification.AbstractSpecification;


public class ExpressionBesoinDetailSpecification extends  AbstractSpecification<ExpressionBesoinDetailCriteria, ExpressionBesoinDetail>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("qteDemandee", criteria.getQteDemandee(), criteria.getQteDemandeeMin(), criteria.getQteDemandeeMax());
        addPredicateBigDecimal("qteAccordee", criteria.getQteAccordee(), criteria.getQteAccordeeMin(), criteria.getQteAccordeeMax());
        addPredicateBigDecimal("qteLivre", criteria.getQteLivre(), criteria.getQteLivreMin(), criteria.getQteLivreMax());
        addPredicateFk("expressionBesoin","id", criteria.getExpressionBesoin()==null?null:criteria.getExpressionBesoin().getId());
        addPredicateFk("expressionBesoin","id", criteria.getExpressionBesoins());
        addPredicateFk("produit","id", criteria.getProduit()==null?null:criteria.getProduit().getId());
        addPredicateFk("produit","id", criteria.getProduits());
    }

    public ExpressionBesoinDetailSpecification(ExpressionBesoinDetailCriteria criteria) {
        super(criteria);
    }

    public ExpressionBesoinDetailSpecification(ExpressionBesoinDetailCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
