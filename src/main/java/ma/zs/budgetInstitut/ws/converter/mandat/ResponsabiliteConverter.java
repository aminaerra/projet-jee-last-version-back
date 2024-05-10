package  ma.zs.budgetInstitut.ws.converter.mandat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.budgetInstitut.zynerator.util.StringUtil;
import ma.zs.budgetInstitut.zynerator.converter.AbstractConverter;
import ma.zs.budgetInstitut.zynerator.util.DateUtil;
import ma.zs.budgetInstitut.bean.core.mandat.Responsabilite;
import ma.zs.budgetInstitut.ws.dto.mandat.ResponsabiliteDto;

@Component
public class ResponsabiliteConverter extends AbstractConverter<Responsabilite, ResponsabiliteDto> {


    public  ResponsabiliteConverter() {
        super(Responsabilite.class, ResponsabiliteDto.class);
    }

    @Override
    public Responsabilite toItem(ResponsabiliteDto dto) {
        if (dto == null) {
            return null;
        } else {
        Responsabilite item = new Responsabilite();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());



        return item;
        }
    }

    @Override
    public ResponsabiliteDto toDto(Responsabilite item) {
        if (item == null) {
            return null;
        } else {
            ResponsabiliteDto dto = new ResponsabiliteDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
