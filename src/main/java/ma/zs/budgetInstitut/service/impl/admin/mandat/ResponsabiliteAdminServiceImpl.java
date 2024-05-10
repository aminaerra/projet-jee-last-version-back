package ma.zs.budgetInstitut.service.impl.admin.mandat;


import ma.zs.budgetInstitut.bean.core.mandat.Responsabilite;
import ma.zs.budgetInstitut.dao.criteria.core.mandat.ResponsabiliteCriteria;
import ma.zs.budgetInstitut.dao.facade.core.mandat.ResponsabiliteDao;
import ma.zs.budgetInstitut.dao.specification.core.mandat.ResponsabiliteSpecification;
import ma.zs.budgetInstitut.service.facade.admin.mandat.ResponsabiliteAdminService;
import ma.zs.budgetInstitut.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetInstitut.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class ResponsabiliteAdminServiceImpl extends AbstractServiceImpl<Responsabilite, ResponsabiliteCriteria, ResponsabiliteDao> implements ResponsabiliteAdminService {








    public List<Responsabilite> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(Responsabilite.class, ResponsabiliteSpecification.class);
    }



    public ResponsabiliteAdminServiceImpl(ResponsabiliteDao dao) {
        super(dao);
    }

}
