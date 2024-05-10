package ma.zs.budgetInstitut.service.facade.admin.produit;

import java.util.List;
import ma.zs.budgetInstitut.bean.core.produit.Produit;
import ma.zs.budgetInstitut.dao.criteria.core.produit.ProduitCriteria;
import ma.zs.budgetInstitut.zynerator.service.IService;



public interface ProduitAdminService extends  IService<Produit,ProduitCriteria>  {

    List<Produit> findByCategorieProduitId(Long id);
    int deleteByCategorieProduitId(Long id);
    long countByCategorieProduitId(Long id);




}
