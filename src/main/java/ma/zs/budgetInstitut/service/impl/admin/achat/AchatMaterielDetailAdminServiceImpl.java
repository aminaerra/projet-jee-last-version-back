package ma.zs.budgetInstitut.service.impl.admin.achat;


import ma.zs.budgetInstitut.bean.core.achat.AchatMaterielDetail;
import ma.zs.budgetInstitut.dao.criteria.core.achat.AchatMaterielDetailCriteria;
import ma.zs.budgetInstitut.dao.facade.core.achat.AchatMaterielDetailDao;
import ma.zs.budgetInstitut.dao.specification.core.achat.AchatMaterielDetailSpecification;
import ma.zs.budgetInstitut.service.facade.admin.achat.AchatMaterielDetailAdminService;
import ma.zs.budgetInstitut.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetInstitut.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.budgetInstitut.service.facade.admin.produit.ProduitAdminService ;
import ma.zs.budgetInstitut.bean.core.produit.Produit ;
import ma.zs.budgetInstitut.service.facade.admin.achat.AchatMaterielAdminService ;
import ma.zs.budgetInstitut.bean.core.achat.AchatMateriel ;

import java.util.List;
@Service
public class AchatMaterielDetailAdminServiceImpl extends AbstractServiceImpl<AchatMaterielDetail, AchatMaterielDetailCriteria, AchatMaterielDetailDao> implements AchatMaterielDetailAdminService {






    public void findOrSaveAssociatedObject(AchatMaterielDetail t){
        if( t != null) {
            t.setProduit(produitService.findOrSave(t.getProduit()));
            t.setAchatMateriel(achatMaterielService.findOrSave(t.getAchatMateriel()));
        }
    }

    public List<AchatMaterielDetail> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public long countByProduitId(Long id){
        return dao.countByProduitId(id);
    }
    public List<AchatMaterielDetail> findByAchatMaterielId(Long id){
        return dao.findByAchatMaterielId(id);
    }
    public int deleteByAchatMaterielId(Long id){
        return dao.deleteByAchatMaterielId(id);
    }
    public long countByAchatMaterielId(Long id){
        return dao.countByAchatMaterielId(id);
    }






    public void configure() {
        super.configure(AchatMaterielDetail.class, AchatMaterielDetailSpecification.class);
    }


    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private AchatMaterielAdminService achatMaterielService ;

    public AchatMaterielDetailAdminServiceImpl(AchatMaterielDetailDao dao) {
        super(dao);
    }

}
