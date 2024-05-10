package ma.zs.budgetInstitut.service.facade.admin.expressionbesoin;

import java.util.List;
import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoin;
import ma.zs.budgetInstitut.dao.criteria.core.expressionbesoin.ExpressionBesoinCriteria;
import ma.zs.budgetInstitut.zynerator.service.IService;



public interface ExpressionBesoinAdminService extends  IService<ExpressionBesoin,ExpressionBesoinCriteria>  {

    List<ExpressionBesoin> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    long countByEmployeId(Long id);
    List<ExpressionBesoin> findByEntiteAdminId(Long id);
    int deleteByEntiteAdminId(Long id);
    long countByEntiteAdminId(Long id);




}
