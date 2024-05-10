package ma.zs.budgetInstitut.service.impl.admin.commun;


import ma.zs.budgetInstitut.bean.core.commun.Employe;
import ma.zs.budgetInstitut.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.budgetInstitut.dao.facade.core.commun.EmployeDao;
import ma.zs.budgetInstitut.dao.specification.core.commun.EmployeSpecification;
import ma.zs.budgetInstitut.service.facade.admin.commun.EmployeAdminService;
import ma.zs.budgetInstitut.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetInstitut.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.budgetInstitut.service.facade.admin.commun.EntiteAdminAdminService ;
import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin ;

import java.util.List;
@Service
public class EmployeAdminServiceImpl extends AbstractServiceImpl<Employe, EmployeCriteria, EmployeDao> implements EmployeAdminService {






    public void findOrSaveAssociatedObject(Employe t){
        if( t != null) {
            t.setEntiteAdmin(entiteAdminService.findOrSave(t.getEntiteAdmin()));
        }
    }

    public List<Employe> findByEntiteAdminId(Long id){
        return dao.findByEntiteAdminId(id);
    }
    public int deleteByEntiteAdminId(Long id){
        return dao.deleteByEntiteAdminId(id);
    }
    public long countByEntiteAdminId(Long id){
        return dao.countByEntiteAdminId(id);
    }






    public void configure() {
        super.configure(Employe.class, EmployeSpecification.class);
    }


    @Autowired
    private EntiteAdminAdminService entiteAdminService ;

    public EmployeAdminServiceImpl(EmployeDao dao) {
        super(dao);
    }

}
