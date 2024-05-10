package  ma.zs.budgetInstitut.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.budgetInstitut.ws.converter.commun.EmployeConverter;



import ma.zs.budgetInstitut.zynerator.util.StringUtil;
import ma.zs.budgetInstitut.zynerator.converter.AbstractConverter;
import ma.zs.budgetInstitut.zynerator.util.DateUtil;
import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin;
import ma.zs.budgetInstitut.ws.dto.commun.EntiteAdminDto;

@Component
public class EntiteAdminConverter extends AbstractConverter<EntiteAdmin, EntiteAdminDto> {

    @Autowired
    private EmployeConverter employeConverter ;
    private boolean chef;

    public  EntiteAdminConverter() {
        super(EntiteAdmin.class, EntiteAdminDto.class);
        init(true);
    }

    @Override
    public EntiteAdmin toItem(EntiteAdminDto dto) {
        if (dto == null) {
            return null;
        } else {
        EntiteAdmin item = new EntiteAdmin();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(this.chef && dto.getChef()!=null)
                item.setChef(employeConverter.toItem(dto.getChef())) ;




        return item;
        }
    }

    @Override
    public EntiteAdminDto toDto(EntiteAdmin item) {
        if (item == null) {
            return null;
        } else {
            EntiteAdminDto dto = new EntiteAdminDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(this.chef && item.getChef()!=null) {
                employeConverter.setEntiteAdmin(false);
                dto.setChef(employeConverter.toDto(item.getChef())) ;
                employeConverter.setEntiteAdmin(true);

            }


        return dto;
        }
    }

    public void copy(EntiteAdminDto dto, EntiteAdmin t) {
    super.copy(dto, t);
    if (dto.getChef() != null)
        employeConverter.copy(dto.getChef(), t.getChef());
    }



    public void initObject(boolean value) {
        this.chef = value;
    }


    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public boolean  isChef(){
        return this.chef;
    }
    public void  setChef(boolean chef){
        this.chef = chef;
    }
}
