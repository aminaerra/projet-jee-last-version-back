package ma.zs.budgetInstitut.service.impl.admin.commun;


import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin;
import ma.zs.budgetInstitut.dao.criteria.core.commun.EntiteAdminCriteria;
import ma.zs.budgetInstitut.dao.facade.core.commun.EntiteAdminDao;
import ma.zs.budgetInstitut.dao.specification.core.commun.EntiteAdminSpecification;
import ma.zs.budgetInstitut.service.facade.admin.commun.EntiteAdminAdminService;
import ma.zs.budgetInstitut.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetInstitut.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.budgetInstitut.service.facade.admin.commun.EmployeAdminService ;
import ma.zs.budgetInstitut.bean.core.commun.Employe ;

import java.util.List;
@Service
public class EntiteAdminAdminServiceImpl extends AbstractServiceImpl<EntiteAdmin, EntiteAdminCriteria, EntiteAdminDao> implements EntiteAdminAdminService {






    public void findOrSaveAssociatedObject(EntiteAdmin t){
        if( t != null) {
            t.setChef(employeService.findOrSave(t.getChef()));
        }
    }

    public List<EntiteAdmin> findByChefId(Long id){
        return dao.findByChefId(id);
    }
    public int deleteByChefId(Long id){
        return dao.deleteByChefId(id);
    }
    public long countByChefId(Long id){
        return dao.countByChefId(id);
    }

    public List<EntiteAdmin> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(EntiteAdmin.class, EntiteAdminSpecification.class);
    }


    @Autowired
    private EmployeAdminService employeService ;

    public EntiteAdminAdminServiceImpl(EntiteAdminDao dao) {
        super(dao);
    }

}
