package ma.zs.budgetInstitut.service.impl.admin.produit;


import ma.zs.budgetInstitut.bean.core.produit.Produit;
import ma.zs.budgetInstitut.dao.criteria.core.produit.ProduitCriteria;
import ma.zs.budgetInstitut.dao.facade.core.produit.ProduitDao;
import ma.zs.budgetInstitut.dao.specification.core.produit.ProduitSpecification;
import ma.zs.budgetInstitut.service.facade.admin.produit.ProduitAdminService;
import ma.zs.budgetInstitut.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetInstitut.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.budgetInstitut.service.facade.admin.produit.CategorieProduitAdminService ;
import ma.zs.budgetInstitut.bean.core.produit.CategorieProduit ;

import java.util.List;
@Service
public class ProduitAdminServiceImpl extends AbstractServiceImpl<Produit, ProduitCriteria, ProduitDao> implements ProduitAdminService {






    public void findOrSaveAssociatedObject(Produit t){
        if( t != null) {
            t.setCategorieProduit(categorieProduitService.findOrSave(t.getCategorieProduit()));
        }
    }

    public List<Produit> findByCategorieProduitId(Long id){
        return dao.findByCategorieProduitId(id);
    }
    public int deleteByCategorieProduitId(Long id){
        return dao.deleteByCategorieProduitId(id);
    }
    public long countByCategorieProduitId(Long id){
        return dao.countByCategorieProduitId(id);
    }

    public List<Produit> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(Produit.class, ProduitSpecification.class);
    }


    @Autowired
    private CategorieProduitAdminService categorieProduitService ;

    public ProduitAdminServiceImpl(ProduitDao dao) {
        super(dao);
    }

}
