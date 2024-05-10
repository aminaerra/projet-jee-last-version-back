package ma.zs.budgetInstitut.service.facade.admin.expressionbesoin;

import java.util.List;
import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoinDetail;
import ma.zs.budgetInstitut.dao.criteria.core.expressionbesoin.ExpressionBesoinDetailCriteria;
import ma.zs.budgetInstitut.zynerator.service.IService;



public interface ExpressionBesoinDetailAdminService extends  IService<ExpressionBesoinDetail,ExpressionBesoinDetailCriteria>  {

    List<ExpressionBesoinDetail> findByExpressionBesoinId(Long id);
    int deleteByExpressionBesoinId(Long id);
    long countByExpressionBesoinId(Long id);
    List<ExpressionBesoinDetail> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    long countByProduitId(Long id);




}
