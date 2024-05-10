package ma.zs.budgetInstitut.service.impl.admin.produit;


import ma.zs.budgetInstitut.bean.core.produit.CategorieProduit;
import ma.zs.budgetInstitut.dao.criteria.core.produit.CategorieProduitCriteria;
import ma.zs.budgetInstitut.dao.facade.core.produit.CategorieProduitDao;
import ma.zs.budgetInstitut.dao.specification.core.produit.CategorieProduitSpecification;
import ma.zs.budgetInstitut.service.facade.admin.produit.CategorieProduitAdminService;
import ma.zs.budgetInstitut.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetInstitut.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class CategorieProduitAdminServiceImpl extends AbstractServiceImpl<CategorieProduit, CategorieProduitCriteria, CategorieProduitDao> implements CategorieProduitAdminService {








    public List<CategorieProduit> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(CategorieProduit.class, CategorieProduitSpecification.class);
    }



    public CategorieProduitAdminServiceImpl(CategorieProduitDao dao) {
        super(dao);
    }

}
