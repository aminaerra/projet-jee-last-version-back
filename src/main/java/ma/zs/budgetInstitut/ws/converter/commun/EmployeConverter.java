package  ma.zs.budgetInstitut.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.budgetInstitut.ws.converter.commun.EntiteAdminConverter;



import ma.zs.budgetInstitut.zynerator.util.StringUtil;
import ma.zs.budgetInstitut.zynerator.converter.AbstractConverter;
import ma.zs.budgetInstitut.zynerator.util.DateUtil;
import ma.zs.budgetInstitut.bean.core.commun.Employe;
import ma.zs.budgetInstitut.ws.dto.commun.EmployeDto;

@Component
public class EmployeConverter extends AbstractConverter<Employe, EmployeDto> {

    @Autowired
    private EntiteAdminConverter entiteAdminConverter ;
    private boolean entiteAdmin;

    public  EmployeConverter() {
        super(Employe.class, EmployeDto.class);
        init(true);
    }

    @Override
    public Employe toItem(EmployeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Employe item = new Employe();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(this.entiteAdmin && dto.getEntiteAdmin()!=null)
                item.setEntiteAdmin(entiteAdminConverter.toItem(dto.getEntiteAdmin())) ;




        return item;
        }
    }

    @Override
    public EmployeDto toDto(Employe item) {
        if (item == null) {
            return null;
        } else {
            EmployeDto dto = new EmployeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(this.entiteAdmin && item.getEntiteAdmin()!=null) {
                entiteAdminConverter.setChef(false);
                dto.setEntiteAdmin(entiteAdminConverter.toDto(item.getEntiteAdmin())) ;
                entiteAdminConverter.setChef(true);

            }


        return dto;
        }
    }

    public void copy(EmployeDto dto, Employe t) {
    super.copy(dto, t);
    if (dto.getEntiteAdmin() != null)
        entiteAdminConverter.copy(dto.getEntiteAdmin(), t.getEntiteAdmin());
    }



    public void initObject(boolean value) {
        this.entiteAdmin = value;
    }


    public EntiteAdminConverter getEntiteAdminConverter(){
        return this.entiteAdminConverter;
    }
    public void setEntiteAdminConverter(EntiteAdminConverter entiteAdminConverter ){
        this.entiteAdminConverter = entiteAdminConverter;
    }
    public boolean  isEntiteAdmin(){
        return this.entiteAdmin;
    }
    public void  setEntiteAdmin(boolean entiteAdmin){
        this.entiteAdmin = entiteAdmin;
    }
}
