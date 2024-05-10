package ma.zs.budgetInstitut.service.impl.admin.achat;


import ma.zs.budgetInstitut.bean.core.achat.TypeAchatMateriel;
import ma.zs.budgetInstitut.dao.criteria.core.achat.TypeAchatMaterielCriteria;
import ma.zs.budgetInstitut.dao.facade.core.achat.TypeAchatMaterielDao;
import ma.zs.budgetInstitut.dao.specification.core.achat.TypeAchatMaterielSpecification;
import ma.zs.budgetInstitut.service.facade.admin.achat.TypeAchatMaterielAdminService;
import ma.zs.budgetInstitut.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetInstitut.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TypeAchatMaterielAdminServiceImpl extends AbstractServiceImpl<TypeAchatMateriel, TypeAchatMaterielCriteria, TypeAchatMaterielDao> implements TypeAchatMaterielAdminService {








    public List<TypeAchatMateriel> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(TypeAchatMateriel.class, TypeAchatMaterielSpecification.class);
    }



    public TypeAchatMaterielAdminServiceImpl(TypeAchatMaterielDao dao) {
        super(dao);
    }

}
